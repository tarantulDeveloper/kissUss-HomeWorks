package InheritanceTasks.variant_B.task_10;

import java.util.List;

public class SmallCars extends Cars  {

    public SmallCars() {
    }

    public SmallCars(String name, double power, double fuelConsumption, double length, double width, double price) {
        super(name, power, fuelConsumption, length, width, price);
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void sortByFuelConsumption(List<Cars> cars) {
       super.sortByFuelConsumption(cars);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getPower() {
        return super.getPower();
    }

    @Override
    public void setPower(double power) {
        super.setPower(power);
    }

    @Override
    public double getFuelConsumption() {
        return super.getFuelConsumption();
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
