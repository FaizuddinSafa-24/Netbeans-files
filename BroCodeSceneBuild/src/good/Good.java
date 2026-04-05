
package good;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Good extends Application{

    /**
     * @param stage
     */
    @Override
    public void start(Stage stage) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        //Group root = new Group();
        //scene starts
        try {
            Group root = new Group();
            Scene scene = new Scene(root,480, 480);
            stage.setScene(scene);
            stage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    
    
}
