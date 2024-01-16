/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

/**
 *
 * @author alecw
 */
public class Exercice77 {

    public static void main(String[] args) {
        System.out.println(6 + "" + estParfait(6));
        System.out.println(28 + "" + estParfait(28));
        System.out.println(30 + "" + estParfait(30));
        
    }

    public static boolean estParfait(int n) {
        int somme = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                somme += i;
            }
        }
        return somme == n;

    }
}
