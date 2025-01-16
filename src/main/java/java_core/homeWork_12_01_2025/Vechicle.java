package java_core.homeWork_12_01_2025;

public class Vechicle {

    private Double speed;
    private Double fuel;

    public Vechicle(Double speed) {
        this.speed = speed;
    }

    public Vechicle(Double speed, Double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }


    public void move() {
        System.out.println("The car is driving.");
    }

}
