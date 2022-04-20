package IntroJavaII.Shape;

public class Rectangle implements Shape {
    public double height;
    public double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 *(height + width);
    }
    public double getArea() {
        return height * width;

    }
}

