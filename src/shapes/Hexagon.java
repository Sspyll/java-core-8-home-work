package shapes;
import tools.*;
import utils.*;

public class Hexagon extends Shape implements CalculatesPerimeter, CalculatesDiagonal {
    private int side;

    public Hexagon(int positionX, int positionY, Fill fill, Border border, int side) {
        super(positionX, positionY, fill, border);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String getName() {
        return "shapes.Hexagon";
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * getSide() * getSide()) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * getSide();
    }

    @Override
    public double calculateDiagonal() {
        return 2 * getSide();
    }
}
