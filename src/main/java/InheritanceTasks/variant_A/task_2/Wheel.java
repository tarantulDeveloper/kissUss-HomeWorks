package InheritanceTasks.variant_A.task_2;

public class Wheel {
    private String brand;
    private double radius;

    public Wheel(String brand, double radius) {
        this.brand = brand;
        this.radius = radius;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", radius=" + radius +
                '}';
    }
}
