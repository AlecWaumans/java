package Chapitre1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Exercice7 {

    public static void main(String[] args) {
        List<Integer> maListe2 = new ArrayList();
        maListe2.add(1);
        maListe2.add(2);
        maListe2.add(3);
        maListe2.add(4);
        maListe2.add(5);
        maListe2.add(6);
        maListe2.add(7);
        System.out.println(maListe2);
        DeleteMaxMin(maListe2);
        System.out.println(maListe2);
    }

    public static void DeleteMaxMin(List<Integer> maListe2) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < maListe2.size() - 1; i++) {
            if (maListe2.get(i) >= max) {
                max = maListe2.get(i);
            }
            if (maListe2.get(i) <= min) {
                min = maListe2.get(i);
            }
        }

        maListe2.remove(max);
        maListe2.remove(min);

    }
}
