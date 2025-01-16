package java_core.homeWork_12_01_2025;

public class MainApp {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 2);
        Dog dog = new Dog("Sharik", 10);
        Cat cat = new Cat("Barsik", 5);
//        animal.speak();
//        dog.speak();
//        cat.speak();

        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(2.3, 2.4);
        Circle circle = new Circle(10.0);

//        System.out.println(rectangle.getArea());
//        System.out.println(circle.getArea());

        Car car = new Car(340.0,50.0,4);
        Bicycle bicycle = new Bicycle(35.0, "Cross");

        car.move();
        bicycle.move();


    }
}
