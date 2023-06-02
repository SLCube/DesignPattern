package structuralPattern.bridge.brush;

import structuralPattern.bridge.color.Color;

public class HBPencil extends Brush{

    private String type;

    public HBPencil(Color color) {
        super(color);
        type = "[HBPencil]";
    }

    @Override
    public String draw() {
        return type + " " + color.fill();
    }
}
