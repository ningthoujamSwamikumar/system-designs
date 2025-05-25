package designPatterns.behaviour.observer.observables;

import designPatterns.behaviour.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Observable{
    private int temp;
    private int wind;
    private int rain;

    private List<Observer> observers = new ArrayList<>();
    Random random = new Random();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }

    @Override
    public void setChanged() {
        //randomly set new data
        this.temp = random.nextInt(25, 35);
        this.wind = random.nextInt(2, 10);
        this.rain = random.nextInt(1, 5);
        notifyObservers();
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public int getRain() {
        return rain;
    }

    public void setRain(int rain) {
        this.rain = rain;
    }
}
