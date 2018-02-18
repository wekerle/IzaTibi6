package Models;

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
                //w -fal       
                //i -iza
                //t- tibi
                //h -sziv
                //g -cel
                
                GameObject gameObject=null;                
                switch(matrix[i][j])
                {
                    case "w":
                        gameObject=new Wall();
                        break;
                    case "h":
                        gameObject=new Heart();
                        break;
                    case "g":
                        gameObject=new Goal();
                        break;
                    case "t":
                    case "i":
                        gameObject=new MainActor(matrix[i][j]);
                        this.mainActor=(MainActor)gameObject;
                        break;                   
                    case " ":
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
    
    public void simulateMoveOnSession(GameObject gameObject,int newI,int newJ)
    {
        int i=gameObject.getCurrentI();
        int j=gameObject.getCurrentJ();
        GameObject temp=objects[newI][newJ];
        if(temp instanceof Air && objects[i][j] instanceof Goal){
            objects[newI][newJ]=gameObject;
            ((Goal)objects[i][j]).setObject(null);
        }else if(temp instanceof Goal){
            ((Goal)temp).setObject(gameObject);
            if(!(objects[i][j] instanceof Goal)){
                objects[i][j]=new Air();
            }else{
                ((Goal)objects[i][j]).setObject(null);
            }          
        }else{
            if(objects[i][j] instanceof Goal){
                objects[newI][newJ]=gameObject;
            }else{
                objects[newI][newJ]=objects[i][j];
                objects[i][j]=temp;
            }
        }
    } 

    public void addObject(GameObject object) {
        objects[object.currentI][object.currentJ]=object;
    }
}      
