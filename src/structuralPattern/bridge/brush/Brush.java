package structuralPattern.bridge.brush;

import structuralPattern.bridge.color.Color;

public abstract class Brush {
    protected Color color;

    public Brush(Color color) {
        this.color = color;
    }

    public abstract String draw();
}
