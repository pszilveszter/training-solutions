package finalmodifier;

public class CylinderCalculatorBasedOnCircle {
    public double calculateVolume(double r, double h) {
        CircleCalculator calculator = new CircleCalculator();
        return calculator.calculateArea(r) * h;
    }

    public double calculateSurfaceArea(double r, double h) {
        CircleCalculator calculator = new CircleCalculator();
        return calculator.calculatePerimeter(r) * (r + h);
    }
}
