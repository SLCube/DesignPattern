package behavioral_pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class TravelPlanner {
    private List<City> cities = new ArrayList<>();

    public void addCity(City city) {
        cities.add(city);
    }

    public void processTravelPlan(TravelVisitor visitor) {
        for (City city : cities) {
            city.accept(visitor);
        }
    }
}
