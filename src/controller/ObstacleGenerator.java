package controller;

import model.Obstacle;
import view.Main;

import static utils.GlobalConstants.HEIGHT;
import static utils.GlobalConstants.WIDTH;

public class ObstacleGenerator {

    public void generate() {
        Main.add(new Obstacle(20, 20, 50, 150));
        Main.add(new Obstacle(WIDTH - 200, HEIGHT - 500, 150, 200));
        Main.add(new Obstacle(200, 30, 180, 90));
        Main.add(new Obstacle(500, 500, 300, 150));
        Main.add(new Obstacle(800, 50, 20, 500));
    }
}
