package g58399.dev2.td07.colorV1.figure;

import g58399.dev2.td07.colorV1.figure.Square;
import g58399.dev2.td07.colorV1.figure.Rectangle;

/**
 *
 * @author alecw
 */
public class main {

    public static void main(String[] args) {
        Square carré = new Square(42);
        Rectangle rectangle = new Rectangle(42, 42);
        System.out.println(carré.getClass() == rectangle.getClass());
        System.out.println(carré instanceof Rectangle);
        
    }
}
