package behavioral_pattern.visitor;

public class CityB extends City {
    @Override
    public void accept(TravelVisitor visitor) {
        visitor.visit(this);
    }
}
