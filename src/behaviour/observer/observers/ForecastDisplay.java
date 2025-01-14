package behaviour.observer.observers;

import behaviour.observer.observables.Observable;
import behaviour.observer.observables.WeatherData;

import java.util.LinkedList;

public class ForecastDisplay implements Observer, Display {
    private LinkedList<Integer> temps = new LinkedList<>();
    private LinkedList<Integer> winds = new LinkedList<>();
    private LinkedList<Integer> rains = new LinkedList<>();

    int sampleSize;

    int avgTemp;
    int avgWind;
    int avgRain;

    int sumTemp;
    int sumWind;
    int sumRain;

    private Observable observable;

    public ForecastDisplay(Observable observable, int sampleSize) {
        this.observable = observable;
        this.sampleSize = sampleSize;

        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Forecast display:\n\ttemp: %d, wind: %d, rain: %d", avgTemp, avgWind, avgRain);
    }

    @Override
    public void update() {
        WeatherData weatherData = (WeatherData) observable;
        this.temps.addLast(weatherData.getTemp());
        this.winds.addLast(weatherData.getWind());
        this.rains.addLast(weatherData.getRain());

        this.sumTemp += weatherData.getTemp();
        this.sumWind += weatherData.getWind();
        this.sumRain += weatherData.getRain();

        if(this.temps.size()>sampleSize){
            this.sumTemp -= this.temps.removeFirst();
            this.sumWind -= this.winds.removeFirst();
            this.sumRain -= this.rains.removeFirst();
        }

        this.avgTemp = this.sumTemp / this.temps.size();
        this.avgWind = this.sumWind / this.winds.size();
        this.avgRain = this.sumRain / this.rains.size();
    }
}
