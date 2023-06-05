package behavioral_pattern.command;

import behavioral_pattern.command.command.AirConditionalCommand;
import behavioral_pattern.command.command.HeaterCommand;
import behavioral_pattern.command.command.LampCommand;
import behavioral_pattern.command.product.AirConditional;
import behavioral_pattern.command.product.Heater;
import behavioral_pattern.command.product.Lamp;



public class Main {
    public static void main(String[] args) {

        Heater heater = new Heater();
        Lamp lamp = new Lamp();
        AirConditional airConditional = new AirConditional();

        HeaterCommand heaterCommand = new HeaterCommand(heater);
        LampCommand lampCommand = new LampCommand(lamp);
        AirConditionalCommand airConditionalCommand = new AirConditionalCommand(airConditional);
        OkGoogle okGoogle = new OkGoogle();

        okGoogle.setCommand(heaterCommand);
        okGoogle.talk();

        okGoogle.setCommand(lampCommand);
        okGoogle.talk();

        okGoogle.setCommand(airConditionalCommand);
        okGoogle.talk();
    }
}
