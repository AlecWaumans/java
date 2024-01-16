package Chapitre1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Exercice8 {

    public static void main(String[] args) {
        List<Integer> maListe = new ArrayList();
        maListe.add(1);
        maListe.add(2);
        maListe.add(3);
        maListe.add(4);
        maListe.add(5);
        maListe.add(6);
        maListe.add(7);

        List<Integer> maListe2 = new ArrayList();
        maListe2.add(1);
        maListe2.add(2);
        maListe2.add(3);
        maListe2.add(4);
        maListe2.add(5);
        maListe2.add(6);
        maListe2.add(7);

        System.out.println(FusionEtTrié(maListe, maListe2));

    }

    public static List<Integer> FusionEtTrié(List<Integer> maListe, List<Integer> maListe2) {
        maListe.addAll(maListe2);
        Collections.sort(maListe);
        return maListe;
    }
}
