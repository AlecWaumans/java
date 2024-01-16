package Chapitre2;

/**
 *
 * @author alecw
 */
public class affichageTableau {

    public static void main(String[] args) {

    }

    public static void afficherLigne(int[][] tab, int lg) {
        for (int col = 0; col < tab[lg].length; col++) {
            System.out.println(tab[lg][col]);
        }
    }

    public static void afficherColonne(int[][] tab, int col) {
        for (int lg = 0; lg < tab.length; lg++) {
            System.out.println(tab[lg][col]);
        }
    }

    public static void afficherDiagonaleDescendante(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i][i]);
        }
    }

    // Version avec deux variables
    public static void afficherDiagonaleMontanteV1(int[][] tab) {
        int lg = tab[0].length - 1;
        for (int col = 0; col < tab.length; col++) {
            System.out.println(tab[lg][col]);
            lg--;
        }
    }
    // En Java, on peut placer les 2 variables dans le for

    public static void afficherDiagonaleMontanteV2(int[][] tab) {
        for (int col = 0, lg = tab[0].length - 1; col < tab.length; lg--, col++) {
            System.out.println(tab[lg][col]);
        }
    }
    // Version avec la colonne calculée à partir de la ligne

    public static void afficherDiagonaleMontanteV3(int[][] tab) {
        for (int col = 0; col < tab.length; col++) {
            int n = tab.length;
            System.out.println(tab[n - 1 - col][col]);
        }
    }

    public static void afficherLigneParLigne(int[][] tab) {
        for (int lg = 0; lg < tab.length; lg++) {
            for (int col = 0; col < tab[0].length; col++) {
                System.out.println(tab[lg][col]);
            }
        }
    }

    public static void afficherColonneParColonne(int[][] tab) {
        for (int col = 0; col < tab[0].length; col++) {
            for (int lg = 0; lg < tab.length; lg++) {
                System.out.println(tab[lg][col]);
            }
        }
    }

    public static void afficherLigneParLigneV2(int[][] tab) {
        int nbÉléments = tab.length * tab[0].length;
        int lg = 0;
        int col = 0;
        for (int i = 0; i < nbÉléments; i++) {
            System.out.println(tab[lg][col]);
            col++;
            if (col == tab[0].length) {
                col = 0;
                lg++;
            }
        }
    }

    /**
     * ATTENTION ICI ON STOP LA LECTURE DU TAB
     *
     * @param tab
     * @param élt
     * @return La position d'un element precis du tableau a deux dimansion.
     */
    public static boolean chercherLigneParLigneV2(int[][] tab, int élt) {
        int nbÉléments = tab.length * tab[0].length;
        int lg = 0;
        int col = 0;
        int i = 1;
        while (i <= nbÉléments && tab[lg][col] != élt) {
            col++;
            if (col == tab[0].length) {
                col = 0;
                lg++;
            }
            i++;
        }
        return i <= nbÉléments;
    }

    public static void parcoursSerpent(int[][] tab) {
        int nbÉléments = tab.length * tab[0].length;
        int lg = 0;
        int col = 0;
        int sens = 1;
        for (int i = 0; i < nbÉléments; i++) {
            System.out.println(tab[lg][col]);
            if (0 <= col + sens && col + sens < tab[0].length) {
                col += sens;
            } else {
                lg++;
                sens = -sens;
            }
        }
    }

}
