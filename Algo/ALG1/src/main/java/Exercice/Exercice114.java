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
public class Exercice114 {

    public static String remplacement(String mot, String ch1, String ch2) {
        String resultat = "";
        int i = 0;
        while (i < mot.length()) {
            int pos = mot.indexOf(ch1, i);
            if (pos != -1) {
                resultat += mot.substring(i, pos) + ch2;
                i = pos + ch1.length();
            } else {
                resultat += mot.substring(i);
                i = mot.length();
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        System.out.println("Remplacement de sous-chaines");
        System.out.println(remplacement("abxbxa", "bx", "de"));
        System.out.println(remplacement("XavcWabc", "abc", "abcz"));
        System.out.println(remplacement("abcabc", "abc", "a"));
        System.out.println(remplacement("abcabc", "xxx", "x"));
    }
}
