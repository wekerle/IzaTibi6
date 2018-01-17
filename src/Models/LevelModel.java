/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author tibor.wekerle
 */
public class LevelModel implements Serializable{
    private String[][] matrix;
    private int levelNumber;
    private int levelId;
    
    public LevelModel(String[][] matrix,int levelNumber, int levelId)
    {
        this.matrix=matrix;
        this.levelNumber=levelNumber;
        this.levelId=levelId;
    }

    public String[][] getMatrix() 
    {
        return matrix;
    }

    public int getLevelId() 
    {
        return levelId;
    }

    public int getLevelNumber() 
    {
        return levelNumber;
    }   
}
