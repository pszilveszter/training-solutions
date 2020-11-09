package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        System.out.println("1,2 egység sugarú kör kerülete = " + new CircleCalculator().calculatePerimeter(1.2));
        System.out.println("1,2 egység sugarú kör területe = " + new CircleCalculator().calculateArea(1.2));
        System.out.println("1,2 egység sugarú és 1,3 egység magas henger térfogata = " + new CylinderCalculator().calculateVolume(1.2,1.3));
        System.out.println("1,2 egység sugarú és 1,3 egység magas henger felülete = " + new CylinderCalculator().calculateSurfaceArea(1.2,1.3));

        System.out.println("ugyanannak a hengernek a térfogata máshogy: " + new CylinderCalculatorBasedOnCircle().calculateVolume(1.2,1.3));
        System.out.println("ugyanannak a hengernek a felülete máshogy: " + new CylinderCalculatorBasedOnCircle().calculateSurfaceArea(1.2,1.3));
    }
}
