package finalmodifier;

public class CylinderCalculator {

    public double calculateVolume(double r, double h) {
        //return CircleCalculator.calculateArea(r) * h;
        //USE final variable + revert static modifier on relevant method
        return r * r * CircleCalculator.PI * h;
    }

    public double calculateSurfaceArea(double r, double h) {
        //return CircleCalculator.calculatePerimeter(r) * (r + h);
        //USE final variable + revert static modifier on relevant method
        return 2 * CircleCalculator.PI * r * (r + h);
    }
}
