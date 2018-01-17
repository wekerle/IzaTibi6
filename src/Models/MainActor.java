/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Helpers.Enums;
import static java.lang.Math.abs;
import javafx.scene.image.Image;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import static java.lang.Math.abs;

/**
 *
 * @author tibor.wekerle
 */
public class MainActor extends GameObject{

    private Image image=null;
    private Path path= null;
    private int numberOfStepsInPath=0;
    
    public MainActor(String cod)
    {
        switch(cod)
        {
            case "t":
                image=new Image("/img/szabi.png");
                break;
            case "i":
                image=new Image("/img/denia.png");
                break;
        }
    }
    
    @Override
    public Image getImage() 
    {
        return image;
    }
    
    public int getNumberOfStepsI(Enums.Direction direction, int iPos, int jPos) 
    {
        int tempI=iPos;
        int numberOfSteps=0;
        GameObject neighbor=null;
        
        switch(direction)
        {
            case Jobbra:
            case Balra:
                break;
            case Fel:                 
              /*  neighbor=getNeighbor(direction, tempI, jPos);
                while(!(neighbor instanceof Wall)&&!(neighbor instanceof Ladder) && neighbor!=null)
                {   
                    tempI--;
                    numberOfSteps--;
                    neighbor=getNeighbor(direction, tempI, jPos);
                }
                
                if(neighbor instanceof Wall)
                {
                  if(((Wall)neighbor).getCode().compareTo("wq")==0 || ((Wall)neighbor).getCode().compareTo("wp")==0)
                    {
                        numberOfSteps--;
                    }  
                }
                if(neighbor instanceof Ladder)
                {
                    numberOfSteps--;
                }
                break;*/
            case Le:
                neighbor=getNeighbor(direction, tempI, jPos);
                /*while(!(neighbor instanceof Wall)&&!(neighbor instanceof Ladder)&& neighbor!=null)
                {                    
                    tempI++;
                    numberOfSteps++;
                    neighbor=getNeighbor(direction, tempI, jPos);
                }
                
                if(neighbor instanceof Wall)
                {
                   if(((Wall)neighbor).getCode().compareTo("wd")==0 || ((Wall)neighbor).getCode().compareTo("wb")==0)
                    {
                        numberOfSteps++;
                    } 
                }
                if(neighbor instanceof Ladder)
                {
                    numberOfSteps++;
                }
                break;*/
        }
        return numberOfSteps;
    }

    public int getNumberOfStepsJ(Enums.Direction direction, int iPos, int jPos)
    {
        int tempJ=jPos;
        int numberOfSteps=0;
        GameObject neighbor=null;
        
        switch(direction)
        {
            case Fel:
            case Le:
                break;
            case Jobbra:                 
              /*  neighbor=getNeighbor(direction, iPos, tempJ);
                while(!(neighbor instanceof Wall)&&!(neighbor instanceof Ladder)&& neighbor!=null)
                {                                       
                    tempJ++;
                    numberOfSteps++;
                    neighbor=getNeighbor(direction, iPos, tempJ);
                }
                
                if(neighbor instanceof Wall)
                {
                   if(((Wall)neighbor).getCode().compareTo("wd")==0 || ((Wall)neighbor).getCode().compareTo("wq")==0)
                    {
                        numberOfSteps++;
                    } 
                }
                if(neighbor instanceof Ladder)
                {
                    numberOfSteps++;
                }                
                break;*/
            case Balra:
                neighbor=getNeighbor(direction, iPos, tempJ);
               /* while(!(neighbor instanceof Wall)&&!(neighbor instanceof Ladder)&& neighbor!=null)
                {                                        
                    tempJ--;
                    numberOfSteps--;                    
                    neighbor=getNeighbor(direction, iPos, tempJ);
                }
                
                if(neighbor instanceof Wall)
                {
                    if(((Wall)neighbor).getCode().compareTo("wb")==0 || ((Wall)neighbor).getCode().compareTo("wp")==0)
                    {
                        numberOfSteps--;
                    }
                } 
                if(neighbor instanceof Ladder)
                {
                    numberOfSteps--;
                }
                break;*/
        }
        return numberOfSteps;
    }
    
    protected GameObject getNeighbor(Enums.Direction direction,int i,int j)
    {       
        switch(direction)
        {
            case Fel:
                i--;
                break;
            case Le:
                i++;
                break;
            case Jobbra:
                j++;
                break;
            case Balra:
                j--;
                break;
        }
        
        return gameSession.getGameObjectAt(i,j);
    }
    
    public Path constructPath(Helpers.Enums.Direction direction)
    {
        if(this.path==null)
        {
            this.path=new Path(new MoveTo(this.getCurrentX(),this.getCurrentY()));
        }
        
        int numberOfStepsI=getNumberOfStepsI(direction, this.currentI, this.currentJ);
        int numberOfStepsJ=getNumberOfStepsJ(direction, this.currentI, this.currentJ);
        
        numberOfStepsInPath=numberOfStepsInPath+abs(numberOfStepsI)+abs(numberOfStepsJ);
        
        if(numberOfStepsJ !=0 && (direction==Enums.Direction.Balra || direction==Enums.Direction.Jobbra))
        {
            this.path.getElements().add(new LineTo(this.getCurrentX()+numberOfStepsJ*50,this.getCurrentY()));

            this.setCurrentX(this.getCurrentX()+numberOfStepsJ*50);
            this.setCurrentJ(this.getCurrentJ()+numberOfStepsJ);
        }else if(numberOfStepsI !=0 && (direction==Enums.Direction.Fel || direction==Enums.Direction.Le))
        {
            this.path.getElements().add(new LineTo(this.getCurrentX(),this.getCurrentY()+numberOfStepsI*50));
           
            this.setCurrentY(this.getCurrentY()+numberOfStepsI*50);
            this.setCurrentI(this.getCurrentI()+numberOfStepsI);
        }
        
        GameObject gameObject=gameSession.getGameObjectAt(currentI, currentJ);
       /* if(gameObject instanceof Wall)
        {
            Helpers.Enums.Direction newDirection=getNewDirection(direction,((Wall) gameObject).getCode());
            if(newDirection!=null)
            {
                constructPath(newDirection);
            }
        }*/
        return this.path;
    }
    
    public void destroyPath()
    {
        this.path=null;
        this.numberOfStepsInPath=0;
    }
    
    public int numberOfStepsInPath()
    {
        return this.numberOfStepsInPath;
    }
}
