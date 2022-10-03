package InheritanceTasks.variant_A.task_4;

import java.util.ArrayList;

public class District implements DistrictInterface{
    private String district;
    private ArrayList<City> citiesList;

    public District(String district, ArrayList<City> citiesList){
        this.district = district;
        this.citiesList = citiesList;
    }
    @Override
    public String getDistrict() {
        return district;
    }
    @Override
    public void setDistrict(String district) {
        this.district = district;
    }
    @Override
    public ArrayList<City> getCitiesList() {
        return citiesList;
    }
    @Override
    public void setCitiesList(ArrayList<City> citiesList) {
        this.citiesList = citiesList;
    }

    @Override
    public String toString() {
        return "{" +
                "district='" + district + '\'' +
                ", citiesList=" + citiesList +
                '}';
    }
}
