package entrainement;

/**
 *
 * @author alecw
 */
public class etiquette {

    public static void main(String[] args) {
        int[] liste = {1, 2, 3, 4, 0, 5, 4, 3, 2, 1};
        test:
        for (int val : liste) {
            condition:
            if (val == 0) {
                break test;
            }
            Affichage:
            System.out.println(val);
        }
        System.out.println("fin");
        
        fo
    }
}
