public class Fill {
    private String fillColor;
    private int opacity;

    Fill(String fillColor, int opacity) {
        this.fillColor = fillColor;
        this.opacity = opacity;
    }

    Fill(String fillColor) {
        this(fillColor, 100);
    }

    Fill(int opacity) {
        this("Blue", opacity);
    }

    Fill() {
        this("Blue", 100);
    }

    public String getFillColor() {
        return fillColor;
    }

    public int getOpacity() {
        return opacity;
    }
}
