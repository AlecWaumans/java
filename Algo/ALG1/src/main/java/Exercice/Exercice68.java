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
public class Exercice68 {

    public static void main(int n) {
        Scanner clavier = new Scanner(System.in);
        int nb;
        do {
            System.out.println("Veuillez entre un nombre entre i et" + n + ":");
            nb = clavier.nextInt();
        } while (nb < 1 || n < nb);

        while (nb != 0) {
            System.out.print(nb % 10);
            nb = nb / 10;
        }
        System.out.println();
    }

}
