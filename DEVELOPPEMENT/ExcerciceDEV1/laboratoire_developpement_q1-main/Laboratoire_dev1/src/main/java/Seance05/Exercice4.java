/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance05;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice4 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduisez un mots : ");
        String mot = clavier.nextLine();

        int longueur = mot.length(); // le nombre de caractere
        char premiereLettre = mot.charAt(0);
        char derniereLettre = mot.charAt(longueur - 1);
        if (premiereLettre == derniereLettre) {
            System.out.println("La premiere et la derniere lettre sont egaux");
        } else {
            System.out.println("La premiere et la derneire lettre ne sont pas egaux");
        }
    }

}
