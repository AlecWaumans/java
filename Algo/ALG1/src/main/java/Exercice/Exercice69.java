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
public class Exercice69 {

    public static int lanceDes(int n, int valeur) {
        int compteur = 0;

        for (int i = 0; i < n; i++) {
            int des = (int) (Math.random() * 6 + 1);// le plus un permet d'enlever la valeur 0 et le * 6 permet d'aller jusqu'à 6 dans le math random
            if (des == valeur) {
                compteur++;
            }
        }
        return compteur;
    }

    public static void main(String[] args) {
        System.out.println(lanceDes(5, 3));
    }

}
