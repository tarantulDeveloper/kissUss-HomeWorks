package InheritanceTasks.variant_A.task_3;

public class PlaneEngine {
    private double liftingPower;

    @Override
    public String toString() {
        return "PlainEngine{" +
                "liftingPower=" + liftingPower +
                '}';
    }

    public PlaneEngine(double liftingPower) {
        this.liftingPower = liftingPower;
    }
}
