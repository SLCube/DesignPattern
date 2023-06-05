package structuralPattern.adapter;

public class EarPhoneAdapter implements LighteningPort {

    private EarPhone earPhone;

    public EarPhoneAdapter(EarPhone earPhone) {
        this.earPhone = earPhone;
    }

    @Override
    public void operation() {
        earPhone.playMusic();
    }
}
