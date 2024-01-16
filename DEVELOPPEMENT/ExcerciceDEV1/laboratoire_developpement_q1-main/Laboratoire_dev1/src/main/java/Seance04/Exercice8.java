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
public class Exercice8 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduisez une valeur : ");
        int valeur = clavier.nextInt();
        int sentinelle = -1;
        int maximum = valeur;

        while (valeur > sentinelle) {
            if (valeur >= maximum) {
                maximum = valeur;
            }
            System.out.println("Introduisez une valeur : ");
            valeur = clavier.nextInt();
        }
        if (maximum <= sentinelle) {
            System.out.println("Aucun nombre positif entré");
        } else {
            System.out.println("Maximum : " + maximum);

        }

    }

}
