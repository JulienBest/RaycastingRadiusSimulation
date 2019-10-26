package controller;

import model.Obstacle;
import view.Main;

import java.util.ArrayList;
import java.util.List;

import static utils.GlobalConstants.HEIGHT;
import static utils.GlobalConstants.WIDTH;

public class ObstacleGenerator {

    private static List<Obstacle> obstacles;

    public void generate() {
        obstacles = new ArrayList<>();
        obstacles.add(new Obstacle(20, 20, 50, 150));
        obstacles.add(new Obstacle(WIDTH - 200, HEIGHT - 500, 150, 200));
        obstacles.add(new Obstacle(200, 30, 180, 90));
        obstacles.add(new Obstacle(500, 500, 300, 150));
        obstacles.add(new Obstacle(800, 50, 20, 500));

        for (Obstacle o : obstacles) {
            Main.add(o);
        }
    }

    public static List<Obstacle> getObstacles() {
        return obstacles;
    }
}
