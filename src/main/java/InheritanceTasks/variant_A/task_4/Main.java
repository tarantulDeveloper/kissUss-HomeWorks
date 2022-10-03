package InheritanceTasks.variant_A.task_4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        City karakol  = new City("Karakol");
        ArrayList<City> cities = new ArrayList<>();
        cities.add(karakol);

        District akSuu = new District("Ak-Suu",cities);
        ArrayList<District> districts = new ArrayList<>();
        districts.add(akSuu);

        Region issykKul = new Region("Issyk-Kul",districts);
        ArrayList<Region> regions = new ArrayList<>();
        regions.add(issykKul);

        Country country = new Country("Кыргызстан","Бишкек", 199.900,regions);
        System.out.println(country);
        System.out.println(country.getCapital());
        //System.out.println(country.getRegionList());
        //System.out.println();
        country.getAllDistrictCenters();

    }
}
