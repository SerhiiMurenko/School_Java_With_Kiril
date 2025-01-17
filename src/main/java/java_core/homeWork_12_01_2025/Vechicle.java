package java_core.homeWork_12_01_2025;

public class Vechicle {

    private double speed;
    private double fuel;

    public Vechicle(double speed) {
        this.speed = speed;
    }

    public Vechicle(double speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }


    public void move() {
        System.out.println("The car is driving.");
    }

}
