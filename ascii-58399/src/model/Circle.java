package model;

import view.coloredShape;

public class Circle extends coloredShape {
    private Point center;
    private double radius;

    public Circle(char color, Point center, double radius) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    /*
     * Similarly for this returns true if the point is in the circle
     * So if the distance between the point between and the center exceeds the size of the
     * radius of the circle.
     */
    public boolean isInside(Point p) {
        if (p.distanceTo(this.center) > this.radius) {
            return false;
        }
        return true;
    }

    public void move(double dx, double dy) {
        center.move(dx, dy);
    }


    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}' + "Color = " + getColor();
    }

    @Override
    public Point getPoint() {
        return this.center;
    }
}
