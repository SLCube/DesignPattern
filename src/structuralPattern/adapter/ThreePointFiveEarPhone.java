package structuralPattern.adapter;

public class ThreePointFiveEarPhone implements EarPhone {
    @Override
    public void playMusic() {
        System.out.println("Three Point Five EarPhone playing music...");
    }
}
