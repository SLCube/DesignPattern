package structuralPattern.adapter;

public class Main {
    public static void main(String[] args) {
        IphoneUser iphoneUser = new IphoneUser(new EarPhoneAdapter(new ThreePointFiveEarPhone()));

        iphoneUser.listenMusic();
    }
}
