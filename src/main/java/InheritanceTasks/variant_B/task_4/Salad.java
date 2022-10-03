package InheritanceTasks.variant_B.task_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Salad implements SaladInterface {
    private final ArrayList<Vegetable> vegetables = new ArrayList<>();

    public Salad(Vegetable... vegetables) {
        this.vegetables.addAll(Arrays.asList(vegetables));
    }

    @Override
    public String toString() {
        return "Salad{" +
                "vegetables=" + vegetables +
                '}';
    }
    @Override
    public double overallColorie() {
        double colorie = 0;
        for (Vegetable vegetable : vegetables) {
            colorie += vegetable.getCalorieContent();

        }
        return colorie;
    }
    @Override
    public ArrayList<Vegetable> filterVegetablesByCalorie(double min, double max) {
        ArrayList<Vegetable> filteredVegetables = new ArrayList<>();
        for (Vegetable vegetable : vegetables) {
            if ((vegetable.getCalorieContent() >= min) && (vegetable.getCalorieContent() <= max)) {
                filteredVegetables.add(vegetable);
            }
        }
        return filteredVegetables;
    }
}
