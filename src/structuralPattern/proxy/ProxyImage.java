package structuralPattern.proxy;

public class ProxyImage implements Image {

    private RealImage realImage;

    @Override
    public void show() {
        System.out.println("Proxy image data");
        if (realImage == null) {
            realImage = new RealImage();
            realImage.show();
        }
    }
}
