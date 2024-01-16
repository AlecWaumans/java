package model;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    public double setX(double hor){
        return this.x = hor;
    }
    public double setY(double ver){
        return this.y = ver;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public void move(double dx, double dy) {
        this.x = dx;
        this.y = dy;
    }

    /*
     * Returns the distance between two points.
     */
    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }

    @Override
    public String toString() {
        return "Point( " +
                 x +
                " ; " + y +
                ')';
    }
}
