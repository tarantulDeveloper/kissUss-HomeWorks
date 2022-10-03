package InheritanceTasks.variant_A.task_10;

public class Animal implements AnimalInterface{
    protected String name;

    public Animal(String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }
}
