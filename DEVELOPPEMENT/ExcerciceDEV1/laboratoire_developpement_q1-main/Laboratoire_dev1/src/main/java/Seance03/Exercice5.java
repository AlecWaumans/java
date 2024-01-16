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
public class Exercice5 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduisez le premier nombre : ");
        int a = clavier.nextInt();
        System.out.println("Introduisez le deuxieme nombre : ");
        int b = clavier.nextInt();
        System.out.println("Introduisez le troisime nombre : ");
        int c = clavier.nextInt();

        System.out.println(a % 2 == 0);
        System.out.println(a % 2 == 1);
        System.out.println(a % b == 0);
        System.out.println(a < b);
        System.out.println((a <= b) && (a <= c));
        System.out.println((a < b && b < c) || (a > b && b > c));

        if (a % 2 == 0) {
            System.out.println("(a est divisible par 2 c’est-à-dire a est pair");
        }
        if (a % 2 == 1) {
            System.out.println(" a est impair ");
        }
        if (a % b == 0) {
            System.out.println(" a est divisible par b");
        }
        if ((a <= b) && (a <= c)) {
            System.out.println("a est le minimum");
        }
        if ((a < b && b < c) || (a > b && b > c)) {
            System.out.println("b est strictement compris entre a et c");
        }
    }

}
