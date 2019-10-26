package model;

import java.util.ArrayList;
import java.util.List;

public class DrawableObjectsList<T> extends ArrayList<T> {
    private List<DrawableObjectsObserver> drawableObjectsObservers = new ArrayList<>();

    @Override
    public boolean add(T o) {
        notifyObservers();
        return super.add(o);
    }

    private void notifyObservers() {
        for (DrawableObjectsObserver o : drawableObjectsObservers) {
            o.notifyObjectCountChanged();
        }
    }

    public void registerObserver(DrawableObjectsObserver o) {
        drawableObjectsObservers.add(o);
    }
}
