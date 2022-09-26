package InheritanceTasks.variant_A.task_3;

class Main {
    public static void main(String[] args) {
        PlaneEngine engine = new PlaneEngine(250);
        PlaneWheel wheel = new PlaneWheel(40);
        PlaneWing wings = new PlaneWing(100);
        String[] route = {"Bishkek", "Astana"};


        Plane plane = new Plane("Airbus",engine,wheel,wings,route);
        plane.showRoute();

        plane.setRoute(new String[] {"Astana", "San-Francisco"});
        plane.showRoute();
        System.out.println(plane);
    }
}
