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
public class Exercice1 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez votre age : ");
        int age = clavier.nextInt();
        if (age < 18) {
            System.out.println("Vous êtes mineur");
        } else {
            System.out.println("Vous êtes majeur");
        }
    }

}
