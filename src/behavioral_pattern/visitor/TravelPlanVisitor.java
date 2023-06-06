package behavioral_pattern.visitor;

public class TravelPlanVisitor implements TravelVisitor {
    @Override
    public void visit(CityA cityA) {
        System.out.println("cityA 방문");
    }

    @Override
    public void visit(CityB cityB) {
        System.out.println("cityB 방문");
    }

    @Override
    public void visit(CityC cityC) {
        System.out.println("cityC 방문");
    }
}
