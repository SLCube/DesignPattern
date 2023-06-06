package behavioral_pattern.visitor;

public interface TravelVisitor {
    void visit(CityA cityA);
    void visit(CityB cityB);

    void visit(CityC cityC);
}
