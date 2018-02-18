package Models;


import Helpers.Enums;
import javafx.scene.image.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronaldo
 */
public abstract class GameObject
{
    protected GameSession gameSession=null;
    protected int currentI,currentJ;

    public void setGameSession(GameSession gameSession) 
    {
        this.gameSession = gameSession;
    }
    
    public int getCurrentI() 
    {
        return currentI;
    }

    public void setCurrentI(int newI) 
    {
        this.currentI = newI;
    }
    
    public int getCurrentJ() 
    {
        return currentJ;
    }

    public void setCurrentJ(int newJ) 
    {
        this.currentJ = newJ;
    }
    
    public GameObject getNeighbor(Enums.Direction direction)
    {       
        int tempI=this.currentI,tempJ=this.currentJ;
        switch(direction)
        {
            case Fel:
                tempI--;
                break;
            case Le:
                tempI++;
                break;
            case Jobbra:
                tempJ++;
                break;
            case Balra:
                tempJ--;
                break;
        }
        
        return gameSession.getGameObjectAt(tempI,tempJ);
    }
    
    public abstract Image getImage();
}
