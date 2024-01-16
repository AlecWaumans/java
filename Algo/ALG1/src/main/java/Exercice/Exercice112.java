/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

import static Exercice.Exercice111.normaliser;

/**
 * on va le faire sans les accents car plus compliquer mais si on veut le faire
 * avec les accents on doit absolument importer des packages
 *
 * @author alecw
 */
public class Exercice112 {

    public static boolean estPalindrome(String mot) {
        boolean trouveDifferent = false;
        int dernier = mot.length() - 1;
        for (int i = 0; !trouveDifferent || i < mot.length() / 2; i++) {
            if (mot.charAt(i) == mot.charAt(dernier - i)) {
                trouveDifferent = true;
            }
        }
        return !trouveDifferent;

    }
    public static boolean estPhrasePalindrome(String phrase){
        return estPalindrome(normaliser(phrase));
    }

    public static void main(String[] args) {
        System.out.println("Ex 112 les palindromes");
        System.out.println(estPalindrome("KayaK"));
        System.out.println(estPalindrome("abba"));
        System.out.println(estPalindrome("kayvak"));
        System.out.println();
        
        System.out.println("LA phrase est un palindrome ?");
        System.out.println(estPhrasePalindrome("Esope reste ici et se repose."));
        System.out.println(estPhrasePalindrome("Tu l'as trop ecrase, Cesar, ce Port-Salut!"));
        System.out.println(estPhrasePalindrome("Esope reste chez lui et se repose."));
        System.out.println();
    }
}
