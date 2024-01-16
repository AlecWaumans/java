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
public class Exercice85 {

    public static void main(String[] args) {
        ex85();
    }

    public static void ex85() {
        int[] tab = new int[100];
        int i = 0;
        tab[i] = tab[i + 1];
        // c'est une addition mais dans la case suivante
        tab[i] = tab[i] + 1;
        // c'est une incrementation c'est equivalent d'ajouter 1 dans la meme case

    }

    public static void comprehension() {
        int[] tab = {0, 2, 4, 6, 8};

        /*
        c'est la meme chose que faire ceci 
        int[]
         */
        int i = 3;
        tab[i] = tab[i + 1];
        tab[i] = tab[i] + 1;
    }
}
