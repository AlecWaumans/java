package g58399.dev1q2.S1;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice5TriangleRectangle {

    public static void main(String[] args) {
        TriangleRectangle();
    }

    public static void TriangleRectangle() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le plus long coté : ");
        double LongCoté = clavier.nextDouble();
        System.out.println("Entrez le premier coté : ");
        double coté1 = clavier.nextDouble();
        System.out.println("Entrez le deuxieme coté : ");
        double coté2 = clavier.nextDouble();

        boolean TriangleRectangle = (coté1 * coté1) + (coté2 * coté2) == LongCoté * LongCoté;

        if (TriangleRectangle) {
            System.out.println("C'est un triagle rectangle.");
        } else {
            System.out.println("Ce n'est pas un triangle rectangle");
        }
    }
}
