package numbers;

public class Circle {
    public final static double PI = 3.14;
    private int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public double perimeter() {
        return 2 * diameter * PI;
    }

    public double area() {
        return Math.pow(diameter,2) * PI;
    }
}
