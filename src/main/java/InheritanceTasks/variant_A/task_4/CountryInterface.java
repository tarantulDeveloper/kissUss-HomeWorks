package InheritanceTasks.variant_A.task_4;

import java.util.ArrayList;

public interface CountryInterface {
    String getCountry();
    void setCountry(String country);
    String getCapital();
    void setCapital(String capital);
    double getSquare();
    void setSquare(double square);
    ArrayList<Region> getRegionList();
    void setRegionList(ArrayList<Region> regionList);
}
