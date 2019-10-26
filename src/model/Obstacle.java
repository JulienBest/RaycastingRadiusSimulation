package model;

import javafx.scene.shape.Rectangle;

public class Obstacle extends Rectangle {

    public Obstacle(double x, double y, double width, double height) {
        super(x, y, width, height);
        this.setRotate(Math.random() * 360);
    }
}
