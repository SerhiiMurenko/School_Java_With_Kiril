package java_core.homeWork_12_01_2025;

public class Circle extends Shape {
    public Double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * (radius * radius);
    }

}
