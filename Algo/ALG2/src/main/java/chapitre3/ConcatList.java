package chapitre3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatList {

    public static List<Integer> concatList(List<Integer> l1, List<Integer> l2) {
        for (Integer el : l2) {
            l1.add(el);
        }
        return l1;
    }

    public static void main(String[] args) {
        var l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 7));
        var l2 = new ArrayList<>(Arrays.asList(11, 33, 44, 77));
        System.out.println(concatList(l1, l2));
    }
}
