package structuralPattern.adapter;

public class Main {
    public static void main(String[] args) {
        IphoneUser userA = new IphoneUser(new EarPhoneAdapter(new ThreePointFiveEarPhone()));
        userA.listenMusic();

        IphoneUser userB = new IphoneUser(new EarPhoneAdapter(new AnotherEarPhone()));
        userB.listenMusic();
    }
}
