package displays;

import observer.DisplayElement;
import observer.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float lastPressure;
    private float currentPressure;

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Forecast: Pressure change indicates weather trend.");
    }
}
