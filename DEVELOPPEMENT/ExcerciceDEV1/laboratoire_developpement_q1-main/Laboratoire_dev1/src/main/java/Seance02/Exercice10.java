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
public class Exercice10 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le montant : ");
        double montant = clavier.nextDouble();
        double interet = montant / 100 * 2;
        double total = interet + montant;
        System.out.println("Votre montant apres un 1 : " + total);

    }

}
