package g58399.dev1q2.S1;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice3Triangle {

    public static void main(String[] args) {
        TypeDeTriangle();
    }

    public static void TypeDeTriangle() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le premier coté : ");
        double coté1 = clavier.nextDouble();
        System.out.println("Entrez le deuxieme coté : ");
        double coté2 = clavier.nextDouble();
        System.out.println("Entrez le troisieme coté : ");
        double coté3 = clavier.nextDouble();

        if (coté1 == coté2 && coté3 == coté2) {
            System.out.println("Ce triangle est equilatéral");
        } else if (coté2 == coté1 || coté1 == coté3 || coté3 == coté2) {
            System.out.println("Ce triangle est isocèle");
        } else {
            System.out.println("Ce triangle est quelconque");
        }

    }
}
