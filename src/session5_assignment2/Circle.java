package session5_assignment2; //package declaration

/*
 * A method that is declared as abstract and does not have implementation is known as abstract method.
 */

public class Circle extends Figure{
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // A = p r^2
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        // P = 2pr
        return 2 * pi * radius;
    }
}

