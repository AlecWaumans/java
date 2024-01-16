package Chapitre2;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exemple2 {

    //Calcule et affiche la quantité vendue de 10 produits.
    // Pour chaque jour de la semaine (de 0: lundi à 6 : dimanche). 
    public static void statistiquesVentesSemaine() {
        int[][] cpt = new int[7][10];
        // initialiser(cpt, 0); // rien à faire : en Java, les tableaux d’entiers sont initialisés à 0.
        for (int jour = 0; jour < 7; jour++) {
            System.out.println("Jour : " + jour);
            traiterStock1Jour(cpt, jour);
            for (int produit = 0; produit < 10; produit++) {
                System.out.println("quantité vendue du produit " + produit
                        + " ce jour " + jour + " : " + cpt[jour][produit]);
            }
        }
    }

    private static void traiterStock1Jour(int[][] cpt, int jour) {
        Scanner clavier = new Scanner(System.in);

        int numéroProduit, quantité;
        // askInt est une méthode utilitaire pour lire un entier de façon conviviale et robuste
        System.out.println("Introduisez le numéro du produit");
        numéroProduit = clavier.nextInt();
        while (numéroProduit >= 0 && numéroProduit < 10) {
            System.out.println("Introduisez la quantité vendue");
            quantité = clavier.nextInt();
            cpt[jour][numéroProduit] += quantité;
            System.out.println("Introduisez le numéro du produit");
            numéroProduit = clavier.nextInt();
        }

    }
}
