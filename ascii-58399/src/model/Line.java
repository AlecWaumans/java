package model;

import view.coloredShape;

public class Line extends coloredShape {

    private Point first;
    private Point second;

    public Line(Point first, Point second,char color) {
        super(color);
        this.first = first;
        this.second = second;
    }

    public double pente() {
        return this.second.getY() - this.first.getY()
                / this.second.getX() - this.first.getX();
    }

    public double distance(Point point) {
        double pente = pente();
        double distance = Math.sqrt(pente * point.getX() - point.getY()
                - pente * this.first.getX() + this.first.getY()
                / pente * pente + 1);
        if (distance < 0) {
            distance = distance * -1;
        }
        return distance;
    }


    @Override
    public boolean isInside(Point p) {
        double equation1  = p.getY() - this.first.getX();
        double equation2 = pente()*(p.getX()-this.first.getX());
        return equation1 == equation2;
    }

    @Override
    public void move(double dx, double dy) {
        this.first.move(dx, dy);
        this.second.move(dx, dy);
    }
    @Override
    public String toString() {
        return "Line{" +
                "A = " + first +
                ", B = " + second +
                '}'+ "Color = " + getColor();
    }

    @Override
    public Point getPoint() {
        return this.first;
    }
}
