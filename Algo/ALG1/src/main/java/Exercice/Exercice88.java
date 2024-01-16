/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

import static Exercice.Exercice84.initAlternance;

/**
 *
 * @author alecw
 */
public class Exercice88 {

    public static void main(String[] args) {
        System.out.println("Somme");
        tabTest = initAlternance(6);
        System.out.println(somme(tabTest));
        System.out.println();

    }

    public static int somme(int[] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }

}
