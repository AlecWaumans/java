/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance10;

/**
 *
 * @author alecw
 */
public class Exercice04 {

    public static void main(String[] args) {
        System.out.println(estPalindrome("ava"));
    }

    public static boolean estPalindrome(String mot) {
        boolean estPalindrome = true;
        String minuscule = mot.toLowerCase();
        int longueur = mot.length();

        for (int i = 0; i < longueur / 2; i++) {
            if (minuscule.charAt(i) != minuscule.charAt(longueur - i - 1)) {
                estPalindrome = false;
            }
        }
        return estPalindrome;
    }

}
