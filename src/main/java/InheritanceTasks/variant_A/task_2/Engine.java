package InheritanceTasks.variant_A.task_2;

public class Engine {
    private double capacity;

    Engine(double capacity) {
        this.capacity = capacity;
    }

    double getCapacity() {
        return capacity;
    }

    void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                '}';
    }
}
