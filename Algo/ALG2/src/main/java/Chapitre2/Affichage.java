package Chapitre2;

/**
 *
 * @author alecw
 */
public class Affichage {

    public static void main(String[] args) {

        int[][] tab = {{1, 2, 3}, {4, 4, 7}, {9, 8, 1}};
        System.out.println("Impression ligne par ligne");
        System.out.println();
        afficherLigneParLigne(tab);
        System.out.println();
        System.out.println("Impression colonne par colonne");
        System.out.println();
        afficherColonneParColonne(tab);
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
}
