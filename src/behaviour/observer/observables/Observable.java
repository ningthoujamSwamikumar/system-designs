package behaviour.observer.observables;

import behaviour.observer.observers.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setChanged();
}
