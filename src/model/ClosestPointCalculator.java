package model;

import controller.ObstacleGenerator;
import javafx.geometry.Point2D;

import java.util.ArrayList;
import java.util.List;

public class ClosestPointCalculator {

    public double getClosestDistance(double posX, double posY) {
        BorderLinesCalculator calculator = new BorderLinesCalculator();
        List<List<Point2D>> points = new ArrayList<>();
        for (Obstacle o : ObstacleGenerator.getObstacles()) {
            points.add(calculator.calculatePoints(o));
        }
        double minDistance = Double.MAX_VALUE;
        for (List<Point2D> list : points) {
            for (Point2D point : list) {
                double distance = Math.sqrt(((posX - point.getX()) * (posX - point.getX())) + ((posY - point.getY()) * (posY - point.getY())));
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }
        return minDistance;
    }
}
