package InheritanceTasks.variant_A.task_3;

import java.util.Arrays;

public class Plane {
    private String brand;
    private PlaneEngine planeEngine;
    private PlaneWheel planeWheel;
    private PlaneWing planeWing;
    private String[] route;

    public Plane(String brand, PlaneEngine planeEngine, PlaneWheel planeWheel, PlaneWing planeWing, String[] route) {
        this.brand = brand;
        this.planeEngine = planeEngine;
        this.planeWheel = planeWheel;
        this.planeWing = planeWing;
        this.route = route;
    }


    void Fly() {
        System.out.println(this.brand + " is flying...");
    }

    void setRoute(String[] route) {
        this.route = route;
    }

    void showRoute() {
        System.out.println(this.brand + " is flying from " + this.route[0] + " to " + this.route[1]);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "brand='" + brand + '\'' +
                ", planeEngine=" + planeEngine +
                ", planeWheel=" + planeWheel +
                ", planeWing=" + planeWing +
                ", route=" + Arrays.toString(route) +
                '}';
    }
}
