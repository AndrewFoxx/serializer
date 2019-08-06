package ua.com.java4beginners.oop;

public class Circle {
    private final int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        String pattern = "Circle{x=%d, y=%d, radius=%d}";
        return String.format(pattern, x, y, radius);
    }
}
