package InheritanceTasks.variant_A.task_4;

public class City {
    private String city;

    public City(String city){
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return city;
    }
}
