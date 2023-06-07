package behavioral_pattern.visitor;

public class CityC extends City {
    @Override
    public void accept(TravelVisitor visitor) {
        visitor.visit(this);
    }
}
