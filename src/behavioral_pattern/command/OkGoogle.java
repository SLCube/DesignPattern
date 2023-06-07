package behavioral_pattern.command;

import behavioral_pattern.command.command.Command;

public class OkGoogle {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void talk() {
        command.run();
    }
}
