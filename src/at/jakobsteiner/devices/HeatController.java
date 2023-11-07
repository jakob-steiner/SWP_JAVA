package at.jakobsteiner.devices;

import at.jakobsteiner.interfaces.Observer;

public class HeatController implements Observer {
    public void inform(int temperature) {
        System.out.println("HeatController: " + temperature);
    }
}
