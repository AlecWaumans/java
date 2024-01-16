/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

import static Exercice.Exercice79.miroire;

/**
 *
 * @author alecw
 */
public class Exercice80 {

    public static void main(String[] args) {
        System.out.println("Palindrome");
        System.out.println(1047401 + " " + estPalindrome(1047401));
        System.out.println(123321 + " " + estPalindrome(123321));
        System.out.println(4209 + " " + estPalindrome(4209));
        System.out.println(0 + " " + estPalindrome(0));
        System.out.println();
    }

    public static boolean estPalindrome(int n) {
        return n == miroire(n);

    }
}
