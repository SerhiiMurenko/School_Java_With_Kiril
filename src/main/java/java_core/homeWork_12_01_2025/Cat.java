package java_core.homeWork_12_01_2025;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}



