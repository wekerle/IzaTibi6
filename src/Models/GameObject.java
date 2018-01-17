package Models;


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
    protected int currentX,currentY,currentI,currentJ;

    public void setGameSession(GameSession gameSession) 
    {
        this.gameSession = gameSession;
    }

    public int getCurrentX() 
    {
        return currentX;
    }

    public void setCurrentX(int currentX) 
    {
        this.currentX = currentX;
    }
    
    public int getCurrentI() 
    {
        return currentI;
    }

    public void setCurrentI(int currentI) 
    {
        this.currentI = currentI;
    }
    
    public int getCurrentJ() 
    {
        return currentJ;
    }

    public void setCurrentJ(int currentJ) 
    {
        this.currentJ = currentJ;
    }

    public int getCurrentY() 
    {
        return currentY;
    }

    public void setCurrentY(int currentY) 
    {
        this.currentY = currentY;
    }
    
    public abstract Image getImage();
}
