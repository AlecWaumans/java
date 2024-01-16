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
public class Exercice2 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduisez le nombre de tiret que vous voulez  : ");
        int n = clavier.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.print("-");
            i++;
        }
    }

}
