// Level1 - Problem 2: Circle with constructor chaining
public class Circle {
    private double radius;

    public Circle() {
        this(1.0); // constructor chaining
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + ", area=" + String.format("%.2f", area()) + "}";
    }
}