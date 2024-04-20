package ObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;

    private WeatherData weatherData;

    private float maxTemperature = Float.MIN_VALUE;

    private float minTemperature  = Float.MAX_VALUE;

    private float avgTemperature = 0;

    private int numReadings = 0;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperature = temp;
        maxTemperature = Math.max(temperature, maxTemperature);
        minTemperature = Math.min(temperature, minTemperature);
        avgTemperature = (avgTemperature * numReadings + temperature) / (numReadings + 1);
        numReadings++;
        display();
    }

    @Override
    public void display() {
        System.out.println("Curr temp = " + temperature + "C; Avg temp = " + avgTemperature + "C Min temp = " +
                minTemperature + "C Max temp = " + maxTemperature + "C");
    }
}
