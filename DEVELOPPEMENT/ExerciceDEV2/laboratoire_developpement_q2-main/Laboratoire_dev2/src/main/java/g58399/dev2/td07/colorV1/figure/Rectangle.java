package g58399.dev2.td07.colorV1.figure;

/**
 *
 * @author alecw
 */
public class Rectangle {

    protected final double longueur;
    protected final double largeur;

    public Rectangle(double longueur, double largeur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double getLongueur() {
        return this.longueur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public double getArea() {
        return getLongueur() * getLargeur();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.getLongueur(), getLongueur()) != 0) {
            return false;
        }
        return Double.compare(rectangle.getLargeur(), getLargeur()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getLongueur());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getLargeur());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
