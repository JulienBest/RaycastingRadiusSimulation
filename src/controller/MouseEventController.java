package controller;

import javafx.scene.layout.Pane;
import model.MousePositionObserver;

import java.util.ArrayList;
import java.util.List;

public class MouseEventController {

    private List<MousePositionObserver> mousePositionObservers;
    private static MouseEventController instance;
    private static Pane root;


    public static MouseEventController getInstance() {
        if (instance == null) {
            instance = new MouseEventController(root);
        }
        return instance;
    }

    private MouseEventController(Pane root) {
        mousePositionObservers = new ArrayList<>();
        root.setOnMouseMoved(mouseEvent -> {
            for (MousePositionObserver o : mousePositionObservers) {
                o.notifyMousePositionChanged(mouseEvent.getX(), mouseEvent.getY());
            }
        });
    }

    public void registerObserver(MousePositionObserver newMousePositionObserver) {
        this.mousePositionObservers.add(newMousePositionObserver);
    }

    public static void setRoot(Pane root) {
        MouseEventController.root = root;
    }
}
