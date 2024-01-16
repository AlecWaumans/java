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
public class TableauChaines {

    public static void main(String[] args) {
        String[] mots = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};

        for (String mot : mots) {// pour chaque mot dans le tableau 'mots'
            System.out.print(mot + " ");//affiche le mot suivi d'un espace.
        }
        System.out.println();// passe à la ligne.

        afficheTableau(mots);// la même chose, mais dans une méthode.
    }

    public static void afficheTableau(String[] mots) {
        System.out.print("[ ");
        for (String mot : mots) {
            System.out.print(mot + "," + " ");
        }
        System.out.println("]");
        System.out.println();
    }

}
