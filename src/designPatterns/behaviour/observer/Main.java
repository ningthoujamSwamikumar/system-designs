package designPatterns.behaviour.observer;

import designPatterns.behaviour.observer.observables.WeatherData;
import designPatterns.behaviour.observer.observers.CurrentDisplay;
import designPatterns.behaviour.observer.observers.ForecastDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData, 5);

        System.out.println("Initial display states:");
        currentDisplay.display();
        forecastDisplay.display();

        weatherData.setChanged();
        System.out.printf("\nFirst set change: \n\ttemp: %d, wind: %d, rain: %d\n", weatherData.getTemp(), weatherData.getWind(), weatherData.getRain());

        System.out.println("display states after first change");
        currentDisplay.display();
        forecastDisplay.display();

        weatherData.setChanged();
        System.out.printf("\nSecond set change: \n\ttemp: %d, wind: %d, rain: %d\n", weatherData.getTemp(), weatherData.getWind(), weatherData.getRain());

        System.out.println("display states after second change");
        currentDisplay.display();
        forecastDisplay.display();

    }
}
