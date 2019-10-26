package model;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import view.Main;

import java.util.List;

public class Obstacle extends Rectangle {

    public Obstacle(double x, double y, double width, double height) {
        super(x, y, width, height);
        //this.setRotate(Math.random() * 360);
    }
}
