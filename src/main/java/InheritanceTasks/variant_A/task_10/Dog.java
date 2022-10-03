package InheritanceTasks.variant_A.task_10;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public String voice(){
        return "av av";
    }
    public String jump(){
        return "jumping";
    }
    public String run(){
        return "run";
    }
    public String kusat(){
        return "kusat";
    }
    public String toString(){
        return "name: "+name +"\nkusat: "+ kusat()+"\nRun: "+run()+"\nJump"+jump()+"Voice: "+voice();

    }



}
