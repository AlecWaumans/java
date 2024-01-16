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
public class Exercice7 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez une valeur et terminer par la valeur - 1");

        int valeur = clavier.nextInt();
        int nb_valeurs = 1;
        int dernier = valeur;
        int premier = valeur;

        while (valeur > -1) {
            dernier = valeur;
            System.out.println("Introduisez une valeur : ");
            valeur = clavier.nextInt();
            nb_valeurs = nb_valeurs + 1;
        }
        if (premier <= -1) {
            System.out.println("Aucun nombre positif entré ");
        } else {
            System.out.println("Premier : " + premier);
            System.out.println("Dernier : " + dernier);
        }
        System.out.println("Vous avez introduiz : " + nb_valeurs + "Valeurs");
    }

}
