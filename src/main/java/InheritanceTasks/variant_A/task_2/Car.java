package InheritanceTasks.variant_A.task_2;

public class Car implements CarInterface{

    private String brand;
    private double fuel;
    private Wheel wheel;
    private Engine engine;

    public Car(String brand, double fuel, Wheel wheel, Engine engine) {
        this.brand = brand;
        this.fuel = fuel;
        this.wheel = wheel;
        this.engine = engine;
    }
    @Override
    public void Go() {
        System.out.println("Car is going to somewhere...");
    }

    @Override
    public void refuel(double fuel) {
        this.fuel += fuel;
    }

    @Override
    public void changeWheel(Wheel wheel) {
        this.wheel = wheel;
    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", fuel=" + fuel +
                ", wheel=" + wheel +
                ", engine=" + engine +
                '}';
    }

}
