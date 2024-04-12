public class ShapeUtils {

    public static void main(String[] args) {
        Fill fill = new Fill("Pink", 90);
        Border border = new Border("Blue", 2);
        Circle circle = new Circle(10, 11, fill, border, 10.5);
        getShapeName(circle);
    }

    public static void getShapeName(Drawable shape) {
        System.out.println(shape.getName());
    }
}
