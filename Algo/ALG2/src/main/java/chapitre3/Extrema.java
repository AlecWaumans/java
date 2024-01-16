package chapitre3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Extrema {

    public static List<Integer> removeExtrema(List<Integer> l) {
        Integer min = l.get(0);
        Integer max = l.get(0);
        for (Integer i : l) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        l.remove(max);
        l.remove(min);
        return l;
    }

    public static void main(String[] args) {
        var l = new ArrayList<>(Arrays.asList(0, 1, 2, -1, 4, 5, 3, 8, 1, 2, 11, -3, 7));
        System.out.println(removeExtrema(l));
    }
}
