/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance11;

/**
 *
 * @author alecw
 */
public class Exercice4 {

    /**
     * C'est ici que la methode va creer un tableau de caractere et va lancer
     * les autres methodes
     *
     * @param args n'est pas utiliser ici
     */
    public static void main(String[] args) {
        String[] mots = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};

        afficheTableau(mots);// la même chose, mais dans une méthode.
        afficherTailles(mots);
        System.out.println(plusLongMot(mots));
    }

    /**
     * ici la methode va nous permettre d'afficher le tableau
     *
     * @param mots le paramettre est un tableau a une dimension {"the", "quick",
     * "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
     */
    public static void afficheTableau(String[] mots) {
        System.out.print("[ ");
        for (String mot : mots) {
            System.out.print(mot + "," + " ");
        }
        System.out.println("]");
        System.out.println();
    }

    /**
     * ici la methode va afficher la tailler des chaines de caractere du tableau
     * un à un
     *
     * @param mots le paramettre est un tableau a une dimension {"the", "quick",
     * "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
     */
    public static void afficherTailles(String[] mots) {
        for (String mot : mots) { //pour chaque mots dans le tableau 'mots'
            System.out.print(mot.length() + " ");
        }
        System.out.println("");
    }

    public static String plusLongMot(String[] tab) {
        String plusLongMot = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (plusLongMot.length() < tab[i].length()) {
                plusLongMot = tab[i];
            }
        }
        return plusLongMot;
    }

}
