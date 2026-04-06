/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package good;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author safa
 */
public class Sce1Controller {
    @FXML
    TextField nameTextfield;
    private Parent root;
    private Stage stage;
    private Scene scene;
    
    public void login(ActionEvent e) throws IOException {
        String username = nameTextfield.getText();
        System.out.println("Scene1 controller class loaded");
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sce2.fxml"));
        root = loader.load();
        
        Sce2Controller sce2ctrl = loader.getController();
        sce2ctrl.displayName(username);
           
        //root= FXMLLoader.load(getClass().getResource("Sce2.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
