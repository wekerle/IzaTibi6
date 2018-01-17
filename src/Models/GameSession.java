package Models;

import javafx.scene.shape.Path;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronaldo
 */
public class GameSession 
{
    private GameObject[][] objects=null;
    private int levelNumber;
    private MainActor mainActor=null;
        
    public int getLevelNumber() 
    {
        return levelNumber;
    }
    
    public GameSession(LevelModel level)
    {
        this.levelNumber=level.getLevelNumber();
        String[][] matrix=level.getMatrix();
        int height=matrix.length;
        int width=matrix[0].length;
        objects=new GameObject[height][width];
                
        int i=0,j=0;
        for(i=0;i<height;i++)
        {
            for(j=0;j<width;j++)
            {
                //ww -fal       
                //wb -felfal fentball
                //wd -felfal fentjobb
                //wp -felfal lentball
                //wq -felfal lentjobb
                //"  " -levego
                //sz -szabi
                //de -denia

                //fp -festekVederPiros
                //fz -festekVederZold
                //fk -festekVederKek
                //fl -festekVederLila
                //ff -festekVederFekete

                //ps -pirosSziv
                //zs -zoldSziv
                //ks -kekSziv
                //ls -lilaSziv
                //fs -feketeSziv

                //ns -nagySziv
                //la -lajtorja
                
                GameObject gameObject=null;                
                switch(matrix[i][j])
                {
                    case "ww":
                    case "wb":
                    case "wd":
                    case "wp":    
                    case "wq":
                        gameObject=new Wall(matrix[i][j]);
                        break;
                    case "ps":
                    case "zs":
                    case "ks":
                    case "ls":    
                    case "fs":
                        gameObject=new Heart(matrix[i][j]);
                        break;
                    case "de":
                    case "sz":
                        gameObject=new MainActor(matrix[i][j]);
                        this.mainActor=(MainActor)gameObject;
                        this.mainActor.setCurrentX(25);
                        this.mainActor.setCurrentY(25);
                        break;                   
                    case "  ":
                        gameObject=new Air();
                        break;
                }
                objects[i][j]=gameObject;
                gameObject.currentI=i;
                gameObject.currentJ=j;
                gameObject.setGameSession(this);
            }
        }
    }
    
    public int getWidth()
    {
        return objects[0].length;
    }
    
    public int getHeight()
    {
       return objects.length;
    }
    
    public GameObject getGameObjectAt(int x,int y)
    {
        return objects[x][y];
    }
        
    public MainActor getMainActor()
    {
        return mainActor;
    }
    
    public void simulateNextStepOnSession(int numberStepsI,int numberStepsJ,Helpers.Enums.Direction direction)
    {
        if(numberStepsI==0 && numberStepsJ==0)
        {
            return;
        }
        int i=mainActor.getCurrentI();
        int j=mainActor.getCurrentJ();
        GameObject temp=objects[i][j];
        objects[i][j]=objects[i+numberStepsI][j+numberStepsJ];
        objects[i+numberStepsI][j+numberStepsJ]=temp;
    }
        
    public Path constrcutPath(Helpers.Enums.Direction direction)
    {
        return mainActor.constructPath(direction);
    }
}
