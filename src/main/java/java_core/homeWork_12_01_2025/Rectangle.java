package java_core.homeWork_12_01_2025;

public class Rectangle extends Shape {
    Double wigth;
    Double height;

    public Rectangle(Double wigth, Double height) {
        this.wigth = wigth;
        this.height = height;
    }

    @Override
    public Double getArea() {
        return wigth * height;
    }


}
