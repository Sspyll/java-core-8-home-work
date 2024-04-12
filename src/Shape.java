public abstract class Shape implements Adjustable, CalculatesArea, Drawable {
    private int positionX;
    private int positionY;
    private Fill fill;
    private Border border;
    private int rotation;

    public Shape(int positionX, int positionY, Fill fill, Border border) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.fill = fill;
        this.border = border;
        this.rotation = 0;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionX(int x) {
        this.positionX = x;
    }

    public void setPositionY(int y) {
        this.positionY = y;
    }

    public int getRotation() {
        return rotation;
    }

    public String getFill() {
        return String.format("The color: %s.\nThe opacity: %d%%.", fill.getFillColor().toLowerCase(), fill.getOpacity());
    }

    public String getBorder() {
        return String.format("The color of the border: %s.\nThe thickness of the border: %dpx.", border.getBorderColor().toLowerCase(),
                border.getBorderThickness());
    }

    @Override
    public void rotate(int degrees) {
        if (degrees < 0) {
            rotation = 360 - ((rotation - degrees) % 360);
        } else {
            rotation = (rotation + degrees) % 360;
        }
        System.out.println("The " + getName().toLowerCase() + " is rotating to " + degrees + "°");
        System.out.println("The new rotation of the " + getName().toLowerCase() + " is " + rotation + "°");
    }

    @Override
    public void flip() {
        System.out.println("The " + getName().toLowerCase() + " is flipped.");
    }

    @Override
    public void move(int x, int y) {
        this.positionX = positionX + x;
        this.positionY = positionY + y;
    }

    @Override
    public void select() {
        System.out.println("The " + getName().toLowerCase() + " is selected.");
    }

}