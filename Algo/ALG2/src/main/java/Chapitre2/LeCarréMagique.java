package Chapitre2;

import java.util.Arrays;

/**
 *
 * @author alecw
 */
public class LeCarréMagique {

    public static boolean isMagicSquare(int[][] arr) {
        int n = arr.length;
        int[] rowSums = new int[n];
        int[] colSums = new int[n];
        int firstDiagSum = 0;
        int secondDiagSum = 0;
        for (int i = 0; i < n; i++) {
            int k = n - 1 - i;
            firstDiagSum += arr[i][i];
            secondDiagSum += arr[i][k];
            for (int j = 0; j < n; j++) {
                rowSums[i] += arr[i][j];
                colSums[j] += arr[i][j];
            }
        }
        return Arrays.equals(rowSums, colSums) && firstDiagSum == secondDiagSum;
    }

    public static boolean isMagicSquare2(int[][] arr) {
        int n = arr.length;
        int[] rowSums = new int[n];
        int[] colSums = new int[n];

        int firstDiagSum = 0;
        int secondDiagSum = 0;
        for (int i = 0; i < n; i++) {
            int k = n - 1 - i;
            firstDiagSum += arr[i][i];
            secondDiagSum += arr[i][k];
            for (int j = 0; j < n; j++) {
                rowSums[i] += arr[i][j];
                colSums[j] += arr[i][j];
            }
        }
        int check = rowSums[0];
        if (firstDiagSum != secondDiagSum || check != firstDiagSum) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (rowSums[i] != check || colSums[i] != check) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] tab = {{2, 7, 6},
        {9, 5, 1},
        {4, 3, 8}};
        int[][] tab2 = {{4, 7, 6},
        {9, 8, 1},
        {2, 3, 5}};
        System.out.println(isMagicSquare(tab)); // true
        System.out.println(isMagicSquare(tab2)); // false
    }
}
