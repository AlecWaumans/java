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
public class Exercice3 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("introduisez le premier nombre : ");
        int nbs1 = clavier.nextInt();
        System.out.println("introduisez le deuxieme nombre : ");
        int nbs2 = clavier.nextInt();
        if (nbs1 < nbs2) {
            System.out.println(nbs1 + "est plus grand");
        } else {
            System.out.println(nbs2 + " est le plus petit");
        }
    }
}
