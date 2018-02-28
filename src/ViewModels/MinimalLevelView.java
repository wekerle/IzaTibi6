/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import Listeners.LevelSelectedEventListener;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 *
 * @author tibor.wekerle
 */
public class MinimalLevelView extends HBox{
    private int levelNumber;
    private LevelSelectedEventListener levelSelectedEvent=null;
    private boolean denied=false;

    public void setLevelSelectedEventListener(LevelSelectedEventListener levelSelectedEvent) 
    {
        this.levelSelectedEvent = levelSelectedEvent;
    }
    
    public MinimalLevelView(int levelNumber,int maxSolvedLevel,int currentI, int currentJ)
    {
        this.levelNumber=levelNumber;
        populateContent(maxSolvedLevel,currentI,currentJ);
        
        this.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                if(!denied)
                {
                    MinimalLevelView.this.levelSelectedEvent.levelSelected(levelNumber);
                }              
            }
        });
    }
    
    private void populateContent(int maxSolvedLevel,int currentI, int currentJ)
    {        
        this.setAlignment(Pos.CENTER);       
       
        Image image=new Image("/img/poza.jpg");
        ImageView imageView=new ImageView(image);
        double width=image.getWidth()/3;
        double height=image.getHeight()/3;
        Rectangle2D rectangle=new Rectangle2D(currentJ * width, currentI * height, width, height);
        imageView.setViewport(rectangle);
        
        if(maxSolvedLevel>this.levelNumber)
        {
        }else if(maxSolvedLevel==this.levelNumber)
        {
            imageView.setOpacity(0.3);
        }else
        {
            imageView=new ImageView(new Image("/img/denied.png"));
            denied=true;
        }
                
        this.getChildren().add(imageView);
    }
}
