/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance06;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class ChaineUtil {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un mot : ");
        String mot = clavier.nextLine();
        System.out.println("La prmeiere lettre de votre mot est : " + premiereLettre(mot));
        System.out.println("Et la derniere lettre de votre mot est : " + derniereLettre(mot));
        //String résultat = premiereLettre("Hello");
        /*Le problème ici est que le retour de la methode n'est pas 
        * un mot mais une lettre du coup la valeur de resultat doit etre de type char
         */
        //Char caractère = derniereLettre(123);
        /* ici le probleme ce trouve être la variable entrée ce n'est 
        * pas une chaine de caractère mais des nombres
         */
        System.out.println("Entrez un mot : ");
        String mot2 = clavier.nextLine();
        System.out.println("Le nombre de voyelle dans ce mot est de : " + Voyelles(mot2));
        System.out.println("Le nombre de consomne dans ce mot est de : " + consomnes(mot2));
        System.out.println("Le mot est est-il un palindrome : " + estPalindrome(mot2));
    }

    public static char premiereLettre(String mot) {
        return mot.charAt(0);
    }

    public static char derniereLettre(String mot) {
        return mot.charAt(mot.length() - 1);
    }

    public static int Voyelles(String mot) {
        int voyelles = 0;
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) == 'a' || mot.charAt(i) == 'e' || mot.charAt(i) == 'i' || mot.charAt(i) == 'o' || mot.charAt(i) == 'u' || mot.charAt(i) == 'y') {
                voyelles = voyelles + 1;
            }

        }
        return voyelles;
    }

    public static int consomnes(String mot) {
        int consomnes = 0;
        for (int i = 0; i < mot.length(); i++) {
            consomnes = consomnes + 1;
        }
        return consomnes;

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
