package ObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;

    private WeatherData weatherData;

    private float modelParam1 = 0;

    private float modelParam2 = 0;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    private void fit(float temp) {
        // for now use a simple model that returns average as the prediction
        modelParam1 = (modelParam1 * modelParam2 + temp) / (modelParam2 + 1);
        modelParam2++;
    }

    private float predict() {
        return modelParam1;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        fit(temp);
        display();
    }

    @Override
    public void display() {
        System.out.println("The predicted temperature today is: " + predict() + "C");
    }


}
