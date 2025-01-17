package java_core.homeWork_12_01_2025;

public class Rectangle extends Shape {
    double wigth;
    double height;

    public Rectangle(double wigth, double height) {
        this.wigth = wigth;
        this.height = height;
    }

    @Override
    public double getArea() {
        return wigth * height;
    }


}
