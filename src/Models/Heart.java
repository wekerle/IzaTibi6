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
    private Image coloredImage=null;
    private boolean isColored=false;
    private Helpers.Enums.Color color=null;
    
    public Heart(String cod)
    {
        switch(cod){
            case "ps":
                this.color=Helpers.Enums.Color.Red;
                image=new Image("/img/pirosSzivUres.png");
                coloredImage=new Image("/img/pirosSzivTeli.png");
                break;
            case "zs":
                this.color=Helpers.Enums.Color.Green;
                image=new Image("/img/zoldSzivUres.png");
                coloredImage=new Image("/img/zoldSzivTeli.png");
                break;
            case "ks":
                this.color=Helpers.Enums.Color.Blue;
                image=new Image("/img/kekSzivUres.png");
                coloredImage=new Image("/img/kekSzivTeli.png");
                break;
            case "ls":
                this.color=Helpers.Enums.Color.Purple;
                image=new Image("/img/lilaSzivUres.png");
                coloredImage=new Image("/img/lilaSzivTeli.png");
                break;
        }
    }
    
    @Override
    public Image getImage() 
    {
        return image;
    }
    
    public boolean isColored()
    {
        return this.isColored;
    }
    
    public void setColored(boolean isColored)
    {
        this.isColored=isColored;
    }

    public Helpers.Enums.Color getColor()
    {
        return this.color;
    }
    
    public Image getColoredImage()
    {
        return this.coloredImage;
    }
}
