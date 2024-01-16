package chapitre3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class ExempleList2 {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(11);
        myList.add(22);
        myList.add(33);
        Integer x = myList.get(1); // 22
        for (Integer el : myList) {
            System.out.println(el); // Imprime les éléments de la liste
        }
        myList.contains(2); // false
        myList.contains(11); // true
    }

}
