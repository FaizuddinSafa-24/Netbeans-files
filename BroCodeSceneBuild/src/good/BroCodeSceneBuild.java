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
        //css file
        String style = this.getClass().getResource("application.css").toExternalForm();
        // first scene
        Parent root = FXMLLoader.load(getClass().getResource("CSSadd.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(style);
        stg.setScene(scene);
        stg.show();
        //second scene
        Parent root1 = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene1 = new Scene(root1);
        stage.setScene(scene1);
        stage.show();

        //switch between two scene
        Stage stg1 = new Stage();
        Stage stg2 = new Stage();

        Parent rt1 = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Scene sce1 = new Scene(rt1);
        stg1.setScene(sce1);
        stg1.show();
        Parent rt2 = FXMLLoader.load(getClass().getResource("Sce1.fxml"));
        Scene sce2 = new Scene(rt2);
        stg2.setScene(sce2);
        stg2.show();

        //Logout button
        Stage stg3 = new Stage();
        Parent rt3 = FXMLLoader.load(getClass().getResource("Logout.fxml"));
        Scene sce3 = new Scene(rt3);
        stg3.setScene(sce3);
        stg3.show();

        stg3.setOnCloseRequest(e -> {
            e.consume();
            
            //consume() stops event building further
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

    
}
