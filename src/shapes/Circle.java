package shapes;
import tools.*;
import utils.*;

public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(int positionX, int positionY, Fill fill, Border border, double radius) {
        super(positionX, positionY, fill, border);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateDiameter() {
        return 2 * getRadius();
    }

    public double calculateCircumference() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String getName() {
        return "shapes.Circle";
    }

    @Override
    public double calculateArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
