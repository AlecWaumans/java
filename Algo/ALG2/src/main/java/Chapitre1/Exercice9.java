package Chapitre1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Exercice9 {

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
        System.out.println(maListe);
        System.out.println(DeleteRedondance(maListe));
        System.out.println(maListe);
    }

    public static List<Integer> FusionEtTrié(List<Integer> maListe, List<Integer> maListe2) {
        maListe.addAll(maListe2);
        Collections.sort(maListe);
        return maListe;
    }

    public static List<Integer> DeleteRedondance(List<Integer> maListe) {
        for (int i = 0; i < maListe.size(); i++) {
            if (maListe.get(i) == maListe.get(i + 1)) {
                maListe.remove(i);
            }
        }
        return maListe;
    }
}
