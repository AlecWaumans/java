package Chapitre2;

/**
 *
 * @author alecw
 */
public class CasExiste {

    public static void main(String[] args) {
        int[][] tab = {{1, 2, 3}, {10, 11, 12}, {3, 2, 1}};
        System.out.println(arrayHasCell(tab, 0, 0)); //true
        System.out.println(arrayHasCell(tab, 5, 5)); // false
    }

    public static boolean arrayHasCell(int[][] tab, int row, int col) {
        int rows = tab.length;
        int cols = tab[0].length;
        return row >= 0 && col >= 0 && row < rows && col < cols;
    }

}
