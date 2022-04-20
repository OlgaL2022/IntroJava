package IntroJavaII.Shape;

public class Square implements Shape {
    public double side;

    public Square(double side) {
        this.side = side;

    }
    public double getPerimeter() {
            return side * 4;
    }
    public double getArea() {
            return side * side;

    }
}
