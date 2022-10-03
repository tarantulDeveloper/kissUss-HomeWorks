package InheritanceTasks.variant_A.task_10;

public class Dog extends Animal implements DogInterface{
    public Dog(String name){
        super(name);
    }
    public String voice(){
        return "av av";
    }
    @Override
    public String jump(){
        return "jumping";
    }
    @Override
    public String run(){
        return "run";
    }
    @Override
    public String kusat(){
        return "kusat";
    }
    public String toString(){
        return "name: "+name +"\nkusat: "+ kusat()+"\nRun: "+run()+"\nJump"+jump()+"Voice: "+voice();

    }



}
