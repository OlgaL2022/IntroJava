package IntroJavaII.Shape;

public class Triangle implements Shape{

    private double length;
    private double breadth;

    public Triangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}
