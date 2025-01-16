package java_core.homeWork_12_01_2025;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Woof Woof");
    }
}
