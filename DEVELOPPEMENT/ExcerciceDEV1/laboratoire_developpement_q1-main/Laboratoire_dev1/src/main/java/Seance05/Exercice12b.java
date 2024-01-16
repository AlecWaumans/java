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
public class Exercice12b {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un mot : ");
        String mot = clavier.nextLine();
        String minuscule = mot.toLowerCase();
        int longueur = mot.length();
        boolean estPalindrome = true;
        int i = 0;

        while (i < longueur / 2) {
            if (minuscule.charAt(i) != minuscule.charAt(longueur - i - 1)) {
                estPalindrome = false;
            }
            i++;
        }
        System.out.println("Le mot est est-il un palindrome : " + estPalindrome);
    }
}
