package g58399.dev2.td07.colorV1.figure;

import g58399.dev2.td07.colorV1.figure.Rectangle;

/**
 *
 * @author alecw
 */
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

//    @Override
//    public double getLongueur() {
//      throw new UnsupportedOperationException();
//    }
//    @Override
//    public double getLargeur() {
//        throw new UnsupportedOperationException();
//    }
    
    public double getSideByLength() {
        return super.getLongueur();
    }

    public static void main(String[] args) {
        Square s = new Square(11);
        //The folowing fails because of the method overriding
        System.out.println(s.getArea());

        Rectangle[] arr = {new Rectangle(3, 4), new Square(7), new Rectangle(1, 9), new Square(4)};
        for (Rectangle r : arr) {
            System.out.println(r.getArea());
        }
        System.out.println(s.getSideByLength());
    }

}
