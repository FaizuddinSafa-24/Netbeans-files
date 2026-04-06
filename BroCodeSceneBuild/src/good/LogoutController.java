/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package good;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author safa
 */
public class LogoutController { 
     @FXML
     private Button logoutButton;
     @FXML
     private AnchorPane scenepane;
     Stage stage;
     public void logout(ActionEvent e) {
         stage = (Stage) scenepane.getScene().getWindow();
         System.out.println("Logout Controller class loaded.");
         stage.close();
     }
}
