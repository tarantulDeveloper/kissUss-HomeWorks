package InheritanceTasks.variant_A.task_4;

import java.util.ArrayList;

public class Country {
    private String country;
    private String capital;
    private double square;
    private ArrayList<Region> regionList;

    public Country(String country, String capital, double square, ArrayList<Region> regionList) {
        this.country = country;
        this.capital = capital;
        this.square = square;
        this.regionList = regionList;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public ArrayList<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(ArrayList<Region> regionList) {
        this.regionList = regionList;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", capital='" + capital + '\'' +
                ", square=" + square +
                ", regionList=" + regionList +
                '}';
    }

    public int regionsCount() {
        int count = 0;
        for(Region region: regionList) {
            count++;
        }
        return count;
    }

    public void getAllDistrictCenters() {
        System.out.println("District centers:");
        ArrayList<ArrayList<District>> districts = new ArrayList<>();
        for(Region region : regionList) {
            districts.add(region.getDistrictList());
        }
        for (ArrayList<District> district : districts) {
            System.out.println(district);
        }
    }
}
