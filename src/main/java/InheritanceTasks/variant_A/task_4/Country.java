package InheritanceTasks.variant_A.task_4;

import java.util.ArrayList;

public class Country implements CountryInterface{
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
    @Override
    public String getCountry() {
        return country;
    }
    @Override
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String getCapital() {
        return capital;
    }
    @Override
    public void setCapital(String capital) {
        this.capital = capital;
    }
    @Override
    public double getSquare() {
        return square;
    }
    @Override
    public void setSquare(double square) {
        this.square = square;
    }
    @Override
    public ArrayList<Region> getRegionList() {
        return regionList;
    }
    @Override
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
