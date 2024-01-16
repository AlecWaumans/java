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
public class Exercice10 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez les valeurs (terminez par −1)");
        int valeur = clavier.nextInt();
        int nbValeurs = 0;
        int sentinelle = -1;

        int premier = valeur;
        int dernier = valeur;

        while (valeur > sentinelle) {
            dernier = valeur;
            nbValeurs = nbValeurs + 1;
            System.out.println("Entrez une vlaur : ");
            valeur = clavier.nextInt();
        }
        if (premier <= sentinelle) {
            System.out.println("Le série est vide");
        } else if (premier < dernier) {
            System.out.println("Le premier est inférieur au dernier");
        } else if (premier > dernier) {
            System.out.println("Le premier est supérieur au dernier");
        } else {
            System.out.println("Le premier est égal au dernier");
        }

        System.out.println("vous avez entré : " + nbValeurs + " valeurs");
    }

}
