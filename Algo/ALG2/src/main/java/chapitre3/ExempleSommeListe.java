package chapitre3;

import java.util.List;

/**
 *
 * @author alecw
 */
public class ExempleSommeListe {

    public class SumList {

        public static int sumList(List<Integer> list) {
            int sum = 0;
            for (Integer el : list) {
                sum += el;
            }
            return sum;
        }

        public static void main(String[] args) {
            var arr = List.of(1, 2, 3, 4, 5, 6);
            System.out.println(sumList(arr));
        }
    }

}
