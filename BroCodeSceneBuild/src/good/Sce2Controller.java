/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package good;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author safa
 */
public class Sce2Controller {
    @FXML
    Label name;
    
    public void displayName(String username) {
        name.setText("Hello: "+username);
    }
}
