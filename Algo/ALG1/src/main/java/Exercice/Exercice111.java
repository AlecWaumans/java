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
public class Exercice111 {

    public static String normaliser(String texte) {
        String resultat = "";
        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);
            if (Character.isLetter(c)) {
                resultat += Character.toUpperCase(c);
            }

        }
        return resultat;
    }

    public static void main(String[] args) {
        System.out.println("Normaliser une chaine");
        System.out.println(normaliser("Hello, world!"));
        System.out.println(normaliser("le <Cobol>, c'est la santé !"));
        System.out.println(normaliser("123"));
        System.out.println();
    }

}
