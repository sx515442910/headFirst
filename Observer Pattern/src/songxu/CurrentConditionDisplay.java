package songxu;

public class CurrentConditionDisplay implements DisplayElement, Observer{
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + " temperature " + temp + " humidity " + humidity + " pressure " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
