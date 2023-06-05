package structuralPattern.bridge.phone;

import structuralPattern.bridge.color.Color;

public class IPhone extends Phone {
    public IPhone(Color color) {
        super(color);
    }

    @Override
    public void execute() {
        System.out.println(color.fill() + " IPhone execute");
    }
}
