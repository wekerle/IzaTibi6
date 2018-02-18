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
public class Heart extends GameObject{

    private Image image=null;
    
    public Heart()
    {
        image=new Image("/img/szivTeli.png");
    }
    
    @Override
    public Image getImage() 
    {
        return image;
    }
}
