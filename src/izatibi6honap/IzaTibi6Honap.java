/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izatibi6honap;

import Listeners.LevelFinishedEventListener;
import Listeners.LevelSelectedEventListener;
import Models.AplicationModel;
import Models.GameSession;
import Models.LevelModel;
import ViewModels.GameSessionView;
import ViewModels.MinimalLevelView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author tibor.wekerle
 */
public class IzaTibi6Honap extends Application implements LevelSelectedEventListener,LevelFinishedEventListener {
    
    private BorderPane borderPane = new BorderPane();
    private AplicationModel aplicationModel=new AplicationModel();
    private Scene scene=new Scene(borderPane);
    private Stage stage=null;
    public static final int FINAL_LEVEL_NR=30;
    
    @Override
    public void start(Stage primaryStage) 
    {
        DataCollector dataCollector=new DataCollector();
        aplicationModel.setLevels(dataCollector.getLevels());
        
        MenuBar menuBar=createMenu();       
        borderPane.setTop(menuBar);  
        //levelFinished(30);
        borderPane.setCenter(getContent());
        stage=primaryStage;
    
        scene.getStylesheets().add("Styling/styles.css");
                                                     
        primaryStage.setWidth(825);
        primaryStage.setHeight(700);
        
        primaryStage.setTitle("Iza & Tibi");
        primaryStage.setScene(scene);
        primaryStage.show();                
    }    
    /**
     * @param args the command line arguments
     */
         
    public static void main(String[] args)throws Exception 
    {
        launch(args);
    }
    
    
    private MenuBar createMenu()
    { 
        MenuBar menuBar = new MenuBar();
 
        // --- Menu File
        Menu menuFile = new Menu("Menu");
        
        MenuItem homeMenuItem = new MenuItem("Home");
        MenuItem loadMenuItem = new MenuItem("Load");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem exitMenuItem = new MenuItem("Exit");
        exitMenuItem.setOnAction(actionEvent ->
                stage.fireEvent(
                        new WindowEvent(
                                stage,
                                WindowEvent.WINDOW_CLOSE_REQUEST
                        )
                ));

        menuFile.getItems().addAll(homeMenuItem,loadMenuItem, saveMenuItem,
        new SeparatorMenuItem(), exitMenuItem);
        
        homeMenuItem.setOnAction(actionEvent -> clickHome());
        saveMenuItem.setOnAction(actionEvent -> clickSave());
        loadMenuItem.setOnAction(actionEvent -> clickLoad());
                      
        menuBar.getMenus().addAll(menuFile);
                  
        return menuBar;

    }
    
    private void clickHome()
    {                  
        start(stage);      
    }
    
    private void renderLevel(GameSession gameSession)
    {
        GameSessionView gameSessionView=new GameSessionView(gameSession);
        gameSessionView.setLevelFinishedEventListener(this);
        borderPane.setCenter(gameSessionView);      
    }
    
     private void clickSave()
     {       
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Game");

        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("ser", "*.ser")
        );

        File file = fileChooser.showSaveDialog(stage);
        if (file != null) 
        {
            try 
            {
                String path=file.getPath();

                FileOutputStream fileOut = new FileOutputStream(path);
                                
                ObjectOutputStream fileOutStream = new ObjectOutputStream(fileOut);
                              
                fileOutStream.writeObject(aplicationModel);
                fileOutStream.close();
                
                fileOut.close();              
                
            } catch (IOException ex) 
            {
                System.out.println(ex.getMessage());
            }
        }      
    }
     
    private void clickLoad()
    {       
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load Game");

        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("ser", "*.ser")
        );
        File file = fileChooser.showOpenDialog(stage);
        
        if(file!=null)
        {
            this.aplicationModel=fileToAplicationModel(file.getPath()); 
        } 
        start(stage);
    }
    
    private AplicationModel fileToAplicationModel(String path)
    {
        try
        {
           FileInputStream fileIn = new FileInputStream(path);
           ObjectInputStream in = new ObjectInputStream(fileIn);
           aplicationModel = (AplicationModel) in.readObject();

           in.close();
           fileIn.close();
           return aplicationModel;
        }catch(IOException i)
        {
           i.printStackTrace();
           return null;
        }catch(ClassNotFoundException c)
        {
           c.printStackTrace();
           return null;
        }
    }
        
    private GridPane getContent() 
    {
        GridPane grid = new GridPane();  
        
        int i=0;
        int j=0;
        for(LevelModel level :aplicationModel.getLevels())
        {
            MinimalLevelView minimalLevel= new MinimalLevelView(level.getLevelId(), level.getLevelNumber(),aplicationModel.getMaxSolvedLevel());
            minimalLevel.setLevelSelectedEventListener(this);
            grid.add(minimalLevel,j,i);

            j++;
            if(j==3)
            {
                i++;
                j=0;
            }
        }  
                
       // grid.setHgap(25);
       // grid.setVgap(25);
        grid.setPadding(new Insets(20, 10, 10, 50));
        return grid;
    }

    @Override
    public void levelSelected(int levelNr) 
    {
        if(levelNr==0)
        {
            start(stage);
        }else
        {
            LevelModel level=aplicationModel.getLevelByNr(levelNr);
            GameSession gameSession=new GameSession(level);
            renderLevel(gameSession);
        }       
    }

    @Override
    public void levelFinished(int levelNr) {
        
        if(this.aplicationModel.getMaxSolvedLevel()<levelNr+1)
        {
            this.aplicationModel.setMaxSolvedLevel(levelNr+1);
        }
        /*FinishLevelView finishLevelView=new FinishLevelView(levelNr);
        finishLevelView.setLevelSelectedEventListener(this);
        borderPane.setCenter(finishLevelView);*/
    }    
}
