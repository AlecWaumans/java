/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Exercice2 {

    public static void main(String[] args) {
        List<Integer> maListe;
        maListe = new LinkedList<>();

        maListe.add(494);
        maListe.add(209);
        maListe.add(425);

        System.out.println(maListe.size()); // affiche la taille
        System.out.println(maListe);// imprime la liste

        List<Integer> liste2 = ListeDesPremiersEntiers(10);
        System.out.println(liste2);
        System.out.println();

    }

    public static List<Integer> ListeDesPremiersEntiers(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n doit être strictement positif");
        }
        List<Integer> listeEntier = new ArrayList();
        int a = n;
        for (int i = 0; i < n; i++) {
            listeEntier.add(a);
            a--;
        }
        return listeEntier;
    }

}
