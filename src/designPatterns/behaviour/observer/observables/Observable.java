package designPatterns.behaviour.observer.observables;

import designPatterns.behaviour.observer.observers.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setChanged();
}
