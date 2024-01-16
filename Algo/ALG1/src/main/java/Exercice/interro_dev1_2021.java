/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class interro_dev1_2021 {

    public static void exercice1() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez deux nombres");
        int a = clavier.nextInt();
        int b = clavier.nextInt();

        if (a >= b) {
            System.out.println("Bonjour");
        }

    }

    public static int fct(int a, int b) {
        a = 2 * b;
        b = 2 * a;
        return a + b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 5;
        for (int i = 0; i < 10; i++) {
            c = fct(a, b);

        }
        System.out.println("Resultat : " + a + "," + b + "," + c);
    }
    
}
