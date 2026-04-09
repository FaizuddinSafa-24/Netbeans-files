/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package good;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author safa
 */
public class SimpleController {

    String input = "";
    @FXML
    private VBox display;

    @FXML
    Label expressionLabel;
    @FXML
    Label currentLabel;

    public void clear(ActionEvent e) {
        this.input = "";
        expressionLabel.setText("");
        currentLabel.setText("0");
    }

    public void equal(ActionEvent e) {
        Calc c1 = new Calc(this.input);
        double result = c1.output();
        System.out.print(" = "+result);
        System.out.println("");
        expressionLabel.setText(input + " =");
        String output = String.valueOf(result);
        currentLabel.setText(output);
        input = "";
    }

    public void operation(ActionEvent e) {
        Button one = (Button) e.getSource();
        String buffer = one.getText();
        this.input += buffer;
        currentLabel.setText(input);
        System.out.print(buffer);
    }

}
