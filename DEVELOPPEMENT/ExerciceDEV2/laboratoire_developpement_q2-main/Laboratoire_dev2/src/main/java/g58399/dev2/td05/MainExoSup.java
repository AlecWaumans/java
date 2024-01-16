package g58399.dev2.td05;

import static g58399.dev2.td05.Arrays2D.incrementer;

/**
 *
 * @author alecw
 */
public class MainExoSup {

    public static void main(String[] args) {
        int[][] tab2 = new int[5][5];
        incrementer(tab2);
        showArray(tab2);
        swapRows(tab2, 1, 2);
        System.out.println();
        showArray(tab2);
        System.out.println();
        int[][] triangle = makeTriangle(50);
        showArray(triangle);

    }

    /**
     * permet de swapper deux lignes du tableau.
     *
     * @param tab que l'on veut swapper les lignes.
     * @param row1 premiere ligne choisis.
     * @param row2 deuxieme ligne choisis.
     * @return le tableau avec les lignes qui ont swapper.
     */
    public static int[][] swapRows(int[][] tab, int row1, int row2) {
        int[] r = tab[row1];
        tab[row1] = tab[row2];
        tab[row2] = r;
        return tab;
    }

    /**
     * Faire un triangle magic.
     *
     * @param n l'ordre qui est mise en entrée du triangle.
     * @return retourne un tableau a deux dimension mais ne forme de triangle.
     */
    public static int[][] makeTriangle(int n) {
        int[][] arr = new int[n + 1][];

        for (int i = 0; i <= n; i++) {
            arr[i] = new int[i + 1];
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

    /**
     * affiche un tableau à deux dimensions ligne par ligne
     *
     * @param tab le tableau que l'on veut afficher.
     */
    public static void showArray(int[][] tab) {
        for (int[] arr : tab) {
            System.out.println();
            for (int el : arr) {
                System.out.printf("%2d", el);
                System.out.print(" ");
            }
        }
    }

}
