package structuralPattern.adapter;

public class IphoneUser {

    private LighteningPort adapter;

    public IphoneUser(LighteningPort lighteningPort) {
        this.adapter = lighteningPort;
    }

    public void listenMusic() {
        adapter.operation();
    }
}
