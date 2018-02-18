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
public class Goal extends GameObject{

    private Image image=null;
    private GameObject object=null;
    
    public Goal()
    {
        image=new Image("/img/szivUres.png");
    }
    
    @Override
    public Image getImage() 
    {
        return image;
    }

    public GameObject getObject() {
        return object;
    }

    public void setObject(GameObject object) {
        this.object = object;
    } 
}
