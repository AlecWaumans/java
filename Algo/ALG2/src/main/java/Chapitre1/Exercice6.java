package Chapitre1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Exercice6 {

    public static void main(String[] args) {
        System.out.println("Liste de String");
        List<String> liste = new ArrayList();
        liste.add("fromage");
        liste.add("eau");
        liste.add("salami");
        liste.add("pain");
        liste.add("eau");

        System.out.println(liste);
        System.out.println(DeleteWord(liste, "eau"));
        System.out.println(liste);

    }

    public static int DeleteWord(List<String> course, String mot) {
        int suppression = 0;
        for (int i = 0; i < course.size(); i++) {
            if (course.get(i).equals(mot)) {
                course.remove(i);
                suppression++;
            }
        }

        return suppression;
    }
}
