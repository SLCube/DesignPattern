package structuralPattern.bridge.brush;

import structuralPattern.bridge.color.Color;

public class Monami extends Brush {

    private String type;

    public Monami(Color color) {
        super(color);
        type = "[Monami]";
    }

    @Override
    public String draw() {
        return type + " " + color.fill();
    }
}
