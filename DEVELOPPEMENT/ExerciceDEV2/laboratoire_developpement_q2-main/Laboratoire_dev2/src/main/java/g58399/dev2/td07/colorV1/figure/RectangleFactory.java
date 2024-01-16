package g58399.dev2.td07.colorV1.figure;

/**
 *
 * @author alecw
 */
public class RectangleFactory {

    public static Rectangle makeRectangle(double longueur, double largeur) {
        if (longueur == largeur) {
            return new Square(longueur);

        } else {
            return new Rectangle(longueur, largeur);
        }
    }
}
