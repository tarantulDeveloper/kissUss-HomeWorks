package InheritanceTasks.variant_A.task_3;

public class PlaneWheel {
    private double radius;

    @Override
    public String toString() {
        return "PlainWheel{" +
                "radius=" + radius +
                '}';
    }

    public PlaneWheel(double radius) {
        this.radius = radius;
    }
}
