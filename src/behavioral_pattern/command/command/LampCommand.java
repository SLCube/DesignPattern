package behavioral_pattern.command.command;

import behavioral_pattern.command.product.Lamp;

public class LampCommand implements Command {

    private Lamp lamp;

    public LampCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void run() {
        lamp.turnOn();
    }
}
