package behavioral_pattern.visitor;

public abstract class City {
    public abstract void accept(TravelVisitor visitor);
}
