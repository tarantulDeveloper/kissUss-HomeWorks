package InheritanceTasks.variant_B.task_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Vegetable vegetable = new Vegetable("pamidor",130,100);
        Vegetable vegetable1 = new Vegetable("ogur",12,120);
        Vegetable vegetable2 = new Vegetable("luk",134,20);
       /* ArrayList<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(vegetable); vegetables.add(vegetable1); vegetables.add(vegetable2);
        Collections.sort(vegetables);
        System.out.println(vegetables);*/

        Salad salad = new Salad(vegetable,vegetable1, vegetable2);
        System.out.println(salad.filterVegetablesByCalorie(131,140));

    }
}