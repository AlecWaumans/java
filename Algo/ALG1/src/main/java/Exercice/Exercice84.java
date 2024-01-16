/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

import static Exercice.Exercice87.afficherTableau;

/**
 *
 * @author alecw
 */
public class Exercice84 {

    public static void main(String[] args) {
        ex84();
        System.out.println("initialiser un tableau aux valeurs de 1 à 100");
        for (int i = 0; i < 6; i++) {
            afficherTableau(initAlternance(i));
        }
    }

    public static void ex84() {
        int[] tableau = new int[100];
        int i = 0;
        while (i < 100) {
            i = i + 1;
            tableau[i] = i + 1;
        }
    }

    public static int[] initAlternance(int n) {
        int[] tableau = new int[n];
        int signe = -1;
        for (int i = 0; i < n; i++) {
            tableau[i] = signe * i;
            signe *= -1;
        }
        return null;

    }
}

