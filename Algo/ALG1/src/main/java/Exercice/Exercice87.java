/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

/**
 *
 * @author alecw
 */
public class Exercice87 {

    public static void main(String[] args) {
        int[] tabtest = {-2, 0, 1, -7};
        System.out.println("inverser le signe des éléments");
        afficherTableau(tabtest);
        ex87(tabtest);
        afficherTableau(tabtest);

        System.out.println();
    }

    public static void ex87(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < 0) {
                tableau[i] = -tableau[i];

            }

        }

    }

    public static void afficherTableau(int[] tableau) {
        //afficher un tableau d'entier sur une ligne 
        System.out.print(tableau[0]);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(", " + tableau[i]);
        }

    }

}
