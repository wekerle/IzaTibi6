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
public class Wall extends GameObject{

    private Image image=null;
    private String cod;
    
    public Wall(String cod)
    {
        this.cod=cod;
        switch(cod){
            case "ww":
                image=new Image("/img/fal.png");
                break;
            case "wb":
                image=new Image("/img/falFentJobb.png");
                break;
            case "wd":
                image=new Image("/img/falFentBal.png");
                break;
            case "wp":
                image=new Image("/img/falLentJobb.png");
                break;
            case "wq":
                image=new Image("/img/falLentBal.png");
                break;
        }
    }
    
    @Override
    public Image getImage() 
    {
        return image;
    }
    
    public String getCode()
    {
        return this.cod;
    }
}
