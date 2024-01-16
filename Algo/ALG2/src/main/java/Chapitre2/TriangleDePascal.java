package Chapitre2;

/**
 *
 * @author alecw
 */
public class TriangleDePascal {

    public static int[][] makeTriangle(int n) {
        int[][] arr = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                int topRow = i - 1;
                int leftCol = j - 1;
                if (topRow < 0 || leftCol < 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[topRow][j] + arr[topRow][leftCol];
                }
            }
        }
        return arr;
    }
}
