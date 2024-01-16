package chapitre3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class ExempleList {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1); // [1]
        myList.add(4); // [1, 4]
        myList.add(7); // [1, 4, 7]
        myList.set(1, 33); // [1, 33, 7]
        myList.remove((int) 0); // [33, 7] :: Enlève à l'index
        myList.remove((Integer) 7); // [33] :: Enlève la valeur
        myList.clear(); // [] Vide la liste
    }

}
