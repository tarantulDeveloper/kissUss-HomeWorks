package InheritanceTasks.variant_B.task_10;

import java.util.Comparator;
import java.util.List;

public class Cars {
    private String name;
    private double power;
    private double fuelConsumption;
    private double length;
    private double width;
    private double price;

    public Cars() {
    }

    public Cars(String name, double power, double fuelConsumption, double length, double width, double price) {
        this.name = name;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.length = length;
        this.width = width;
        this.price = price;
    }

    public void show() {
        System.out.println("Наименование: " + this.name);
        System.out.println("Мощность: " + this.power);
        System.out.println("Потребление топлива: " + this.fuelConsumption);
    }

    public void sortByFuelConsumption(List<Cars> cars) {
        cars.sort(Comparator.comparing(x -> x.fuelConsumption));

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", fuelConsumption=" + fuelConsumption +
                ", length=" + length +
                ", width=" + width +
                ", price=" + price +
                '}';
    }
}
