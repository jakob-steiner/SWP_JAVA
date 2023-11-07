package at.jakobsteiner.devices;

import at.jakobsteiner.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thermomether {
    private int temperature;
    private List<Observer> observers = new ArrayList<Observer>();

    public Thermomether() {
        setTemperature();
    }

    public void setTemperature() {
        Random random = new Random();
        this.temperature = random.nextInt(40);
        if(this.temperature > 20) {
            informAll(this.temperature);
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void informAll(int temperature) {
        for (Observer observer : observers) {
            observer.inform(temperature);
        }
    }
}
