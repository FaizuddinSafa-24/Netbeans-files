package good;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * @param stage
     */
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Simple.fxml"));
        String style = this.getClass().getResource("simple.css").toExternalForm();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(style);
        stage.setScene(scene);
        stage.setTitle("Simple Calculator");
        stage.show();

    }

    public static void main(String[] args) {
        // TODO code application logic here
//        Calc c1 = new Calc("2+3");
//        double result = c1.output();
//        System.out.println("The output is: " +result);
        launch(args);
    }

}
