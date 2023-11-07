package at.jakobsteiner;

import at.jakobsteiner.devices.AwningController;
import at.jakobsteiner.devices.HeatController;
import at.jakobsteiner.devices.Thermomether;

public class HouseControl {
    public static void main(String[] args) {
        AwningController ac1 = new AwningController();
        AwningController ac2 = new AwningController();
        HeatController hc1 = new HeatController();
        HeatController hc2 = new HeatController();
        HeatController hc3 = new HeatController();

        Thermomether thermomether = new Thermomether();

        thermomether.addObserver(ac1);
        thermomether.addObserver(hc2);
        thermomether.addObserver(hc3);

        for (int i = 0; i < 20; i++) {
            thermomether.setTemperature();
        }
    }
}
