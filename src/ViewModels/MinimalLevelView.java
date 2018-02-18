/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import Listeners.LevelSelectedEventListener;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author tibor.wekerle
 */
public class MinimalLevelView extends HBox{
    private int levelId;
    private int levelNumber;
    private LevelSelectedEventListener levelSelectedEvent=null;

    public void setLevelSelectedEventListener(LevelSelectedEventListener levelSelectedEvent) 
    {
        this.levelSelectedEvent = levelSelectedEvent;
    }
    
    public MinimalLevelView(int levelId,int levelNumber,int maxSolvedLevel)
    {
        this.levelId=levelId;
        this.levelNumber=levelNumber;
        populateContent(maxSolvedLevel);
        
        this.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                if(!MinimalLevelView.this.getStyleClass().contains("disabledMinimalLevelView"))
                {
                    MinimalLevelView.this.levelSelectedEvent.levelSelected(levelId);
                }              
            }
        });
    }
    
    private void populateContent(int maxSolvedLevel)
    {        
        Text levelNumberText=new Text(Integer.toString(levelNumber));
        levelNumberText.setFont(Font.font("TimesNewRoman",FontWeight.BOLD,40));
        this.setAlignment(Pos.CENTER);
        
        ImageView imageView=null;
        if(maxSolvedLevel>this.levelNumber)
        {
           // imageView=new ImageView(new Image("/img/check.png"));
            imageView=new ImageView(new Image("/img/ocean.jpg"));
            this.getStyleClass().add("minimalLevelView");
        }else if(maxSolvedLevel==this.levelNumber)
        {
            //imageView=new ImageView(new Image("/img/current.png"));
            imageView=new ImageView(new Image("/img/ocean.jpg"));
            this.getStyleClass().add("minimalLevelView");
            imageView.setOpacity(0.3);
        }else
        {
            imageView=new ImageView(new Image("/img/denied.png"));
          //  this.getStyleClass().add("disabledMinimalLevelView");
        }
                
        this.getChildren().add(imageView);
        //this.getChildren().add(levelNumberText);
    }
}
