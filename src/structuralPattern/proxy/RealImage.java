package structuralPattern.proxy;

public class RealImage implements Image {

    @Override
    public void show() {
        System.out.println("Real image data");
    }
}
