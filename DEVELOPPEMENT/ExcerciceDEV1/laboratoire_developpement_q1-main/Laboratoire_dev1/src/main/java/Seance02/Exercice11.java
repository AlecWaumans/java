/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance02;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice11 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le monant de votre produit hors TVA : ");
        int montant = clavier.nextInt();
        System.out.println("Entrez le taux de la TVA : ");
        int Taux = clavier.nextInt();
        System.out.println("Combien de produit avez vous achetez : ");
        int nbs = clavier.nextInt();

        int total = (montant / 100 * Taux) * nbs + montant * nbs;
        System.out.println("Voici votre prix : " + total);

    }

}
