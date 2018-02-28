/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import Helpers.Enums;
import Listeners.LevelFinishedEventListener;
import Models.GameObject;
import Models.GameSession;
import Models.Goal;
import Models.Heart;
import Models.MainActor;
import Models.Wall;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.animation.Animation;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 *
 * @author tibor.wekerle
 */
public class GameSessionView extends VBox{
    private GridPane grid=new GridPane();
    private int height=0,width;
    private GameSession gameSession=null;
    private HashMap<GameObject,ImageView> gameObjectImageViewMap=new HashMap<GameObject,ImageView>();
    private ArrayList<Goal> goals=new ArrayList<Goal>();
    private ParallelTransition parallelTransition = new ParallelTransition();
    private LevelFinishedEventListener levelFinishedEvent=null;
    
    public void setLevelFinishedEventListener(LevelFinishedEventListener levelFinishedEvent) 
    {
        this.levelFinishedEvent = levelFinishedEvent;
    }
            
    public GameSessionView(GameSession gameSession)
    {
        this.gameSession=gameSession;
        populateContent();
        
        grid.setFocusTraversable(true);
        grid.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent event) 
            {
                if(parallelTransition.getStatus()==Animation.Status.STOPPED)
                {
                    Helpers.Enums.Direction direction=null;
                    if (event.getCode() == KeyCode.DOWN) 
                    {
                        direction=Enums.Direction.Le;
                    }
                    if (event.getCode() == KeyCode.UP) 
                    {
                        direction=Enums.Direction.Fel;
                    }
                    if (event.getCode() == KeyCode.LEFT) 
                    {
                        direction=Enums.Direction.Balra;
                    }
                    if (event.getCode() == KeyCode.RIGHT) 
                    {
                        direction=Enums.Direction.Jobbra;
                    }
                    if(direction !=null)
                    {                        
                        GameSessionView.this.simulateNextStepOnView(direction);                   
                    }
                }                
            }
        });
    }   
        
    private void populateContent()
    {
        height=gameSession.getHeight();
        width=gameSession.getWidth();
        
        for(int i=0;i<height;i++)
        {
            for(int j=0;j<width;j++)
            {                
                ImageView imageView = new ImageView();
                GameObject gameObject=gameSession.getGameObjectAt(i, j);
                
                if(gameObject!=null)
                {
                    imageView.setImage(gameSession.getGameObjectAt(i, j).getImage());                   
                }
                                
                grid.add(imageView,j,i);
                gameObjectImageViewMap.put(gameObject, imageView);
                if(gameObject instanceof Goal){
                    goals.add((Goal)gameObject);
                    imageView.toBack();
                }
            }
        }

        this.getChildren().add(grid);       
    }
    
    private void simulateNextStepOnView(Enums.Direction direction)
    {
        GameObject mainActor=gameSession.getMainActor();
        ImageView mainActorImageView=gameObjectImageViewMap.get(mainActor);
        mainActorImageView.toFront();
        
        GameObject neighbor = mainActor.getNeighbor(direction);
        
        parallelTransition=new ParallelTransition();
        if(!(neighbor instanceof Wall)){
            if(neighbor instanceof Goal){
                Goal goal=((Goal)(neighbor));
                if(goal.getObject()!=null){
                    GameObject secondNeighbor = neighbor.getNeighbor(direction);
                    if(!(secondNeighbor instanceof Wall) && !(secondNeighbor instanceof Heart)&& !(secondNeighbor instanceof Goal && ((Goal)(secondNeighbor)).getObject()!=null)){
                        parallelTransition.getChildren().add(getTranslateTransition(direction, goal.getObject()));
                        parallelTransition.getChildren().add(getTranslateTransition(direction, mainActor)); 
                    }
                }else{
                    parallelTransition.getChildren().add(getTranslateTransition(direction, mainActor));
                }
            }else if(neighbor instanceof Heart){
                GameObject secondNeighbor = neighbor.getNeighbor(direction);
                if(!(secondNeighbor instanceof Wall) && !(secondNeighbor instanceof Heart) && !(secondNeighbor instanceof Goal && ((Goal)(secondNeighbor)).getObject()!=null)){
                    parallelTransition.getChildren().add(getTranslateTransition(direction, neighbor));
                    parallelTransition.getChildren().add(getTranslateTransition(direction, mainActor));
                }
            }else{
                parallelTransition.getChildren().add(getTranslateTransition(direction, mainActor));
            }          
        }
        
       parallelTransition.play();       
       parallelTransition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                checkWin();
            }
        });
    }
    
    private TranslateTransition getTranslateTransition(Enums.Direction direction, GameObject object){
        ImageView objectImageView=gameObjectImageViewMap.get(object);
        TranslateTransition translateTransition =new TranslateTransition(Duration.millis(100),objectImageView);
            int newI=object.getCurrentI();
            int newJ=object.getCurrentJ();
            switch(direction){
               case Le: 
                    translateTransition.setByY(50);
                    newI++;
                   break;
               case Fel: 
                   translateTransition.setByY(-50);
                   newI--;
                   break;
               case Jobbra: 
                   translateTransition.setByX(50);
                   newJ++;
                   break;
               case Balra: 
                   translateTransition.setByX(-50);
                   newJ--;
                   break;
           }
            
        this.gameSession.simulateMoveOnSession(object,newI,newJ);  
        object.setCurrentI(newI);
        object.setCurrentJ(newJ);
        translateTransition.setCycleCount(1);
         
         return translateTransition;
    }
        
    private void checkWin()
    {
        boolean result=true;
        for(Goal item:goals){
            if(item.getObject()==null || item.getObject() instanceof MainActor){
                result=false;
            }
        }
        if(result)
        {
            levelFinishedEvent.levelFinished(this.gameSession.getLevelNumber());
        }
    }   
}
