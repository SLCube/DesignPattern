package behavioral_pattern.visitor;

public class Main {
    public static void main(String[] args) {
        TravelPlanner travelPlanner = new TravelPlanner();
        travelPlanner.addCity(new CityA());
        travelPlanner.addCity(new CityB());
        travelPlanner.addCity(new CityC());

        TravelPlanVisitor visitor = new TravelPlanVisitor();
        travelPlanner.processTravelPlan(visitor);
    }
}
