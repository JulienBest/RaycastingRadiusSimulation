package view;

import javafx.scene.Node;

import java.util.List;

public class PresenterImpl implements Presenter {

    @Override
    public void draw(List<Node> drawableObjects) {
        Main.getRoot().getChildren().clear();
        Main.getRoot().getChildren().addAll(drawableObjects);
    }
}
