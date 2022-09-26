package InheritanceTasks.variant_B.task_10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaksoPark taksoPark = new TaksoPark();
        Cars car = new Cars();

        MiniCars miniCars = new MiniCars("Tiko", 20.5, 20.5, 205.3, 20, 10000);

        SmallCars smallCars = new
                SmallCars("Fit", 20.5, 20.5, 205.3, 20, 12000);

        MediumCars mediumCars = new MediumCars("Accord", 20.5, 20.5, 205.3, 20, 23500);

        SportCars sportCars = new SportCars("Subaru", 20.5, 20.5, 205.3, 20, 1000);

        List<Cars> cars = new ArrayList<>();
        cars.add(miniCars);
        cars.add(smallCars);
        cars.add(mediumCars);
        cars.add(sportCars);

        //Цена всех машин в таксопарке
        taksoPark.priceOfAllCars(cars);

        //Отсортировать по потреблению бензина
        car.sortByFuelConsumption(cars);

        //Найти машины по заданному диапазону
        taksoPark.findCarsBetweenPrices(cars, 1000.0 , 5000.0);



    }
}
