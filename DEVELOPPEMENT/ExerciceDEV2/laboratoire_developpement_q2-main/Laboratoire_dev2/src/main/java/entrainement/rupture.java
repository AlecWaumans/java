package entrainement;

/**
 *
 * @author alecw
 */
public class rupture {

    public static void main(String[] args) {
        int[] liste = {1, 2, 3, 4, 0, 5, 4, 3, 2, 1};
        for (int val : liste) {
            if (val == 0) {
                break;
            }
            System.out.println(val);
        }
        System.out.println("fin");
    }
}
