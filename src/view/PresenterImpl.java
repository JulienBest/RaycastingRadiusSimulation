package view;

import javafx.scene.Node;
import model.DrawableObjectsList;

public class PresenterImpl implements Presenter {

    @Override
    public void draw(DrawableObjectsList<Node> drawableObjects) {
        Main.getRoot().getChildren().clear();
        Main.getRoot().getChildren().addAll(drawableObjects);
    }
}
