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
public class Exercice2 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduisez un nombre : ");
        int nbs = clavier.nextInt();
        if (nbs % 2 == 0) {
            System.out.println("Ce nombre est pair");
        } else {
            System.out.println("Ce nombre est impair");
        }
    }

}
