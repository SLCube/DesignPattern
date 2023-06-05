package structuralPattern.adapter;

public class AnotherEarPhone implements EarPhone {
    @Override
    public void playMusic() {
        System.out.println("Another EarPhone playing music...");
    }
}
