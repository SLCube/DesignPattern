package structuralPattern.bridge.color;

import structuralPattern.bridge.color.Color;

public class Red implements Color {
    @Override
    public String fill() {
        return "빨간색";
    }
}
