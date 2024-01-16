package Chapitre2;

/**
 *
 * @author alecw
 */
public class CasNull {

    public static void main(String[] args) {
        int[][] tab = {{1, 2, 3, 0}, {0, 1, 1, 0}};
        System.out.println(estNul(tab, 0, 3));
        System.out.println(estNul(tab, 0, 0));

    }

    public static boolean estNul(int[][] tab, int lg, int col) {
        return tab[lg][col] == 0;
    }
}
