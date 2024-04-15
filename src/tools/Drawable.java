package tools;

public interface Drawable {
    default void draw() {
        System.out.println("Drawing a " + getName().toLowerCase() + ".");
    }

    String getName();

    void select();
}
