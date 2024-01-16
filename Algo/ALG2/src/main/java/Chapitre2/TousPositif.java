package Chapitre2;

/**
 *
 * @author alecw
 */
public class TousPositif {

    public static boolean allPositive(int[][] arr) {
        // return statement breaks loop
        for (int[] row : arr) {
            for (int val : row) {
                if (val <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
