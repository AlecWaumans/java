package model;

import view.coloredShape;

public class Rectangle extends coloredShape {
    private Point upperLeft;
    private double width;
    private double height;

    public Rectangle(Point upperLeft, double width, double height, char color) {
        super(color);
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }

    /*
     * Returns true if the point is in the rectangle returns false otherwise.
     */
    public boolean isInside(Point p) {
        return p.getX() > upperLeft.getX()
                && p.getY() < upperLeft.getY()
                && (p.getX() - upperLeft.getX()) < width
                && (upperLeft.getY() - p.getY() < height);

    }

    public Point getUpperLeft() {
        return this.upperLeft;
    }

    public double getHeight() {
        return height;
    }

    public void move(double dx, double dy) {
        this.upperLeft.move(dx, dy);
    }
    public Point getPoint(){
        return this.upperLeft;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "upperLeft=" + upperLeft +
                ", width=" + width +
                ", height=" + height +
                '}'+ "Color = " + getColor();
    }
}
