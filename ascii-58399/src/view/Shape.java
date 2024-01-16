package view;

import model.Drawing;
import model.Point;

public interface Shape {
    public boolean isInside(Point p);

    public void move(double dx, double dy);

    public char getColor();
    public String toString();
    public void setColor(char color);
    public Point getPoint();
}
