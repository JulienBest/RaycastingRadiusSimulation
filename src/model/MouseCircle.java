package model;

import controller.MouseEventController;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import view.Main;

public class MouseCircle extends Circle {

    private static MouseCircle instance;

    private MouseCircle() {
        this.setRadius(10);
        this.setFill(Color.WHITE);
        MouseEventController mouseEventController = MouseEventController.getInstance(Main.getRoot());
        mouseEventController.registerObserver((x, y) -> {
            setCenterX(x);
            setCenterY(y);
        });
    }

    public static MouseCircle getInstance() {
        if (instance == null) {
            instance = new MouseCircle();
        }
        return instance;
    }
}
