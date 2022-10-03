package InheritanceTasks.variant_B.task_4;

public class Vegetable implements Comparable<Vegetable>{
    private double calorieContent;
    private double price;
    private  String name;

    public Vegetable(String name,double calorieContent, double price) {
        this.calorieContent = calorieContent;
        this.price = price;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(double calorieContent) {
        this.calorieContent = calorieContent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ " + name +
                " calorieContent=" + calorieContent +
                ", price=" + price + " }" ;
    }

    @Override
    public int compareTo(Vegetable o) {
        return Double.compare(o.getPrice(), price);
    }



}
