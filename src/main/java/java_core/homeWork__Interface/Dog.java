package java_core.homeWork__Interface;

public class Dog implements IRunnable,ISwimmable {

    @Override
    public void run() {
        System.out.println("The dog is running");
    }

    @Override
    public void swim() {
        System.out.println("The dog is swimming");

    }
}
