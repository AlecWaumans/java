package Chapitre1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Exercice1 {

    public static void main(String[] args) {
        List<Integer> maListe;
        maListe = new LinkedList<>();

        maListe.add(494);
        maListe.add(209);
        maListe.add(425);

        System.out.println(maListe.size()); // affiche la taille
        System.out.println(maListe);// imprime la liste

        //maListe.remove(209);// erreur car java ne sait pas si c'est une position ou pas. 
        System.out.println(maListe);

        System.out.println(maListe.contains(425));// dis si la valeur 425 est dans la liste
        maListe.add(0, 101);// ajoute l'élément 101 au tout debut de la liste. 
        System.out.println(maListe);
    }
}
