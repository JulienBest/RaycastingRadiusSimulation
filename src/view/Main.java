package view;

import controller.ObstacleGenerator;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static final int WIDTH = 1500;
    public static final int HEIGHT = 800;

    private static Pane root;
    private ObstacleGenerator generator;

    @Override
    public void start(Stage primaryStage) throws Exception{
        root = new Pane();
        primaryStage.setTitle("Raycasting Radius");
        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.grayRgb(30));
        primaryStage.setScene(scene);
        primaryStage.show();

        generator = new ObstacleGenerator();
        generator.generate();
    }

    public static void add(Node e) {
        root.getChildren().add(e);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
