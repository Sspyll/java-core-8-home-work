package shapes;
import tools.*;
import utils.*;

public class Rectangle extends Shape implements CalculatesPerimeter, CalculatesDiagonal {
    private int length;
    private int width;

    public Rectangle(int positionX, int positionY, Fill fill, Border border, int length, int width) {
        super(positionX, positionY, fill, border);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String getName() {
        return "shapes.Rectangle";
    }

    @Override
    public double calculateArea() {
        return getLength() * getWidth();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(getLength(), 2) + Math.pow(getWidth(), 2));
    }
}
