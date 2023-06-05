package behavioral_pattern.command.command;

import behavioral_pattern.command.product.AirConditional;

public class AirConditionalCommand implements Command {

    private AirConditional airConditional;

    public AirConditionalCommand(AirConditional airConditional) {
        this.airConditional = airConditional;
    }

    @Override
    public void run() {
        airConditional.turnOn();
    }
}
