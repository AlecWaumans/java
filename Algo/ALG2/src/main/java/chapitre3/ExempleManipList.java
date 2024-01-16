package chapitre3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class ExempleManipList {

    public static void makeList() {
        List<Integer> list = new ArrayList<>();
        list.add(494);
        list.add(209);
        list.add(425);
        System.out.println("Taille de liste : " + list.size());
        System.out.println("La liste contient 425 : " + list.contains(425));
        list.remove((Integer) 209);
        list.add(0, 101);
        System.out.println(list);
    }

    public static void main(String[] args) {
        makeList();
    }
}
