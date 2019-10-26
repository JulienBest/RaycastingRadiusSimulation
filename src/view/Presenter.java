package view;

import javafx.scene.Node;
import model.DrawableObjectsList;

public interface Presenter {
    void draw(DrawableObjectsList<Node> drawableObjects);
}
