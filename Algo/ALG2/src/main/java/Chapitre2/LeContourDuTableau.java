package Chapitre2;

/**
 *
 * @author alecw
 */
public class LeContourDuTableau {

    public static void main(String[] args) {

    }

    public static int contourTab(int[][] tab) {
        int sumImpair = 0;
        int top = 0;
        int down = tab.length - 1;
        int left = 0;
        int right = tab[0].length - 1;

        for (int col = 0; col < tab[0].length; col++) {
            for (int lg = 0; lg < tab.length; lg++) {
                if (col == left || col == right || lg == top || lg == down && tab[lg][col] % 2 == 0) {
                    sumImpair = sumImpair + tab[lg][col];
                }
            }
        }
        return sumImpair;
    }

}
