package IntroJavaII.Shape;

public class Circle implements Shape {

    private double radius;

    // Getters and setters
    //public double getRadius() {
    //    return this.radius;
    //}

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        // Formula for area of a circle: PI * radius^2
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double getPerimeter() {
            return Math.PI * (2 * this.radius);
        }

    }

