import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import utils.SpaceMath;

public class DangerousGalaxyPrepare extends Application  {

    private static final double WINDOW_WIDTH = 500;
    private static final double WINDOW_HEIGHT = 500;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Preparing JavaFX stuff...
        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, WINDOW_WIDTH, WINDOW_HEIGHT, Color.WHITE);
        Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        SpaceMath.Point.centerX = (long) (WINDOW_WIDTH / 2);
        SpaceMath.Point.centerY = (long) (WINDOW_HEIGHT / 2);
        for (int i = 5; i <= 200; i++) {
            SpaceMath.Point point = SpaceMath.getRandomPoint(i);
            graphicsContext.fillOval(point.getScrX(), point.getSxrY(), 1, 1);
        }
        // Show window with drawings
        stackPane.getChildren().addAll(canvas);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
