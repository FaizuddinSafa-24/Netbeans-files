
package good;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
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
    public void start(Stage stage) {
        Group root = new Group();
        //scene starts
        Scene scene = new Scene(root, 300, 500);
        stage.setScene(scene);
        stage.setTitle("Good Developer Grows Steadily");
        //label starts
        Label label = new Label("Grow up developers!!");
        root.getChildren().add(label);
        //text  starts
        Text text = new Text();
        text.setText("Good evening, Developers!");
        text.setFont(Font.font("Verdana", 50));
        text.setX(50);
        text.setY(50);
        text.setFill(Color.AQUA);
        root.getChildren().add(text);
        // img upload
        Image img = new Image("images.png");
        stage.getIcons().add(img);
        // ful screen
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press q to exit");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        //line start
        Line line = new Line();
        line.setStartX(400);
        line.setStartY(-100);
        line.setEndX(1800);
        line.setEndY(-200);
        line.setFill(Color.BROWN);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        root.getChildren().add(line);
        
        //rectangle starts
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(500);
        rectangle.setHeight(400);
        rectangle.setFill(Color.BLUE);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(10);
        root.getChildren().add(rectangle);
        
        //triangle start
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                1600.0,450.0,
                1800.0,300.0,
                1600.0,100.0);
        triangle.setFill(Color.YELLOWGREEN);
        triangle.setStroke(Color.BLACK);
        root.getChildren().add(triangle);
        stage.show();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    
    
}
