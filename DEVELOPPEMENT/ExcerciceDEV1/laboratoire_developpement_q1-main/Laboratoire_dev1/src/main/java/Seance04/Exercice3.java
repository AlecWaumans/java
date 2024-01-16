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
public class Exercice3 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduisez 5 valeur : ");

        int somme = 0;
        int nbs_valeurs = 1;

        while (nbs_valeurs <= 5) {
            int valeur = clavier.nextInt();
            somme = somme + valeur;
            nbs_valeurs ++;
        }
        System.out.println(somme);

    }

}
