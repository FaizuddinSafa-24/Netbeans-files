/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package good;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


/**
 * FXML Controller class
 *
 * @author safa
 */
public class SimpleController {
    String input;
    @FXML
    private VBox display;
    
    @FXML
    Button one;
    public void clear(ActionEvent e) {
        this.input = "";
    }
    public void equal(ActionEvent e) {
        Calc c1 = new Calc(this.input);
        double result = c1.output();
    }
    
    public void operation(ActionEvent e) {
        one = (Button)e.getSource();
        String buffer = one.getText();
        this.input += buffer;
        System.out.println(buffer);
    }
    
        
    
}
