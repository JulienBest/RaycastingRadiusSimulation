package controller;

import javafx.scene.layout.Pane;
import model.IMousePositionObserver;

import java.util.ArrayList;
import java.util.List;

public class MouseEventController {

    private List<IMousePositionObserver> observers;
    private static MouseEventController instance;


    public static MouseEventController getInstance(Pane root) {
        if (instance == null) {
            instance = new MouseEventController(root);
        }
        return instance;
    }

    private MouseEventController(Pane root) {
        observers = new ArrayList<>();
        root.setOnMouseMoved(mouseEvent -> {
            for (IMousePositionObserver o : observers) {
                o.notify(mouseEvent.getX(), mouseEvent.getY());
            }
        });
    }

    public void registerObserver(IMousePositionObserver newObserver) {
        this.observers.add(newObserver);
    }
}
