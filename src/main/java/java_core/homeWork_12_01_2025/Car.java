package java_core.homeWork_12_01_2025;

public class Car extends Vechicle {

    public int numberOfDoors;

    public Car(double speed, double fuel, int numberOfDoors) {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void move() {
        System.out.println(" The car is moving. ");
    }
}

