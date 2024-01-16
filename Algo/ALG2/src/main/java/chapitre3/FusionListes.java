
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FusionListes {

    public static List<Integer> mergeSortedLists(List<Integer> l1, List<Integer> l2) {
        var sorted = new ArrayList<Integer>();
        int finalSize = l1.size() + l2.size();
        int j = 0, k = 0;
        for (int i = 0; i < finalSize; i++) {
            if (j == l1.size()) {
                sorted.add(l2.get(k++));
            } else if (k == l2.size()) {
                sorted.add(l1.get(j++));
            } else if (l1.get(j).compareTo(l2.get(k)) < 0) {
                sorted.add(l1.get(j++));
            } else {
                sorted.add(l2.get(k++));
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        var l1 = new ArrayList<>(Arrays.asList(1, 3, 7, 7));
        var l2 = new ArrayList<>(Arrays.asList(3, 9));
        var out = mergeSortedLists(l1, l2);
        System.out.println(out);
    }
}
