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
public class Exerice11 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int sentinelle = -1;
        boolean croissante = true;

        System.out.println("Entrez un nombre entier positif: ");
        int antécédent = clavier.nextInt();;

        System.out.println("Entrez un nouveau nombre entier positif: ");
        int valeur = clavier.nextInt();

        while (valeur > sentinelle) {
            croissante = croissante && (valeur > antécédent);
            antécédent = valeur;
            System.out.println("Entrez un nouveau nombre entier positif: ");
            valeur = clavier.nextInt();
        }
        if (croissante) {
            System.out.println("Cette série est strictement croissante");
        } else {
            System.out.println("Cette série n'est pas strictement croissante");

        }

    }
}
