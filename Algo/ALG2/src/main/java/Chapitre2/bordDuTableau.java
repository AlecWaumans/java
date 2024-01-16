package Chapitre2;

/**
 *
 * @author alecw
 */
public class bordDuTableau {

    public static void main(String[] args) {
        int[][] tab = {{1, 2, 3, 4}, {0, 1, 0, 1}, {11, 11, 11, 11}};
        System.out.println(isBorder(tab, 0, 3)); // true
        System.out.println(isBorder(tab, 1, 2)); // false
        System.out.println(isBorder(tab, 2, 3)); // true
        System.out.println(isBorder(tab, 1, 1)); // fals
    }

    public static boolean isBorder(int[][] tab, int row, int col) {
        int top = 0;
        int down = tab.length - 1;
        int left = 0;
        int right = tab[0].length - 1;

        return col == left || col == right || row == top || row == down;

    }
}
