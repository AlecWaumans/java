package g58399.dev2q2.S3;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice1BouclesSimples {

    public static void main(String[] args) {
        decompte();
        System.out.println();
        int n = demanderUnEntier();
        compte(n);
        System.out.println("pair");
        comptePair();
        System.out.println("impair");
        compteImpair();
        System.out.println("Compte de -5 à 5");
        compteDeNegatifAPositif();
        System.out.println("Compte de -N et N");
        int negatif = demanderUnEntier();
        int positif = demanderUnEntier();
        compteDeMoinsNAN(negatif, positif);

    }

    /**
     * Cette methode decompte de -1 à -7
     */
    public static void decompte() {
        for (int nb = -1; nb >= -7; nb--) {
            System.out.println(nb);
        }
    }

    public static void compte(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    public static void comptePair() {
        for (int i = 1; i <= 14; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void compteImpair() {
        for (int i = 1; i <= 14; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void compteDeNegatifAPositif() {
        for (int i = -5; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void compteDeMoinsNAN(int negatif, int positif) {
        for (int i = negatif; i <= positif; i++) {
            System.out.println(i);
        }
    }

    public static int demanderUnEntier() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nb = clavier.nextInt();
        return nb;
    }
}
