/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice1 {

    /**
     * Exemple d'utilisations de tableaux d'entier
     *
     * @param args pas utilisé.
     */
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        System.out.println("taille : " + tab.length);
        System.out.println("dernier élémént " + tab[tab.length - 1]);
        System.out.println("1er élément: " + tab[0]);
        System.out.println("autre élément : " + tab[2]);
        System.out.println("affiche un drôle de truc: " + Arrays.toString(tab));

        afficherTab(tab);
        //incrémenter(tab);
        afficherTab(tab);

        int[] tab2 = new int[10];
        afficherTab(tab2);

        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez une valeur : ");
        int valeur = clavier.nextInt();

        multiplier(tab, valeur);
        afficherTab(tab);
    }

    /**
     * Affiche un tableau
     *
     * @param tab le tableau à afficher
     */
    public static void afficherTab(int[] tab) {
        for (int valeur : tab) { // pour chaque valeur dans le tableau 'tab'
            System.out.print(valeur + " ");
        }
        System.out.println(); // passer a la ligne suivante
    }

    /**
     * incrementer chaque composante du tableau pour chaque valeur du tableau tu
     * rajoute 1
     *
     * @param tab le tableau à incrementer.
     */
    public static void incrémenter(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }

    public static void multiplier(int[] tab, int valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] * valeur;
        }
    }

}
