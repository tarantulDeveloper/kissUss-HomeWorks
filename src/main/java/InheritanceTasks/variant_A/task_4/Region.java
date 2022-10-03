package InheritanceTasks.variant_A.task_4;

import java.util.ArrayList;
import java.util.List;

public class Region implements RegionInterface{
    private String region;
    private ArrayList<District> districtList;

    public Region(String region, ArrayList<District> districtList) {
        this.region = region;
        this.districtList = districtList;
    }

    @Override
    public String getRegion() {
        return region;
    }

    @Override
    public void setRegion(String region) {
        this.region = region;
    }
    @Override
    public ArrayList<District> getDistrictList() {
        return districtList;
    }
    @Override
    public void setDistrictList(ArrayList<District> districtList) {
        this.districtList = districtList;
    }

    @Override
    public String toString() {
        return "region='" + region + '\'' +
                ", districtList=" + districtList +
                '}';
    }
}