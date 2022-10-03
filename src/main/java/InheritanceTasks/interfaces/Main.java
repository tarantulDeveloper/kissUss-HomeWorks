package InheritanceTasks.interfaces;

public class Main {

    public static void main(String[] args) {

        Music rockMusic = new RockMusic();
        Music classicalMusic = new ClassicMusic();

        rockMusic.record();
        rockMusic.sing();
        classicalMusic.sing();

    }
    static Music getMusicSort(Music music) {
        return music;
    }

}
