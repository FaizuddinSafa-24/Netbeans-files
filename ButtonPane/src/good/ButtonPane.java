/*
Name: Faizuddin Safa
Course: CSE215
Section: 06
Dept: ECE(CSE)
ID: 2523028642
*/


package good;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class ButtonPane extends Application{

    /**
     * @param stage
     */
    @Override
    public void start(Stage primaryStage)  {
      GridPane pane = new GridPane();
      pane.setAlignment(Pos.CENTER);
      pane.setHgap(5.5);
      pane.setVgap(5.5);
      pane.add(new Label("First name: "), 0, 0);
      pane.add(new TextField(), 1, 0);
      pane.add(new Label("MI: "), 0, 1);
      pane.add(new TextField(), 1, 1);
      pane.add(new Label("Last name: "), 0, 2);
      pane.add(new TextField(), 1, 2);
      Button btAdd = new Button("Add Name:");
      pane.add(btAdd, 1, 3);
      GridPane.setHalignment(btAdd, HPos.RIGHT);
      
      Scene scene = new Scene(pane);
      primaryStage.setTitle("ShowGridPane");
      primaryStage.setScene(scene);
      primaryStage.show();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    
    
}
