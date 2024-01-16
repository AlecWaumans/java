package chapitre3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class ExempleListeDesPremiersEntiers {

    public class PremiersEntiers {
        public static void main(String[] args) {
            List<Integer> list = makeDecreasing(10);
            System.out.println(list);
        }

        public static List<Integer> makeDecreasing(int n) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                list.add(0, i);
            }
            return list;
        }

        
        
    }

}
