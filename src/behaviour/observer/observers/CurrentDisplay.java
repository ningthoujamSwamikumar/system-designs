package behaviour.observer.observers;

import behaviour.observer.observables.Observable;
import behaviour.observer.observables.WeatherData;

public class CurrentDisplay implements Observer, Display {
    private int temp;
    private int wind;
    private int rain;

    private Observable observable;

    public CurrentDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current display:\n\ttemp: %d, wind: %d, rain: %d\n", this.temp, this.wind, this.rain);
    }

    @Override
    public void update() {
        WeatherData weatherData = (WeatherData) observable;
        this.temp = weatherData.getTemp();
        this.wind = weatherData.getWind();
        this.rain = weatherData.getRain();
    }
}
