package behavioral_pattern.command.command;

import behavioral_pattern.command.product.Heater;

public class HeaterCommand implements Command {

    private Heater heater;

    public HeaterCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void run() {
        heater.powerOn();
    }
}
