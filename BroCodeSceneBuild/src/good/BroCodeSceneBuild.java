/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package good;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author safa
 */
public class BroCodeSceneBuild extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Stage stg = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("CSSadd.fxml"));
        // need to add later lines into new commit
        String style = this.getClass().getResource("application.css").toExternalForm();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(style);
        stg.setScene(scene);
        stg.show();
        Scene scene1 = new Scene(root1);
        scene.getStylesheets().add(style);
        stage.setScene(scene1);
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
