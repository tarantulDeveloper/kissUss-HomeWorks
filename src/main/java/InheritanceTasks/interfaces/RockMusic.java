package InheritanceTasks.interfaces;

public class RockMusic implements Music{
    @Override
    public void sing() {
        System.out.println("Singing rock...");
    }

    @Override
    public void record() {
        System.out.println("Recording rock...");
    }
}
