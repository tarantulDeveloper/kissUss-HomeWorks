package InheritanceTasks.variant_B.task_10;

import java.util.ArrayList;
import java.util.List;

public class TaksoPark {
    private List<Cars> cars;

    public TaksoPark() {
    }

    public TaksoPark(List<Cars> cars) {
        this.cars = cars;
    }

    public List<Cars> getCars() {
        return cars;
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }


    public void priceOfAllCars(List<Cars> cars) {
        double price = 0;
        for (Cars car : cars) {
            price += car.getPrice();
        }
        System.out.println("Общая стоимость машин в таксопарке: " + price);
    }

    public void findCarsBetweenPrices(List<Cars> cars, double low, double max) {
        List<Cars> list = new ArrayList<>();
        int num = 0;
        for (Cars car1 : cars) {
            if (car1.getPrice() >= low && car1.getPrice() <= max) {
                num++;
                System.out.println("---------------------------------");
                System.out.println("Наименование: " + car1.getName());
                System.out.println("Мощность: " + car1.getPower());
                System.out.println("Цена: " + car1.getPrice());
                System.out.println();
            }
        }
        if (cars.isEmpty()) {
            System.out.println("Нет машин по заданному диапазону !");
        }
    }
}


