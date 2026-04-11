/*
Name: Faizuddin Safa
Course: CSE215
Section: 06
Dept: ECE(CSE)
ID: 2523028642
*/


package good;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Good extends Application{

    /**
     * @param stage
     */
    @Override
    public void start(Stage primaryStage)  {
       StackPane pane = new StackPane();
       pane.getChildren().add(new Button("OK"));
       Scene scen = new Scene(pane,200,50);
       primaryStage.setTitle("Button in a pane");
       primaryStage.setScene(scen);
       primaryStage.show();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    
    
}
