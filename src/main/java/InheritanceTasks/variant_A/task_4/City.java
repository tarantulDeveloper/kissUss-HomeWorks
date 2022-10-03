package InheritanceTasks.variant_A.task_4;

public class City implements CityInterface{
    private String city;

    public City (String city){
        this.city = city;
    }
    @Override
    public String getCity() {
        return city;
    }
    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return city;
    }
}
