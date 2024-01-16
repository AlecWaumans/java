package Chapitre2;

/**
 *
 * @author alecw
 */
public class AssignerUneCase {

    public static void main(String[] args) {
        int[][] tab = {{0, 2, 3}, {10, 11, 12}, {3, 2, 1}};
        AssignerCase(tab, 0, 0, 12);//installe 12 à la position
        afficherLigneParLigne(tab);

    }

    public static void AssignerCase(int[][] tab, int lg, int col, int val) {
        if (tab[lg][col] == 0) {
            tab[lg][col] = val;
        }
    }

    public static void afficherLigneParLigne(int[][] tab) {
        for (int lg = 0; lg < tab.length; lg++) {
            for (int col = 0; col < tab[0].length; col++) {
                System.out.print(tab[lg][col] + "  ");
                if (col == 2) {
                    System.out.println("");
                }
            }
        }
    }
}
