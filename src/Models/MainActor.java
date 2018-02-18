/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javafx.scene.image.Image;

/**
 *
 * @author tibor.wekerle
 */
public class MainActor extends GameObject{

    private Image image=null;
    
    public MainActor(String cod)
    {
        switch(cod)
        {
            case "t":
                image=new Image("/img/tibi.png");
                break;
            case "i":
                image=new Image("/img/iza.png");
                break;
        }
    }
    
    @Override
    public Image getImage() 
    {
        return image;
    }           
}
