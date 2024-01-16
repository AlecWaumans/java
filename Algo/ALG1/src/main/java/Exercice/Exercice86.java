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
public class Exercice86 {

    public static void main(String[] args) {
        compterNegatif();

        System.out.println("compter les élément négatif");
        int[] tabTest2 = {-2, 0, 1, -7};
        System.out.println(compterNegatif(tabTest2));
        System.out.println();

        System.out.println("contient au moins un négatif");
        int[] tabTest3 = {0, -2, 0, 1, -7};
        System.out.println(possedeNegatif(tabTest3));
        int[] tabTest4 = {2, 0, 1, 7};
        System.out.println(possedeNegatif(tabTest4));
        System.out.println();

        System.out.println("indique les nombre strictement positif");
        int[] tabTest2 = {1, -1, 2, -3, 5, 0};
        boolean[] resultat = indiqueStrictPositif(tabTest2);
        for (int i = 0; i < resultat.length; i++) {
            System.out.println(resultat[i] + "");
        }
        System.out.println();
        System.out.println();

    }

    public static int compterNegatif(int[] tableau) {
        int compter = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < 0) {
                compter++;
            }
        }
        return compter;
        return (0);

    }

    public static boolean possedeNegatif(int[] tableau) {
        boolean trouveNegatif = false;
        for (int i = 0; !trouveNegatif && i < tableau.length; i++) {
            if (tableau[i] < 0) {
                trouveNegatif = true;
            }
        }
        return trouveNegatif;

    }

    public static boolean contient(String[] tableau, String mot) {
        boolean trouveChaine = false;
        for (int i = 0; !trouveChaine && i < tableau.length; i++) {
            if (tableau[i].equals(mot)) {
                trouveChaine = true;
            }

        }
        return trouveChaine;
    }

    public static boolean deuxOccurences(String[] tableau) {
        boolean trouve = false;

        for (int i = 0; i < tableau.length; i++) {
            String mot = tableau[0];
            for (int j = i + 1; !trouve && j < tableau.length; j++) {
                if (tableau[i].equals(mot)) {
                    trouve = true;
                }
            }
        }

        return trouve;
    }

    public static int[] tabPremiers(int n) {
        int[] premiers = new int[n];

        int nb = 2;
        for (int i = 0; i < n; i++) {
            premiers[i] = nb;
            do {
                nb++;
            } while (!A6.estPremier(nb));
        }
        return premiers;
    }

    public static boolean[] indiqueStrictPositif(int[] tableau) {
        boolean[] resultat = new boolean[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            resultat[i] = tableau[i] > 0;
        }
        return resultat;
    }
}
