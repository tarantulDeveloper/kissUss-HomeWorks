package InheritanceTasks.variant_A.task_2;

class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("Michelin",17);
        Wheel wheel2 = new Wheel("Toyota", 20);
        Engine engine = new Engine(3.5);
        Car car = new Car("Mercedes-Benz",0,wheel,engine);
        System.out.println(car);
        car.refuel(34);
        Wheel wheel1 = new Wheel("Kama", 17);
        car.changeWheel(wheel1);
        System.out.println(car);
    }
}
