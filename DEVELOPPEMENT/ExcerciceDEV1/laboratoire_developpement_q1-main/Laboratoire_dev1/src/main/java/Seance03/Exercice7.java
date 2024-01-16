/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance03;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice7 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("introduisez le premier coté : ");
        double a = clavier.nextDouble();
        System.out.println("introduisez le deuxieme coté : ");
        double b = clavier.nextDouble();
        System.out.println("introduisez le troisieme coté : ");
        double c = clavier.nextDouble();

        if (a == b && b == c) {
            System.out.println("Le triangle est equilatéral");
        } else if (a == b || a == c || b == c) {
            System.out.println("Le triangle est isocele");
        } else {
            System.out.println("Le triangle est Quelconque");
        }
    }

}
