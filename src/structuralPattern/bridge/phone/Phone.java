package structuralPattern.bridge.phone;

import structuralPattern.bridge.color.Color;

public abstract class Phone {
    protected Color color;

    public Phone(Color color) {
        this.color = color;
    }

    public abstract void execute();
}
