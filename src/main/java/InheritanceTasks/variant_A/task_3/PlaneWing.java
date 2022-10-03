package InheritanceTasks.variant_A.task_3;

public class PlaneWing {
    private double wingspan;

    @Override
    public String toString() {
        return "Wing{" +
                "wingspan=" + wingspan +
                '}';
    }

    public PlaneWing(double wingspan) {
        this.wingspan = wingspan;
    }
}
