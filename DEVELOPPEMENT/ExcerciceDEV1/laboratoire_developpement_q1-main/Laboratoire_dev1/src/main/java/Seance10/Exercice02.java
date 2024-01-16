/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance10;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice02 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduisez un entier");
        int n = clavier.nextInt();

        System.out.println(somme(n));
    }

    public static int somme(int n) {
        int somme = 0;
        for (int i = 0; i <= n; i++) {
            somme = somme + i;
        }
        return somme;
    }

}
