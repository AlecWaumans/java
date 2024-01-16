package chapitre3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class MoisAnniversaire {

    public static List<Personne> findBirthMonth(List<Personne> people, int birthMonth) {
        var out = new ArrayList<Personne>();
        for (Personne p : people) {
            if (p.getBirthMonth() == birthMonth) {
                out.add(p);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        var people = Personne.makePeople();
        var out = findBirthMonth(people, 4);
        System.out.println(out);
    }
}
