package structuralPattern.decorator;

public class FighterPlane implements Weapon {
    @Override
    public void attack() {
        System.out.println("Basic Fighter Plane attack");
    }
}
