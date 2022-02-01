package stmtsmethods;

public class AreaCalculator {
    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }
        double areaOfCirle = Math.PI * radius * radius;
        return areaOfCirle;
    }

    public static double area(double length, double breadth) {
        if(length < 0 || breadth < 0) {
            return -1;
        }
        double areaOfRect = length * breadth;
        return areaOfRect;
    }
}
