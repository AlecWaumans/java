/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance05;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice1d {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("introduisez un nombre : ");
        int n = clavier.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }

        }
    }
}
