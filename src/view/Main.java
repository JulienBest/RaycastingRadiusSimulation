package view;

import controller.MouseEventController;
import controller.ObstacleGenerator;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.DrawableObjectsList;
import model.MouseCircle;

import static utils.GlobalConstants.HEIGHT;
import static utils.GlobalConstants.WIDTH;

public class Main extends Application {

    private static Pane root;
    private static DrawableObjectsList<Node> drawableObjects;
    private static Presenter presenter;

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new Pane();
        primaryStage.setTitle("Raycasting Radius");
        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.grayRgb(30));
        primaryStage.setScene(scene);
        primaryStage.show();

        presenter = new PresenterImpl();
        drawableObjects = new DrawableObjectsList<>();
        drawableObjects.registerObserver(() -> presenter.draw(drawableObjects));

        ObstacleGenerator generator = new ObstacleGenerator();
        generator.generate();
        MouseEventController.getInstance(root);

        MouseCircle mouseCircle = MouseCircle.getInstance();
        add(mouseCircle);
    }

    public static Pane getRoot() {
        return root;
    }

    public static void add(Node e) {
        drawableObjects.add(e);
        presenter.draw(drawableObjects);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
