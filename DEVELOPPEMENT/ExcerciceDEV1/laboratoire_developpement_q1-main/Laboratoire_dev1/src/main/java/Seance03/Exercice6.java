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
public class Exercice6 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("introduisez le premier chiffre : ");
        int a = clavier.nextInt();
        System.out.println("introduisez le deuxieme chiffre : ");
        int b = clavier.nextInt();
        System.out.println("introduisez le troisieme chiffre : ");
        int c = clavier.nextInt();

        if (a > b && a > c) {
            System.out.println("a est le  plus grand " + a);
        } else if (b > c) {
            System.out.println("b est le plus grand " + b);
        } else {
            System.out.println("c est le plus grand " + c);
        }
    }

}
