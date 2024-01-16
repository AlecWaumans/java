
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EliminerDoublon {
// Partie 1

    public static List<Integer> removeDuplicates(List<Integer> l) {
        var uniques = new ArrayList<Integer>();
        for (Integer el : l) {
            if (!uniques.contains(el)) {
                uniques.add(el);
            }
        }
        return uniques;
    }
    // Partie 2

    public static void removeDuplicatesInPlace(List<Integer> l) {
        var seen = new ArrayList<Integer>();
        for (int i = 0; i < l.size(); i++) {
            if (seen.contains(l.get(i))) {
                l.remove(i);
                i--; // Sinon la liste "avance" d'un élément de trop car elle rétrécit
            } else {
                seen.add(l.get(i));
            }
        }
    }

    public static void main(String[] args) {
        var l = new ArrayList<>(Arrays.asList(1, 3, 3, 7, 8, 8, 11, 13, 11, 11));
        var other = new ArrayList<>(Arrays.asList(1, 3, 4, 4, 8, 8, 11, 13, 11, 11));
        var out = removeDuplicates(l);
        removeDuplicatesInPlace(other);
        System.out.println(out);
        System.out.println(other);
    }
}
