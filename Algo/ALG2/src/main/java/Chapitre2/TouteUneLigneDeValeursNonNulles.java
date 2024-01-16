package Chapitre2;

/**
 *
 * @author alecw
 */
public class TouteUneLigneDeValeursNonNulles {

    public static boolean positiveRow(int[][] arr, int row) {
        for (int elem : arr[row]) {
            if (elem <= 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean positiveCol(int[][] arr, int col) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] <= 0) {
                return false;
            }
        }
        return true;
    }
}
