package g58399.dev2.td05;

/**
 *
 * @author alecw
 */
public class MainMagicSquare {

    public static void main(String[] args) {
        MagicSquare carré = new MagicSquare(11);
        String ms = carré.isMagicSquare() ? "Oui s'en est un ! " : "NOOOOO !!";
        System.out.println("C'est un carré magic ?" + ms);
        carré.displayMagicSquare();
    }
}
