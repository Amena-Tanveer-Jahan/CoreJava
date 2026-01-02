package basics;

sealed abstract class Shape {// permits Circle, Rectangle
    public abstract double area();
}

final class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    public double area() { return Math.PI * radius * radius; }
}

non-sealed class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length; this.width = width;
    }
    public double area() { return length * width; }
}

public class SealedClass {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle area: " + s2.area());
    }
}

