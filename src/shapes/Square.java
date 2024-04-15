package shapes;
import tools.*;
import utils.*;

public class Square extends Shape implements CalculatesPerimeter, CalculatesDiagonal {
    private int side;

    public Square(int positionX, int positionY, Fill fill, Border border, int side) {
        super(positionX, positionY, fill, border);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String getName() {
        return "shapes.Square";
    }

    @Override
    public double calculateArea() {
        return getSide() * getSide();
    }

    @Override
    public double calculatePerimeter() {
        return 4 * getSide();
    }

    @Override
    public double calculateDiagonal() {
        return Math.sqrt(2) * getSide();
    }
}
