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
public class Exercice4 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le rayon du cecle : ");
        double rayon = clavier.nextDouble();
        System.out.println("Le perimettre du cercle est : " + 2 * Math.PI * rayon + "cm");
        System.out.println("L'aire du cercle est : " + Math.PI * rayon * rayon);

    }

}
