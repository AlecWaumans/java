/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class exemple2 {

    public static void main(String[] args) {
        //Je déclare une référence vers 
        //un tableau d'entiers.'
        int[] tab;

        // Réserve un tableau de 10 cases
        //dans la mémoire.
        tab = new int[10];

        // je déclare une nouvelle référence vers une liste
        // d'entiers'
        // ou de chaine de caractères. EN écrivant : 
        List<String> maListe;
        // List<Integer> maListe;

        // je declare une liste a n infini déléement.
        maListe = new LinkedList<>();

        // ajoute les éléments dans la liste un par un 
        maListe.add("ALG2");
        maListe.add("DEV2");
        maListe.add("DEV1");
        maListe.add("ALG1");

        // montrer dans l'outpunt l'élément 2 de la list 
        System.out.println(maListe.get(2));

        // montre combien d'élément il y a dans ma list 
        System.out.println(maListe.size());

        // parcourir toute la liste et sortir tout les éléments de la liste dans l'outpunt 
        for (int i = 0; i < maListe.size(); i++) {
            System.out.println(maListe.get(i));
        }
        // ou 
        System.out.println(maListe);
        //Mais c'est mieux la premiere façon

        // comment supprimer un élément de la liste 
        maListe.remove("DEV2");
        System.out.println(maListe);

        //ou 
        maListe.remove(0);
        System.out.println(maListe);

        // remplacer un élément dans la liste 
        maListe.set(1, "MATH1");
        System.out.println(maListe);

        // inserer un element dans la liste 
        maListe.add(3, "DEV2");
        System.out.println(maListe);

        //vider toute la liste 
        maListe.clear();
        System.out.println(maListe);
        
        // 
        
    }

}
