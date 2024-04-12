public class Triangle extends Shape implements CalculatesPerimeter {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int positionX, int positionY, Fill fill, Border border, int sideA, int sideB, int sideC) {
        super(positionX, positionY, fill, border);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public String triangleType() {
        int a = getSideA();
        int b = getSideB();
        int c = getSideC();

        if (a == b && b == c) return "Equilateral";
        if (a == b || b == c || a == c) return "Isosceles";
        return "Scalene";
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double calculateArea() {
        int sp = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(sp * (sp - getSideA()) * (sp - getSideB()) * (sp - getSideC()));
    }

    @Override
    public double calculatePerimeter() {
        return getSideA() + getSideB() + getSideC();
    }
}
