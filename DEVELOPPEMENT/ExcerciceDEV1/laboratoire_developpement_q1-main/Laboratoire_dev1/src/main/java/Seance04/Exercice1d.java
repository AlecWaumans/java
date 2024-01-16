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
public class Exercice1d {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduisez un nombre  : ");
        int n = clavier.nextInt();

        int i = 1;
        while (i <= n) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
