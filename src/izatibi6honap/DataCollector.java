/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izatibi6honap;

import Models.LevelModel;
import java.util.ArrayList;


//loveercase es trim a similarty setbe
//test similarity
/**
 *
 * @author Ronaldo
 */
public class DataCollector
{
    private ArrayList<LevelModel> levels=new ArrayList<LevelModel>();
    
    public DataCollector()
    {
        constructLevels();
        //w -fal       
        //i -iza
        //t- tibi
        //h -sziv
        //g -cel
        
    }
    
    private void constructLevels()
    {
        String[][] matrix1={
            //11x9
            {" "," "," "," "," "," ","w","w","w","w","w","w","w","w"," "," "," "},
            {" "," "," "," ","w","w","w"," "," ","i"," "," "," ","w"," "," "," "},
            {" "," "," "," ","w"," "," "," ","h"," ","h","w"," ","w"," "," "," "},
            {" "," "," "," ","w"," ","w"," "," ","w"," ","w"," ","w"," "," "," "},
            {" "," "," "," ","w"," ","w","w"," ","w"," ","w"," ","w"," "," "," "},
            {" "," "," "," ","w"," "," "," ","g","g","g","g","g","w"," "," "," "},
            {" "," "," "," ","w"," ","w"," ","h","w","h","w","h","w"," "," "," "},
            {" "," "," "," ","w"," ","w","w"," ","w"," ","w"," ","w"," "," "," "},
            {" "," "," "," ","w"," ","w","w"," ","w"," ","w"," ","w"," "," "," "},
            {" "," "," "," ","w"," "," "," "," "," "," "," "," ","w"," "," "," "},
            {" "," "," "," ","w","w","w","w","w","w","w","w","w","w"," "," "," "},
        };
        LevelModel level1=new LevelModel(matrix1, 1, 1);
        levels.add(level1);
        
        String[][] matrix2={
            //11x7
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","zs","zs","zs","zs","zs","zs","zs","zs","de","ww"},
            {"ww","zs","  ","  ","  ","ns","  ","  ","  ","la","ww"},
            {"ww","zs","  ","  ","  ","ns","  ","  ","  ","la","ww"},
            {"ww","zs","  ","  ","  ","ns","  ","  ","  ","la","ww"},
            {"ww","wb","  ","  ","  ","fz","  ","  ","  ","la","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level2=new LevelModel(matrix2, 2, 2);
        levels.add(level2);
        
        String[][] matrix3={
            //15x11
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","wp","ps","ps","ps","ps","ps","ww","ps","ps","ps","ps","ps","wq","ww"},
            {"  ","ps","  ","ww","ww","ww","ww","ww","ww","ww","ww","ww","  ","ps","  "},
            {"ww","wb","ps","ps","ps","ps","ps","la","ps","ps","ps","ps","ps","wd","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ns","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","sz","  ","  ","fp","  ","  ","la","  ","  ","fk","  ","  ","ns","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ns","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","wp","ks","ks","ks","ks","ks","la","ks","ks","ks","ks","ks","wq","ww"},
            {"  ","ks","  ","ww","ww","ww","ww","ww","ww","ww","ww","ww","  ","ks","  "},
            {"ww","wb","ks","ks","ks","ks","ks","ww","ks","ks","ks","ks","ks","wd","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level3=new LevelModel(matrix3, 3, 3);
        levels.add(level3);
        
        String[][] matrix4={           
            //9x11
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","la","  ","  ","fl","  ","  ","la","ww"},
            {"  ","la","  ","wq","ww","wp","  ","la","  "},
            {"ww","la","  ","ls","ls","ls","  ","la","ww"},
            {"ww","la","ls","ls","ls","ls","ls","la","ww"},
            {"ww","la","ls","ls","ns","ls","ls","la","ww"},
            {"ww","la","ls","ls","ls","ls","ls","la","ww"},
            {"ww","la","  ","ls","ls","ls","  ","la","ww"},
            {"  ","la","ns","wd","ww","wb","ns","la","  "},
            {"ww","la","  ","  ","de","  ","  ","la","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level4=new LevelModel(matrix4, 4, 4);
        levels.add(level4);
        
        String[][] matrix5={
            //9x9
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","ns","  ","  ","  ","la","  ","fp","ww"},
            {"ww","  ","ww","ps","ww","zs","ww","  ","ww"},
            {"ww","  ","ps","ps","ns","zs","zs","la","ww"},
            {"ww","ps","ww","ps","ww","zs","ww","zs","ww"},
            {"ww","la","ps","ps","ns","zs","zs","  ","ww"},
            {"ww","  ","ww","ps","ww","zs","ww","  ","ww"},
            {"ww","fz","  ","la","  ","  ","  ","sz","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level5=new LevelModel(matrix5, 5, 5);
        levels.add(level5);
        
        String[][] matrix6={
            //13x11
            {"  ","  ","  ","  ","ww","ww","ww","ww","ww","  ","  ","  ","  "},
            {"  ","  ","  ","ww","ww","ns","la","ns","ww","ww","  ","  ","  "},
            {"  ","  ","ww","ww","ww","ww","  ","ww","ww","ww","ww","  ","  "},
            {"  ","ww","ps","ps","ps","ww","  ","ww","ks","ks","ks","ww","  "},
            {"ww","ps","ps","ps","ps","ww","  ","ww","ks","ks","ks","ks","ww"},
            {"ww","ps","ps","fp","ps","  ","la","  ","ks","fk","ks","ks","ww"},
            {"ww","ww","ww","ww","ww","  ","de","  ","ww","ww","ww","ww","ww"},
            {"ww","zs","zs","zs","zs","  ","la","  ","ls","ls","ls","ls","ww"},
            {"ww","zs","zs","zs","zs","ww","ns","ww","ls","ls","ls","ls","ww"},
            {"  ","ww","zs","fz","zs","ww","ww","ww","ls","fl","ls","ww","  "},
            {"  ","  ","ww","ww","ww","ww","ww","ww","ww","ww","ww","  ","  "},
        };
        LevelModel level6=new LevelModel(matrix6, 6, 6);
        levels.add(level6);
        
        String[][] matrix7={
            //17x12
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","wp","ks","ks","ks","  ","  ","  ","la","  ","  ","  ","ls","ls","ls","wq","ww"},
            {"ww","wb","ks","ks","ks","wq","ww","wb","  ","wd","ww","wp","ls","ls","ls","wd","ww"},
            {"ww","fk","wq","wp","  ","  ","wq","ww","  ","ww","wp","  ","  ","wq","wp","fl","ww"},
            {"ww","  ","  ","  ","  ","  ","  ","ww","  ","ww","  ","  ","  ","  ","  ","  ","ww"},
            {"ww","ks","ns","ks","wp","ks","wd","wp","  ","wq","wb","ls","wq","ls","ns","ls","ww"},
            {"ww","ks","  ","ks","  ","ks","ww","  ","  ","  ","ww","ls","  ","ls","  ","ls","ww"},
            {"ww","ks","wd","ks","wb","ks","wq","wb","ns","wd","wp","ls","wd","ls","wb","ls","ww"},
            {"ww","  ","wp","  ","wq","  ","  ","wq","  ","wp","  ","  ","wp","  ","wq","  ","ww"},
            {"ww","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","ww"},
            {"ww","wb","ks","ks","ks","wd","wb","  ","sz","  ","wd","wb","ls","ls","ls","wd","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level7=new LevelModel(matrix7, 7, 7);
        levels.add(level7);
        
        String[][] matrix8={
            //17x8
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","wp","  ","fp","  ","fz","  ","wq","ww","wp","  ","fk","  ","fl","  ","wq","ww"},
            {"ww","  ","  ","la","  ","la","  ","  ","de","  ","  ","la","  ","la","  ","  ","ww"},
            {"ww","ww","  ","ks","  ","ps","  ","wq","ww","wp","  ","ls","  ","zs","  ","ww","ww"},
            {"ww","wp","  ","ks","  ","ps","  ","  ","ns","  ","  ","ls","  ","zs","  ","wq","ww"},
            {"ww","ns","  ","ks","  ","ps","  ","  ","ww","  ","  ","ls","  ","zs","  ","ns","ww"},
            {"ww","wb","  ","ks","  ","ps","  ","wd","ww","wb","  ","ls","  ","zs","  ","wd","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level8=new LevelModel(matrix8, 8, 8);
        levels.add(level8);
        
        String[][] matrix9={
            //13x9
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","ns","wq","ww","ww","ww","ns","ww","ww","ww","wp","ns","ww"},
            {"ww","ps","ps","ps","ps","la","  ","la","ls","ls","ls","ls","ww"},
            {"ww","ps","ps","ps","ps","la","la","la","ls","ls","ls","ls","ww"},
            {"ww","ps","ps","ps","ps","wd","  ","wb","ls","ls","ls","ls","ww"},
            {"ww","ps","ps","ps","ps","wq","  ","wp","ls","ls","ls","ls","ww"},
            {"ww","ps","ps","ps","la","la","la","la","la","ls","ls","ls","ww"},
            {"ww","ps","ps","ps","la","fl","sz","fp","la","ls","ls","ls","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level9=new LevelModel(matrix9, 9, 9);
        levels.add(level9);
    }
    
    public ArrayList<LevelModel>  getLevels()
    {
        return levels;
    }
    
}
