package structuralPattern.bridge.phone;

import structuralPattern.bridge.color.Color;

public class AndroidPhone extends Phone {
    public AndroidPhone(Color color) {
        super(color);
    }

    @Override
    public void execute() {
        System.out.println(color.fill() + " Android Phone execute");
    }
}
