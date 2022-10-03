package InheritanceTasks.interfaces;

public class ClassicMusic implements Music{
    @Override
    public void sing() {
        System.out.println("Classic is playing...");

    }

    @Override
    public void record() {
        System.out.println("Classic is being recorded...");
    }

    public void unique() {
        System.out.println("this is unique method of classical music");
    }
}
