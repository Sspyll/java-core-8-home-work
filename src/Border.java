public class Border {
    private String borderColor;
    private int borderThickness;

    Border(String borderColor, int borderThickness) {
        this.borderColor = borderColor;
        this.borderThickness = borderThickness;
    }

    Border(String borderColor) {
        this(borderColor, 1);
    }

    Border(int borderThickness) {
        this("Black", borderThickness);
    }

    Border() {
        this("Black", 1);
    }

    public String getBorderColor() {
        return borderColor;
    }

    public int getBorderThickness() {
        return borderThickness;
    }
}
