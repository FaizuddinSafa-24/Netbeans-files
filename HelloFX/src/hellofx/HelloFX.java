package hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {
    @Override
    public void start(Stage s1) {
        Label l1 = new Label("Welcome to JavaFX! Working fantastically!!");
        StackPane rootnode = new StackPane(l1);
        Scene s2 = new Scene(rootnode,500,300);
        s1.setScene(s2);
        s1.setTitle("JavaFX Journey Begins!");
        s1.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
