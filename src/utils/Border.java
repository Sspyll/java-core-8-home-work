package utils;

public class Border {
    private String borderColor;
    private int borderThickness;

    public Border(String borderColor, int borderThickness) {
        this.borderColor = borderColor;
        this.borderThickness = borderThickness;
    }

    public Border(String borderColor) {
        this(borderColor, 1);
    }

    public Border(int borderThickness) {
        this("Black", borderThickness);
    }

    public Border() {
        this("Black", 1);
    }

    public String getBorderColor() {
        return borderColor;
    }

    public int getBorderThickness() {
        return borderThickness;
    }
}
