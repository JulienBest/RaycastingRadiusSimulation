package model;

import controller.MouseEventController;
import controller.ObstacleGenerator;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import view.Main;

import java.util.List;

public class RayRadius extends Circle {

    public RayRadius() {
        this.setFill(new Color(0.03, 1, 0.5, 0.4));
        this.setStroke(Color.WHITE);
        this.setStrokeWidth(2);
        this.setRadius(100);
        MouseEventController mouseEventController = MouseEventController.getInstance();
        ClosestPointCalculator calc = new ClosestPointCalculator();
        mouseEventController.registerObserver((x, y) -> {
            this.setCenterX(x);
            this.setCenterY(y);
            this.setRadius(calc.getClosestDistance(x,y));
        });
        Main.add(this);
    }
}
