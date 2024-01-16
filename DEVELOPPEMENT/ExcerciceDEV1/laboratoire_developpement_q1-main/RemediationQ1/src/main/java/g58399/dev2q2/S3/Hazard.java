package g58399.dev2q2.S3;

/**
 *
 * @author alecw
 */
public class Hazard {

    /**
     * Génère un entier aléatoirement compris entre un min et un max
     *
     * @param min la borne minimale
     * @param max la borne maximale
     * @return un entier aléatoire compris dans [min,max]
     */
    public static int hasard(int min, int max) {
        return min + (int) (Math.random() * (max - min));
    }
    
}


