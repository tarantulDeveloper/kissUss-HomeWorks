package InheritanceTasks.variant_A.task_4;

import java.util.ArrayList;

public class District {
    private String district;
    private ArrayList<City> citiesList;

    public District(String district, ArrayList<City> citiesList){
        this.district = district;
        this.citiesList = citiesList;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public ArrayList<City> getCitiesList() {
        return citiesList;
    }

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
