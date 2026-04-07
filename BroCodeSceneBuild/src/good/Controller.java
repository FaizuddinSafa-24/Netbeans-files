/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package good;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

/**
 *
 * @author safa
 */
public class Controller {
    @FXML
    private Circle circle;
    private double x,y;
    public void up(ActionEvent e ){
        
        System.out.println("UP");
        circle.setCenterY(y-=10);
    }
    public void down(ActionEvent e ){
        circle.setCenterY(y+=10);
        System.out.println("Down");
    }
    public void left(ActionEvent e ){
        System.out.println("Left");
        circle.setCenterX(x-=10);
    }
    public void right(ActionEvent e ){
        System.out.println("Right");
        circle.setCenterX(x+=10);
    }
}
