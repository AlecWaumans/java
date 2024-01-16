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
public class Exercice9 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le nombre d'heure: ");
        int heure = clavier.nextInt();
        System.out.println("Entrez le nombre de minute : ");
        int minute = clavier.nextInt();
        System.out.println("Entrez le nombre de seconde : ");
        int seconde = clavier.nextInt();
        int totale = heure * 60 * 60 + minute * 60 + seconde;
        System.out.println("Le nombre de seconde est de : " + totale);

    }

}
