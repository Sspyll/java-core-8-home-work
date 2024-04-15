package utils;

public class Fill {
    private String fillColor;
    private int opacity;

    public Fill(String fillColor, int opacity) {
        this.fillColor = fillColor;
        this.opacity = opacity;
    }

    public Fill(String fillColor) {
        this(fillColor, 100);
    }

    public Fill(int opacity) {
        this("Blue", opacity);
    }

    public Fill() {
        this("Blue", 100);
    }

    public String getFillColor() {
        return fillColor;
    }

    public int getOpacity() {
        return opacity;
    }
}
