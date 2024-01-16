package Chapitre1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Exercice5 {

    public static void main(String[] args) {
        List<Integer> maListe = new ArrayList();
        maListe.add(45);
        maListe.add(102);
        maListe.add(66);
        maListe.add(35);
        maListe.add(15);
        maListe.add(62);
        maListe.add(45);

        List<Integer> maListe2 = new ArrayList();
        maListe2.add(1);
        maListe2.add(2);
        maListe2.add(3);
        maListe2.add(4);
        maListe2.add(5);
        maListe2.add(6);
        maListe2.add(7);

        maListe.addAll(maListe2);

        System.out.println(maListe);
    }
}
