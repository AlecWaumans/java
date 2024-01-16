package chapitre3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Personne {

    private final String firstName;
    private final String lastName;
    private final int birthMonth;

    public Personne(String firstName, String lastName, int birthMonth) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (birthMonth <= 0 || birthMonth > 12) {
            throw new IllegalArgumentException("Month should be a value between 1 and 12 " + birthMonth);
        }
        this.birthMonth = birthMonth;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    @Override

    public String toString() {
        return firstName + " " + lastName + " " + birthMonth;
    }

    public static List<Personne> makePeople() {
        var p1 = new Personne("Johnny", "Boy", 5);
        var p2 = new Personne("Alice", "Randal", 8);
        var p3 = new Personne("Mojo", "Jojo", 3);
        var p4 = new Personne("Sally", "Brown", 11);
        var p5 = new Personne("Elton", "John", 4);
        var p6 = new Personne("Bob", "Ross", 12);
        var p7 = new Personne("Frank", "Boyle", 5);
        var p8 = new Personne("Angela", "Merkle", 4);
        var p9 = new Personne("Franky", "Frank", 7);
        return new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9));
    }

}

}
