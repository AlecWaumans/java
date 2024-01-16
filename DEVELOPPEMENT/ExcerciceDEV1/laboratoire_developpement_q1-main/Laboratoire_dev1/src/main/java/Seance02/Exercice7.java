/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance02;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice7 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nb = clavier.nextInt();
        System.out.println(nb);
        System.out.print(nb % 10);
        System.out.print((nb / 10) % 10);
        System.out.print((nb / 100) % 10);
    }
    
}
