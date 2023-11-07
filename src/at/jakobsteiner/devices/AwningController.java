package at.jakobsteiner.devices;

import at.jakobsteiner.interfaces.Observer;

public class AwningController implements Observer {

    @Override
    public void inform(int temperature) {
        System.out.println("AwningController: " + temperature);
    }
}
