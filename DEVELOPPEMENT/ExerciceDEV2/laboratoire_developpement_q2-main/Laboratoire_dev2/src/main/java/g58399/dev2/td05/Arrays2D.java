package g58399.dev2.td05;

/**
 *
 * @author alecw
 */
public class Arrays2D {

    public static void main(String[] args) {
        int[][] tab2 = new int[5][5];
        incrementer(tab2);
        int[][] tab = {{1, 2, 3, 0}, {4, 5, 6, 0}};
        afficher(tab2);
        afficherTableau(tab);
        System.out.println("ProportionNullF");
        System.out.println(proportionNullF(tab));
        System.out.println("ProportionNullV");
        System.out.println(proportionNullV(tab));
        System.out.println("tousPositifsV");
        System.out.println(tousPositifsV(tab));
        System.out.println("tousPositifsF");
        System.out.println(tousPositifsF(tab));
        System.out.println("Afficher par colonne");
        afficherColonneParColonne(tab);
        System.out.println("Afficher par ligne");
        afficherLigneParLigne(tab);

    }

    /**
     * mikael je ne comprend pas comment fonctionne le tab[0] Cette méthode va
     * nous permettre de creer des valeurs(0) dans le tableau et va afficher le
     * tableau;
     *
     * @param tab tableau du main a deux entrer de 5 colonnes et 5 lignes
     */
    public static void afficherTableau(int[][] tab) {
        for (int lg = 0; lg < tab.length; lg++) {
            for (int col = 0; col < tab[0].length; col++) {
                System.out.print(tab[lg][col] + " ");
            }
            System.out.println("");
        }
    }

    /**
     * MIKAELLLLLLLLL je ne comprend pas ce genre de boucle. afficher le tableau
     * a deux dimension mais d'une autre manière.
     *
     * @param tab
     */
    public static void afficher(int[][] tab) {
        for (int[] arr : tab) {
            System.out.println();
            for (int el : arr) {
                System.out.print(el + " ");
            }
        }
        System.out.println();
    }

    /**
     * MIKAEEEELLLLL Vérifie si toutes les valeurs d'un tableau 2D sont
     * strictements positives.
     *
     * @param tab Un tableau à deux dimensions.
     * @return Vrai si toutes les valeurs sont strictement positives et faux
     * autrement.
     */
    public static double proportionNullF(int[][] tab) {
        int compte = 0;
        int total = tab.length * tab[0].length;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                if (tab[i][j] == 0) {
                    compte++;
                }
            }
        }
        return (double) compte / total;
    }

    /**
     * Mikaeeellllll Calcule la proportion de valeurs nulles dans un tableau à
     * deux dimensions.
     *
     * @param tab Un tableau à deux dimensions.
     * @return La proportion de valeurs nulles.
     */
    public static double proportionNullV(int[][] tab) {
        int count = 0;
        int total = tab.length * tab[0].length;
        for (int[] arr : tab) {
            for (int el : arr) {
                if (el == 0) {
                    count++;
                }
            }
        }
        return (double) count / total;
    }

    /**
     * Mikaeeellllllll Vérifie si toutes les valeurs d'un tableau 2D sont
     * strictements positives.
     *
     * @param tab Un tableau à deux dimensions.
     * @return Vrai si toutes les valeurs sont strictement positives et faux
     * autrement.
     */
    public static boolean tousPositifsV(int[][] tab) {
        for (int[] arr : tab) {
            for (int el : arr) {
                if (el <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * MIKAEEEELLLLL Vérifie si toutes les valeurs d'un tableau 2D sont
     * strictements positives.
     *
     * @param tab Un tableau à deux dimensions.
     * @return Vrai si toutes les valeurs sont strictement positives et faux
     * autrement.
     */
    public static boolean tousPositifsF(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                if (tab[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * afficher tout les valeurs du tab en une seuele ligne en lisant le tableau
     * ligne par ligne.
     *
     * @param tab à deux dimension d'entier entrée en paramettre
     */
    public static void afficherLigneParLigne(int[][] tab) {
        for (int lg = 0; lg < tab.length; lg++) {
            for (int col = 0; col < tab[0].length; col++) {
                System.out.print(tab[lg][col]);
            }
        }
        System.out.println();
    }

    /**
     * afficher tout les valeurs du tab en une seuele ligne en lisant le tableau
     * colonne par colonne.
     *
     * @param tab à deux dimension d'entier entrée en paramettre
     */
    public static void afficherColonneParColonne(int[][] tab) {
        for (int col = 0; col < tab[0].length; col++) {
            for (int lg = 0; lg < tab.length; lg++) {
                System.out.print(tab[lg][col]);
            }
        }
        System.out.println();
    }

    /**
     * c'est un compteur qui va mettre toute les valeurs dans le tab a deux
     * dimensions en fesant plus 1 a chaque position du tableau.
     *
     * @param tab
     */
    public static void incrementer(int[][] tab) {
        for (int i = 0; i < tab[0].length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = (i + j);
            }
        }

    }

}
