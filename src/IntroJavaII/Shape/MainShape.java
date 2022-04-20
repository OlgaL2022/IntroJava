package IntroJavaII.Shape;
// Write an interface called Shape that has two methods, perimeter and area and
// write implementation classes called Circle, Square, triangle and rectangle.

public class MainShape {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Area of Circle: " + (float)circle.getArea() + " cm");
        System.out.println("Perimeter of Circle: " + (int)circle.getPerimeter() + " cm");

        Triangle triangle = new Triangle(4, 7);
        System.out.println("Area of Triangle is " + triangle.getArea() + " cm");
        System.out.println("Perimeter of Triangle is: " + triangle.getPerimeter()+ " cm");

        Square square = new Square(7);
        System.out.println("Perimeter of Square is: " + square.getPerimeter()+ " cm");
        System.out.println("Area of Square is: " + square.getArea()+ " cm");

        Rectangle rectangle = new Rectangle(4, 8);
        System.out.println("Perimeter of Rectangle is: " + rectangle.getPerimeter()+ " cm");
        System.out.println("Area of Rectangle is: " + rectangle.getArea()+ " cm");

    }
}
