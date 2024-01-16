package Chapitre2;

/**
 *
 * @author alecw
 */
public class coinDuTableau {

    public static void main(String[] args) {
        int[][] tab = {{1, 2, 3, 4}, {3, 2, 1, 0}, {0, 0, 0, 0}, {1, 1, 1, 1}};
        System.out.println(isCorner(tab, 0, 0)); // true
    }

    public static boolean isCorner(int[][] tab, int row, int col) {
        int top = 0;
        int down = tab.length - 1;
        int left = 0;
        int right = tab[0].length - 1;
        return (row == top && (col == left || col == right))
                || (row == down && (col == left || col == right));
    }

}
