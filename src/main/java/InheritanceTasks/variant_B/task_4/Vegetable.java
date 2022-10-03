package InheritanceTasks.variant_B.task_4;

public class Vegetable implements Comparable<Vegetable>, VegetableInterface{
    private double calorieContent;
    private double price;
    private  String name;

    public Vegetable(String name,double calorieContent, double price) {
        this.calorieContent = calorieContent;
        this.price = price;
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public double getCalorieContent() {
        return calorieContent;
    }
    @Override
    public void setCalorieContent(double calorieContent) {
        this.calorieContent = calorieContent;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
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
        return Double.compare(price,o.getPrice());
    }
}
