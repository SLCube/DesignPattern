package behavioral_pattern.visitor;

public class CityA extends City {
    @Override
    public void accept(TravelVisitor visitor) {
        visitor.visit(this);
    }
}
