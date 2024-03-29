package model;

public class Square extends Rectangle {
    public Square(Point upperLeft, double side, char color){
        super(upperLeft,side,side,color);
    }

    @Override
    public String toString() {
        return "Square{" + "side = " + getHeight() + "upperleft = " + super.getUpperLeft()+ "}"+ " color = " + getColor();
    }
}
