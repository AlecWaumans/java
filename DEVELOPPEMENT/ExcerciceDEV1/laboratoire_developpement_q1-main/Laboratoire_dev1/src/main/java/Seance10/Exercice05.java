/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance10;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice05 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un mot : ");
        String mot = clavier.nextLine();
        System.out.println("Entrez la lettre dont vous voulez l'occurence : ");
        String caract = clavier.nextLine();
        caract = caract.toLowerCase();
        char lettre = caract.charAt(0);
        System.out.println(nbOccurences(lettre, mot));
    }

    public static int nbOccurences(char lettre, String mot) {
        int nbOccurences = 0;
        mot = mot.toLowerCase();
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) == lettre) {
                nbOccurences = nbOccurences + 1;
            }
        }
        return nbOccurences;
    }

}
