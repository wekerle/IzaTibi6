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

        //ns -NagySziv
        //la -lajtorja
        
    }
    
    private void constructLevels()
    {
        String[][] matrix1={
            //11x9
            {"  ","ww","ww","ww","ww","ww","ww","ww","ww","ww","  "},
            {"  ","ww","ww","wp","  ","  ","  ","wq","ww","ww","  "},
            {"ww","ww","  ","  ","  ","sz","  ","  ","  ","ww","ww"},
            {"ww","wp","ns","ww","ww","ww","ww","ww","  ","wq","ww"},
            {"ww","  ","ns","ww","ww","ww","ww","ww","  ","  ","ww"},
            {"ww","wb","ns","ww","ww","ww","ww","ww","fp","wd","ww"},
            {"ww","ww","  ","ps","ps","ps","ps","ps","  ","ww","ww"},
            {"  ","ww","ww","wb","  ","  ","  ","wd","ww","ww","  "},
            {"  ","ww","ww","ww","ww","ww","ww","ww","ww","ww","  "},
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
        
        String[][] matrix10={
            //15x11
            {"ww","ww","ww","ww","  ","ww","ww","ww","ww","ww","  ","ww","ww","ww","ww"},
            {"ww","wp","  ","  ","  ","  ","  ","la","  ","  ","  ","  ","  ","wq","ww"},
            {"ww","  ","  ","  ","ww","fp","  ","la","  ","ps","ps","ps","ps","  ","ww"},
            {"ww","  ","  ","zs","ww","ww","  ","  ","  ","ww","ww","ww","ww","  ","ww"},
            {"ww","  ","  ","zs","ww","  ","  ","  ","  ","wp","  ","  ","  ","  ","ww"},
            {"ww","  ","ns","zs","  ","  ","  ","de","  ","  ","  ","ww","ww","ww","ww"},
            {"  ","  ","  ","zs","ww","  ","ww","ww","ww","  ","  ","  ","ns","ks","  "},
            {"ww","  ","  ","zs","ww","  ","  ","  ","  ","  ","  ","  ","  ","ks","ww"},
            {"ww","  ","  ","  ","  ","  ","ns","  ","  ","  ","  ","fk","  ","ks","ww"},
            {"  ","fz","ww","wb","  ","  ","  ","  ","  ","wd","ww","ww","  ","ks","  "},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level10=new LevelModel(matrix10, 10, 10);
        levels.add(level10);
        
        String[][] matrix11={
            //13x10
            {"  ","  ","  ","  ","  ","  ","ww","  ","  ","  ","  ","  ","  "},
            {"  ","  ","  ","  ","  ","ww","sz","ww","  ","  ","  ","  ","  "},
            {"  ","  ","  ","  ","ww","  ","la","  ","ww","  ","  ","  ","  "},
            {"  ","  ","  ","ww","wp","ns","  ","ns","wq","ww","  ","  ","  "},
            {"  ","  ","ww","ww","wb","  ","la","  ","wd","ww","ww","  ","  "},
            {"  ","ww","wp","fl","ls","ls","la","ls","ls","fl","wq","ww","  "},
            {"ww","ww","wb","fk","ks","ks","la","ks","ks","fk","wd","ww","ww"},
            {"wp","fz","zs","zs","zs","zs","la","zs","zs","zs","zs","fz","wq"},
            {"wb","fp","ps","ps","ps","ps","ns","ps","ps","ps","ps","fp","wd"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level11=new LevelModel(matrix11, 11, 11);
        levels.add(level11);
        
        String[][] matrix12={
            //17x12
            {"  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","ww","ww","ww","ww","ww","  "},
            {"  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","ww","fp","la","fk","ww","  "},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","la","ww","ww","ww"},
            {"ww","wp","  ","  ","ps","ps","ps","  ","  ","  ","ks","ks","ks","la","  ","wq","ww"},
            {"ww","ks","  ","la","ps","ps","ps","  ","ns","  ","ks","ks","ks","  ","  ","  ","ww"},
            {"ww","ks","ww","la","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","ks","  ","la","ks","ks","ks","  ","  ","  ","ps","ps","ps","  ","  ","wq","ww"},
            {"ww","ks","  ","  ","ks","ks","ks","  ","ns","  ","ps","ps","ps","la","  ","  ","ww"},
            {"ww","ks","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","la","ww","ps","ww"},
            {"ww","ks","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","la","  ","ps","ww"},
            {"ww","ks","de","  ","  ","  ","  ","  ","ns","  ","  ","  ","  ","la","  ","ps","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level12=new LevelModel(matrix12, 12, 12);
        levels.add(level12);
        
        String[][] matrix13={
           //17x12
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","zs","zs","zs","zs","zs","zs","zs","la","ks","ks","ks","ks","ks","ks","ks","ww"},
            {"ww","zs","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","ks","ww"},
            {"ww","zs","  ","  ","  ","wd","  ","ww","  ","ww","  ","wb","  ","  ","  ","ks","ww"},
            {"ww","la","  ","  ","  ","  ","fl","ww","  ","ww","fp","  ","  ","  ","  ","la","ww"},
            {"ww","ps","  ","  ","  ","ww","ww","wp","  ","wq","ww","ww","  ","  ","  ","ls","ww"},
            {"ww","ps","  ","  ","  ","  ","  ","  ","sz","  ","  ","  ","  ","  ","  ","ls","ww"},
            {"ww","ps","  ","  ","  ","ww","ww","wb","  ","wd","ww","ww","  ","  ","  ","ls","ww"},
            {"ww","ps","  ","  ","ns","  ","fk","ww","ns","ww","fz","  ","ns","  ","  ","ls","ww"},
            {"ww","ps","  ","  ","  ","wq","  ","ww","  ","ww","  ","wp","  ","  ","  ","ls","ww"},
            {"ww","ps","ps","ps","ps","ps","la","  ","  ","  ","la","ls","ls","ls","ls","ls","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level13=new LevelModel(matrix13, 13, 13);
        levels.add(level13);
        
        String[][] matrix14={
            //17x12
            {"ww","  ","  ","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","fp","  ","  ","  ","  ","  ","  ","ww","ww","  ","fk","ww","zs","zs","zs","ww"},
            {"ww","  ","  ","  ","  ","ww","  ","  ","ww","  ","  ","ww","ww","  ","  ","ww","ww"},
            {"ww","  ","  ","ww","ns","ww","ww","  ","  ","  ","  ","  ","  ","  ","  ","  ","ww"},
            {"ww","ks","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","ww","  ","  ","  ","ww"},
            {"  ","ks","ks","  ","  ","ww","  ","  ","ww","  ","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","ww","  ","ww","ww","ww","  ","ww","ww","  ","  ","  ","  ","  ","fl","ww","ww"},
            {"ww","  ","  ","ww","  ","  ","  ","  ","  ","  ","  ","ww","  ","ww","  ","  ","  "},
            {"ww","  ","  ","  ","  ","  ","  ","ww","  ","  ","  ","ww","ns","  ","  ","  ","  "},
            {"ww","  ","  ","ww","ns","ls","ww","  ","  ","ww","  ","ww","  ","ww","ww","  ","ww"},
            {"ww","de","  ","  ","ls","ls","ww","fz","  ","ww","  ","  ","  ","ps","ps","ps","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","  ","ww","ww","ww","ww"},
        };
        LevelModel level14=new LevelModel(matrix14, 14, 14);
        levels.add(level14);
        
        String[][] matrix15={
            //17x12
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","wp","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","wq","ww"},
            {"ww","ps","ww","ww","  ","ww","ww","ww","ww","ww","zs","ww","wp","wq","ww","  ","ww"},
            {"ww","ps","ww","zs","zs","  ","  ","ns","ww","  ","zs","ww","ps","zs","ww","  ","ww"},
            {"ww","ps","ww","zs","  ","ww","zs","zs","  ","zs","zs","ww","ps","zs","ww","  ","ww"},
            {"ww","ps","ww","zs","  ","ww","zs","ww","ww","ww","zs","ww","ps","zs","ww","  ","ww"},
            {"ww","ps","ww","zs","  ","ww","zs","ww","ww","ww","zs","ww","ps","zs","  ","wd","ww"},
            {"ww","ps","ww","wb","la","ww","zs","wp","zs","zs","wd","ww","  ","wb","  ","wq","ww"},
            {"ww","fp","  ","zs","la","ww","zs","zs","zs","la","  ","ww","  ","  ","ww","ps","ww"},
            {"ww","ww","ww","ns","la","ww","la","ww","ww","  ","ns","  ","wd","  ","ww","ps","ww"},
            {"ww","ps","ps","ps","ps","ps","la","ps","ps","ps","sz","ps","ps","ps","ps","fz","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level15=new LevelModel(matrix15, 15, 15);
        levels.add(level15);
        
        String[][] matrix16={
            //15x11
            {"ww","ww","ww","ww","ww","ww","ww","  ","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","ls","ls","ls","ls","fp","ww","  ","ww","ks","ks","la","ks","fz","ww"},
            {"ww","la","ls","ls","ls","ls","  ","ns","  ","ks","ks","ks","ks","la","ww"},
            {"ww","ls","ls","ls","ls","ls","ww","  ","ww","ks","ks","ks","ks","ks","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","  ","ww","ww","ww","  ","ww","ww","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","  ","ww","ww","ww","ns","ww","ww","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","  ","ww","ww","ww","  ","ww","ww","ww"},
            {"ww","de","ps","ps","ps","fk","ww","  ","ww","zs","zs","zs","zs","fl","ww"},
            {"ww","la","ps","ps","ps","ps","  ","ns","  ","zs","zs","zs","zs","la","ww"},
            {"ww","ps","ps","ps","ps","ps","ww","  ","ww","zs","zs","la","zs","zs","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level16=new LevelModel(matrix16, 16, 16);
        levels.add(level16);
        
        String[][] matrix17={
            //17x12
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","ww","wp","ks","ks","ks","ks","ks","ks","ks","ks","ks","ks","ks","ks","wq","ww"},
            {"ww","wp","ks","ks","la","ww","la","ks","ns","ks","la","ww","la","ks","wq","ks","ww"},
            {"ww","ps","ks","ww","la","ks","la","ww","ww","ww","la","ks","la","ww","ns","ks","ww"},
            {"ww","ps","ps","fk","ks","ks","ks","ks","ks","ks","ks","sz","ks","la","ks","wd","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","la","ww","ww","ww"},
            {"ww","zs","zs","zs","zs","zs","zs","zs","zs","zs","zs","ww","ww","la","ww","ns","ww"},
            {"ww","zs","zs","zs","zs","zs","zs","zs","zs","zs","zs","zs","ww","la","ww","zs","ww"},
            {"ww","zs","ww","ww","ww","ww","zs","zs","zs","la","la","zs","ww","la","ww","zs","ww"},
            {"ww","zs","wq","ww","ww","ww","ww","zs","zs","la","ww","ww","ww","la","ww","zs","ww"},
            {"ww","zs","zs","fp","ww","ww","ww","ww","zs","la","zs","zs","zs","la","zs","fz","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level17=new LevelModel(matrix17, 17, 17);
        levels.add(level17);
        
        String[][] matrix18={
            //15x10
            {"  ","  ","  ","  ","  ","  ","  ","  ","ww","  ","  ","  ","  ","  ","  "},
            {"  ","  ","  ","  ","  ","  ","  ","ww","de","ww","  ","  ","  ","  ","  "},
            {"  ","  ","  ","  ","  ","  ","ww","  ","la","ns","ww","  ","  ","  ","  "},
            {"  ","  ","  ","  ","  ","ww","  ","wd","  ","  ","  ","ww","  ","  ","  "},
            {"  ","  ","  ","  ","ww","fk","wd","  ","ns","  ","wp","wq","  ","  ","  "},
            {"  ","  ","  ","ww","ps","wd","  ","  ","wb","  ","ks","fp","wq","  ","  "},
            {"  ","  ","ww","ps","wd","  ","  ","wp","  ","  ","wd","fz","zs","wq","ww"},
            {"  ","ww","ps","wd","  ","  ","  ","ks","  ","  ","  ","ns","  ","zs","ww"},
            {"ww","  ","wb","  ","  ","ks","  ","wd","  ","  ","  ","wb","zs","wd","ww"},
            {"ww","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","ww","ww","ww","ww"},
        };
        LevelModel level18=new LevelModel(matrix18, 18, 18);
        levels.add(level18);
        
        String[][] matrix19={
            //16x11
            {"  ","  ","  ","  ","wp","wq","  ","  ","  ","  ","wp","wq","  ","  ","  ","  "},
            {"ww","ww","ww","ww","  ","  ","ww","ww","ww","ww","  ","  ","ww","ww","  ","ww"},
            {"ww","ww","ww","ww","  ","  ","ww","ww","ww","ww","sz","  ","ww","ww","  ","ww"},
            {"ww","ks","ps","ww","  ","  ","ww","ks","zs","ww","ww","  ","ww","wp","wd","ww"},
            {"ww","ps","ks","ns","  ","  ","fl","zs","ks","  ","wq","  ","ww","la","ww","ww"},
            {"ww","ks","ps","ww","  ","ww","ww","wb","zs","ww","ns","  ","  ","ls","ls","ww"},
            {"ww","ps","ks","ww","  ","  ","  ","zs","ks","ww","ww","  ","ww","ls","ls","ww"},
            {"ww","la","ps","ww","  ","  ","ww","ks","zs","ww","ns","  ","ww","ls","ls","  "},
            {"ww","la","ks","fz","  ","  ","ww","zs","ks","  ","  ","la","ww","ls","ls","ww"},
            {"ww","ks","wd","ww","ww","fk","ww","ks","ww","ww","fp","la","ww","wb","wd","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level19=new LevelModel(matrix19, 19, 19);
        levels.add(level19);
        
        String[][] matrix20={
            //17x12
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","wp","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","wq","  ","ww"},
            {"ww","ps","  ","  ","  ","  ","wp","ps","ps","wq","wp","ps","wq","  ","ps","  ","ww"},
            {"ww","ps","wp","ps","ps","ns","ps","ps","ps","wb","ps","ps","ps","wq","ps","  ","ww"},
            {"ww","ps","ps","  ","wp","ps","ps","ps","ps","ps","ps","wq","ww","ps","ps","  ","ww"},
            {"ww","ps","ps","ps","ps","ps","ps","de","ps","wq","ps","ps","wp","ps","ps","wq","ww"},
            {"ww","ps","wb","ps","ps","ps","wd","ww","  ","ps","ps","ps","ns","ps","ps","ps","ww"},
            {"ww","fp","ps","wq","wb","ps","ps","wq","  ","ps","ps","wb","ps","ps","wd","ps","ww"},
            {"ww","ww","ps","ps","  ","  ","  ","wb","ps","wd","ps","wp","wd","ps","  ","ps","ww"},
            {"ww","wp","wd","wb","ps","ps","ps","ns","ps","ps","wd","wb","ps","wd","  ","ps","ww"},
            {"ww","wb","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level20=new LevelModel(matrix20, 20, 20);
        levels.add(level20);
        
        String[][] matrix21={
             //17x12
            {"  ","  ","  ","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","  ","  "},
            {"  ","  ","  ","ww","wp","  ","  ","  ","  ","  ","wp","  ","  ","  ","wq","  ","  "},
            {"  ","  ","  ","ww","  ","  ","ns","ww","ns","  ","  ","  ","  ","  ","wd","ww","  "},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","  ","  ","  ","ww","ww","ww","  "},
            {"ww","wp","  ","  ","  ","  ","  ","  ","wq","ww","  ","  ","  ","ww","ww","ww","  "},
            {"ww","  ","  ","ww","ww","ww","ww","ww","ps","  ","ps","  ","ps","ns","fp","wq","ww"},
            {"ww","  ","  ","wp","  ","ks","  ","wq","ps","  ","ps","  ","  ","ww","ww","ks","ww"},
            {"ww","  ","  ","ks","  ","fk","  ","la","  ","  ","  ","  ","  ","wq","ww","ks","ww"},
            {"ww","  ","  ","wb","  ","ks","  ","  ","  ","  ","  ","  ","  ","  ","ww","ks","ww"},
            {"ww","  ","  ","ww","ww","ww","ww","wp","zs","  ","zs","  ","zs","  ","ww","ks","ww"},
            {"ww","fp","  ","  ","  ","sz","  ","wb","fz","  ","wd","  ","zs","  ","  ","wd","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level21=new LevelModel(matrix21, 21, 21);
        levels.add(level21);
        
        String[][] matrix22={
            //17x12
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","  ","wp","  ","  ","  ","  ","  ","ns","  ","  ","  ","  ","  ","wq","  ","ww"},
            {"ww","  ","ns","ww","fk","ww","ww","ww","ww","ww","ww","ww","fl","ww","ns","  ","ww"},
            {"ww","ww","  ","  ","  ","wp","  ","wq","ww","wp","  ","wq","  ","  ","  ","ww","ww"},
            {"ww","ww","ls","  ","ls","ls","  ","ls","ww","ls","  ","ls","ls","  ","ls","ww","ww"},
            {"ww","wp","  ","zs","  ","  ","  ","  ","ww","  ","  ","  ","  ","ks","  ","wq","ww"},
            {"ww","  ","  ","  ","wb","  ","  ","la","ww","la","  ","  ","wd","  ","  ","  ","ww"},
            {"ww","  ","  ","  ","fp","  ","  ","la","ww","la","  ","  ","fz","  ","  ","  ","ww"},
            {"ww","ps","ps","  ","  ","ps","  ","ps","  ","ps","  ","ps","  ","  ","ps","ps","ww"},
            {"ww","wb","  ","zs","  ","  ","  ","  ","de","  ","  ","  ","  ","ks","  ","wd","ww"},
            {"ww","ww","wb","zs","  ","wd","ww","ww","ww","ww","ww","wb","  ","ks","wd","ww","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level22=new LevelModel(matrix22, 22, 22);
        levels.add(level22);
        
        String[][] matrix23={
            //17x12
            {"ww","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","ww"},
            {"  ","  ","  ","wp","  ","  ","  ","fp","  ","  ","  ","wq","  ","  ","wq","  ","  "},
            {"  ","wp","ps","ps","wq","wp","  ","  ","wq","wp","ks","ks","ks","wq","  ","  ","  "},
            {"  ","ps","wp","  ","  ","wd","wb","wp","  ","ps","  ","  ","wq","ks","  ","  ","  "},
            {"  ","ps","  ","wb","  ","wq","wp","  ","  ","ps","  ","  ","  ","wd","  ","  ","  "},
            {"  ","ps","  ","wd","wb","ks","  ","wd","la","wb","ps","ps","ps","ps","ps","wq","  "},
            {"  ","wb","  ","wq","wp","ks","  ","la","sz","la","  ","  ","wd","wb","  ","ps","  "},
            {"  ","wp","ns","  ","  ","ks","  ","wq","la","wp","  ","  ","wq","wp","  ","ns","  "},
            {"  ","fk","  ","  ","  ","ks","  ","  ","  ","  ","  ","  ","  ","  ","  ","ps","  "},
            {"  ","wb","ks","ks","ks","wd","wb","  ","ns","  ","  ","wd","wp","ps","ps","wd","  "},
            {"  ","ww","wb","wd","wb","  ","  ","wd","wb","ks","ks","ks","wd","wb","wd","  ","  "},
            {"ww","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","ww"},           
        };
        LevelModel level23=new LevelModel(matrix23, 23, 23);
        levels.add(level23);
        
        String[][] matrix24={
            //13x12
            {"  ","  ","  ","  ","  ","  ","ww","  ","ww","  ","  ","ww","  "},
            {"  ","ww","  ","ww","  ","  ","ww","  ","wp","  ","fl","wq","ww"},
            {"  ","ww","  ","ww","  ","  ","ww","  ","  ","  ","ww","ls","  "},
            {"ww","wp","ns","  ","  ","  ","  ","  ","wd","  ","  ","ls","ww"},
            {"ww","  ","la","ww","wp","ns","ks","ks","fk","ks","ww","ls","ww"},
            {"ww","ww","fp","la","ps","ps","ps","ps","ww","ls","ls","  ","  "},
            {"ww","ww","ww","la","  ","ww","ps","ps","  ","fz","ls","ls","ww"},
            {"ww","de","la","  ","ww","zs","ps","ww","  ","ww","ls","ls","  "},
            {"ww","ww","la","ww","ww","zs","ww","wp","ns","ww","ls","ls","ww"},
            {"ww","zs","la","zs","zs","la","ww","wb","  ","ls","ls","wd","  "},
            {"ww","  ","  ","  ","ww","  ","ww","  ","la","la","la","ww","ww"},
            {"  ","  ","  ","  ","ww","  ","ww","  ","  ","  ","  ","ww","  "},
        };
        LevelModel level24=new LevelModel(matrix24, 24, 24);
        levels.add(level24);
        
        String[][] matrix25={
             //17x12
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","ww","zs","zs","zs","zs","zs","zs","zs","zs","zs","zs","la","zs","ps","ps","ww"},
            {"ww","ps","ks","ks","ks","ks","ks","ks","ks","ks","ks","ks","la","ww","wb","ps","ww"},
            {"ww","ps","ks","ww","wp","wq","wp","wq","wp","  ","  ","  ","  ","wq","sz","ks","ww"},
            {"ww","ps","ks","  ","  ","  ","  ","  ","  ","wp","wq","wp","  ","  ","la","ks","ww"},
            {"ww","ps","ks","  ","  ","wd","wb","fz","  ","wd","wb","  ","wd","ns","ps","ks","ww"},
            {"ww","ps","ww","  ","  ","wq","wp","wq","ns","wq","wp","  ","  ","wd","ps","ks","ww"},
            {"ww","ps","ww","wb","  ","wd","ns","wd","wp","  ","  ","wb","  ","wq","ps","ks","ww"},
            {"ww","ps","ww","wp","fp","wq","  ","  ","  ","  ","wd","wp","fk","wd","la","ks","ww"},
            {"ww","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","la","zs","ww"},
            {"ww","zs","zs","zs","ww","ps","ps","wd","wb","zs","zs","zs","zs","zs","zs","zs","ww"},
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level25=new LevelModel(matrix25, 25, 25);
        levels.add(level25);
        
        String[][] matrix26={
            //17x12
            {"  ","  ","ww","ww","  ","ww","ww","ww","ww","ww","  ","ww","ww","ww","ww","  ","  "},
            {"ww","ww","ww","  ","  ","  ","  ","ps","ps","ww","ww","ww","fp","ww","ww","  ","  "},
            {"ww","wp","  ","  ","wd","ww","wb","  ","  ","  ","  ","  ","  ","  ","ww","ww","ww"},
            {"ww","  ","ww","  ","fp","ww","ww","ww","ww","fp","ww","ww","ww","  ","  ","  ","ww"},
            {"ww","  ","ww","  ","wq","ww","ps","ps","  ","  ","  ","  ","ww","  ","ww","  ","ww"},
            {"ww","ps","ps","  ","la","ns","  ","wd","ww","ww","ww","  ","ww","  ","ww","ps","ww"},
            {"ww","fp","ww","ww","  ","ww","  ","fp","ww","de","  ","wd","ww","  ","ww","ps","ww"},
            {"ww","ww","ww","  ","ps","  ","  ","  ","ww","ww","ww","ww","wp","  ","ww","  ","ww"},
            {"ww","ww","ww","  ","ps","ww","  ","  ","wq","ww","  ","ns","  ","wp","  ","  ","ww"},
            {"ww","wp","  ","wd","ww","ww","ww","ww","  ","ww","ww","fp","ww","  ","ww","  ","ww"},
            {"ww","ns","  ","  ","  ","  ","fp","wq","wb","  ","ps","ps","ps","  ","ww","fp","ww"},
            {"ww","ww","  ","ww","ww","ww","ww","  ","ww","ww","  ","ww","  ","ww","ww","  ","ww"},
        };
        LevelModel level26=new LevelModel(matrix26, 26, 26);
        levels.add(level26);
        
        String[][] matrix27={
            //17x12
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","  ","ww","ww","ww","ww","ww"},
            {"ww","  ","  ","zs","zs","zs","  ","ww","ww","ww","ww","ks","ks","ks","  ","wq","ww"},
            {"  ","  ","  ","zs","ww","zs","  ","ps","ps","ps","  ","ks","ww","ks","ww","  ","ww"},
            {"ww","  ","  ","zs","zs","zs","  ","ps","ww","ps","ww","ks","ks","ks","ww","  ","ww"},
            {"  ","  ","la","  ","wd","  ","  ","ps","ww","ps","ww","ww","ww","  ","ww","  ","ww"},
            {"ww","  ","la","ks","ks","ks","  ","ps","ww","ps","ww","zs","zs","zs","ww","  ","ww"},
            {"ww","ww","la","ks","ww","ks","  ","ps","ps","ps","  ","zs","ww","zs","wp","wd","ww"},
            {"  ","  ","  ","ks","ks","ks","wb","  ","fp","  ","wd","zs","zs","zs","  ","  ","  "},
            {"wb","  ","  ","  ","  ","  ","  ","wq","ns","wb","  ","wd","  ","ww","wb","wq","ww"},
            {"ww","  ","ww","  ","ww","fz","  ","wb","sz","ns","  ","  ","fk","  ","wp","wd","ww"},
            {"ww","wb","ns","la","wq","ww","wb","  ","wq","wp","  ","wd","ww","  ","  ","ww","ww"},
            {"ww","ww","ww","  ","  ","ww","ww","ww","  ","  ","ww","ww","ww","ww","ww","ww","ww"},
        };
        LevelModel level27=new LevelModel(matrix27, 27, 27);
        levels.add(level27);
        
        String[][] matrix28={
            //15x11
            {"wp","  ","  ","  ","wq","  ","wp","  ","  ","  ","  ","  ","  ","  ","wq"},
            {"ns","  ","  ","  ","  ","  ","  ","  ","  ","wp","  ","wq","  ","  ","  "},
            {"wp","  ","  ","wq","ns","  ","la","  ","  ","  ","  ","  ","wq","  ","  "},
            {"wb","wq","  ","  ","  ","  ","  ","  ","  ","wb","wq","  ","  ","  ","  "},
            {"  ","  ","  ","  ","  ","  ","wd","wp","  ","  ","  ","  ","  ","  ","  "},
            {"wp","  ","wq","wp","wq","  ","  ","ls","  ","  ","wb","wq","  ","  ","wq"},
            {"  ","wb","  ","  ","ns","  ","  ","ls","  ","  ","  ","  ","  ","  ","wq"},
            {"wb","wq","  ","  ","wp","wq","  ","ls","wp","  ","wb","  ","fl","  ","  "},
            {"  ","  ","  ","  ","  ","  ","  ","ls","  ","wp","  ","la","wq","  ","  "},
            {"wb","wd","wb","la","wd","wb","  ","de","  ","wd","ww","wb","  ","  ","wd"},
            {"  ","  ","  ","  ","  ","  ","  ","ww","  ","  ","  ","  ","  ","  ","  "},
        };
        LevelModel level28=new LevelModel(matrix28, 28, 28);
        levels.add(level28);
        
        String[][] matrix29={
             //13x9
            {"ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww","ww"},
            {"ww","fz","ks","ps","ps","ps","ps","ps","ks","ks","ks","fp","ww"},
            {"  ","ks","ps","ps","ps","ps","ns","ps","ps","ps","ps","ks","  "},
            {"  ","ks","zs","zs","zs","la","la","zs","la","ks","ks","ks","  "},
            {"  ","ns","la","zs","la","la","la","zs","la","la","la","ns","  "},           
            {"  ","zs","la","zs","zs","la","la","la","zs","la","la","la","  "},
            {"  ","zs","zs","la","la","la","la","zs","zs","zs","zs","ks","  "},
            {"ww","sz","ks","ks","la","la","la","la","la","la","ks","fk","ww"},
            {"ww","ww","ww","  ","  ","  ","  ","  ","  ","  ","ww","ww","ww"},
        };
        LevelModel level29=new LevelModel(matrix29, 29, 29);
        levels.add(level29);
        
        String[][] matrix30={
            //17x12
            {"ww","  ","ww","ww","ww","  ","  ","ww","  ","ww","  ","ww","  ","  ","  ","  ","ww"},
            {"ww","fp","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  "},
            {"  ","  ","la","la","la","la","la","ps","ps","ps","ps","ps","ps","ps","ps","ns","ww"},
            {"ww","  ","  ","  ","  ","  ","  ","la","la","la","la","la","la","la","la","  ","ww"},
            {"  ","la","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","la","la","ww"},
            {"ww","  ","  ","  ","ns","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","la","ww"},
            {"ww","  ","la","  ","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","  "},
            {"  ","  ","  ","  ","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","ww"},
            {"ww","wb","  ","wp","  ","ps","ps","ps","ps","ps","ps","ps","ps","ps","ps","la","ww"},
            {"ww","ns","la","  ","  ","  ","  ","  ","  ","  ","wb","  ","  ","  ","la","  ","ww"},
            {"  ","  ","ps","ps","ps","ps","de","ps","ps","ps","ps","ps","ps","ps","ps","ps","ww"},
            {"ww","  ","ww","  ","ww","ww","ww","ww","ww","  ","ww","ww","ww","ww","ww","  ","ww"},
        };
        LevelModel level30=new LevelModel(matrix30, 30, 30);
        levels.add(level30);
        
    }
    
    public ArrayList<LevelModel>  getLevels()
    {
        return levels;
    }
    
}
