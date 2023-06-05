package structuralPattern.decorator;

public class PlasmaPlaneDecorator extends FighterPlaneDecorator {

    public PlasmaPlaneDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Plasma Fighter Plane Attack!!");
    }
}
