package java_core.homeWork_12_01_2025;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

}
