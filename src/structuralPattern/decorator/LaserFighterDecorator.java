package structuralPattern.decorator;

public class LaserFighterDecorator extends FighterPlaneDecorator {

    public LaserFighterDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Laser Fighter Plane Attack!!");
    }
}
