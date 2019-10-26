package model;

import controller.MouseEventController;
import javafx.geometry.Point2D;

import java.util.ArrayList;
import java.util.List;

public class BorderLinesCalculator {

    public List<Point2D> calculatePoints(Obstacle r) {
        List<Point2D> result = new ArrayList<>();
        double x = r.getX();
        double y = r.getY();
        double w = r.getWidth();
        double h = r.getHeight();

        Point2D ll = calculateLowerLeftBorder(x, y, w, h);
        Point2D lr = calculateLowerRightBorder(x, y, w, h);
        Point2D ul = calculateUpperLeftBorder(x, y, w, h);
        Point2D ur = calculateUpperRightBorder(x, y, w, h);

        double precision = 10;
        for (double i = ll.getX(); i < lr.getX(); i += precision) {
            result.add(new Point2D(i, ll.getY()));
        }
        for (double i = ul.getX(); i < ur.getX(); i += precision) {
            result.add(new Point2D(i, ul.getY()));
        }
        for (double i = ul.getY(); i < ll.getY(); i += precision) {
            result.add(new Point2D(ul.getX(), i));
        }
        for (double i = ur.getY(); i < lr.getY(); i += precision) {
            result.add(new Point2D(ur.getX(), i));
        }

        return result;
    }

    private Point2D calculateLowerRightBorder(double x, double y, double w, double h) {
        return new Point2D(x + w, y + h);
    }

    private Point2D calculateLowerLeftBorder(double x, double y, double w, double h) {
        return new Point2D(x, y + h);
    }

    private Point2D calculateUpperRightBorder(double x, double y, double w, double h) {
        return new Point2D(x + w, y);
    }

    private Point2D calculateUpperLeftBorder(double x, double y, double w, double h) {
        return new Point2D(x, y);
    }
}
