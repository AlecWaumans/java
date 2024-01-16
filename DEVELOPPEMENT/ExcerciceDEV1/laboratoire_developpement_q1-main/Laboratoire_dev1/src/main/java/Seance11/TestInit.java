/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance11;

/**
 *
 * @author alecw
 */
public class TestInit {

    /**
     * Exemple d'initialisation de tableaux de différents types.
     *
     * @param args pas utilisé.
     */
    public static void main(String[] args) {
        int[] entiers = new int[10];
        Exercice2.afficherTab(entiers);

        double[] doubles = new double[10];
        afficherTab(doubles);

        boolean[] booléens = new boolean[10];
        afficherTab(booléens);

        String[] strings = new String[10];
        afficherTab(strings);
    }

    /**
     * Affiche un tableau de double.
     *
     * @param tab le tableau à afficher
     */
    public static void afficherTab(double[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");

        }
        if (tab.length > 0) {
            System.out.print(tab[tab.length - 1]);
        }
        System.out.println("]"); // on passe à la ligne
    }

    /**
     * Affiche un tableau de booléens.
     *
     * @param tab le tableau à afficher
     */
    public static void afficherTab(boolean[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");

        }
        if (tab.length > 0) {
            System.out.print(tab[tab.length - 1]);
        }
        System.out.println("]"); // on passe à la ligne
    }

    /**
     * Affiche un tableau de chaînes de caractères.
     *
     * @param tab le tableau à afficher
     */
    public static void afficherTab(String[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");

        }
        if (tab.length > 0) {
            System.out.print(tab[tab.length - 1]);
        }
        System.out.println("]"); // on passe à la ligne
    }
}
