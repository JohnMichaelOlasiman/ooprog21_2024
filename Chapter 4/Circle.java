public class Circle {
    private static double radius, diameter, area;

    Circle() {
        radius = 1.0;
        diameter = 2.0  * radius;
        area = Math.PI * (radius * radius);
    }

    void setRadius(double rad) {
        radius = rad;
        diameter = 2.0 * rad;
        area = Math.PI * (rad * rad);
    }

    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }
}