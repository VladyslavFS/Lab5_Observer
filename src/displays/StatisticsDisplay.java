package displays;

import observer.DisplayElement;
import observer.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemp = Float.MAX_VALUE;
    private float maxTemp = Float.MIN_VALUE;
    private float sumTemp;
    private int numReadings;

    public void update(float temp, float humidity, float pressure) {
        sumTemp += temp;
        numReadings++;

        if (temp > maxTemp) maxTemp = temp;
        if (temp < minTemp) minTemp = temp;

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature: " + (sumTemp / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
