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
public class Exercice73 {

    public static void main(String[] args) {
        doubledés();

    }

    public static int doubledés() {
        int compteur = 0;
        boolean double6;

        do {
            int des1 = (int) (Math.random() * 6 + 1);
            int des2 = (int) (Math.random() * 6 + 1);
            System.out.println(compteur + ":" + des1 + ":" + des2);
            compteur++;
            double6 = des1 == 6 && des2 == 6;
        } while (!double6);
        return compteur;
    }
}