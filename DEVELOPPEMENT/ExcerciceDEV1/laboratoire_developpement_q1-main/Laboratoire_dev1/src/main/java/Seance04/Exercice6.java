/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance04;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice6 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduisez le nombre de valeur que vous voulez introduire : ");
        int valeur_total = clavier.nextInt();

        int i = 1;
        int positifs = 0;
        int négatifs = 0;
        int nuls = 0;

        while (i <= valeur_total) {
            System.out.println("Introduisez valeur : ");
            int valeur = clavier.nextInt();

            if (valeur > 0) {
                positifs = positifs + 1;
            } else if (valeur < 0) {
                négatifs = négatifs + 1;
            } else {
                nuls = nuls + 1;
            }
            i++;
        }
        System.out.println("positifs : " + positifs);
        System.out.println("négatifs : " + négatifs);
        System.out.println("nuls : " + nuls);
    }

}
