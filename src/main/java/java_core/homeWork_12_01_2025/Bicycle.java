package java_core.homeWork_12_01_2025;

public class Bicycle extends Vechicle{

    private String typeRoad;

    public Bicycle(double speed,String typeRoad){
        super(speed);
        this.typeRoad = typeRoad;
           }

    @Override
    public void move() {
        System.out.println(" The bicycle is pedaling. ");
    }
}
