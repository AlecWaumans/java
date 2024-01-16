package Chapitre1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Exercice3 {

    public static void main(String[] args) {
        List<Integer> maListe = new ArrayList();
        maListe.add(45);
        maListe.add(102);
        maListe.add(66);
        maListe.add(35);
        maListe.add(15);
        maListe.add(62);
        maListe.add(45);
        System.out.println(maListe);
        System.out.println(sommeListe(maListe));
    }

    public static int sommeListe(List<Integer> sommeListe) {
        int somme = 0;
        for (int i = 0; i < sommeListe.size(); i++) {
            somme = somme + sommeListe.get(i);
        }
        return somme;
    }

}
