package g58399.dev2.td05;

/**
 * Demander à mikaeeeeellll l'explication du carrée magic et le refaire
 * ensemble.
 *
 * @author alecw
 */
public class MagicSquare {

    private int n; // représente l'ordre du carré magique(nombre de lignes et de colonnes du tableau).
    private int[][] Values; // c'est un tableau à deux dimension qui possedera les coefficients du carré magique. 

    /**
     * Constructeur par default.
     */
    public MagicSquare() {
        n = 3;
        int[][] MagicSquare = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
    }

    /**
     * Constructeur du carré magique.
     *
     * @param n Ordre du carré magique.
     */
    public MagicSquare(int n) {
        if (n <= 3 || n % 2 == 0) {
            throw new IllegalArgumentException("Cette valeur ne correspond pas au critère demandée.");
        }
        this.n = n;
        int ligne = n - 1;
        int col = n / 2;
        int num = 1;
        int nouvelleLigne = 0;
        int nouvelleColonne = 0;
        while (num <= n * n) {
            if (ligne <= 0 || ligne >= n) {
                ligne = 0;
            }
            if (col < 0 || col >= n) {
                col = 0;
            }
            if (Values[ligne][col] == 0) {
                nouvelleLigne = ligne;
                nouvelleColonne = col;
                Values[ligne++][col++] = num++;
            } else {
                ligne = nouvelleLigne - 1;
                col = nouvelleColonne;
            }
        }
    }

    /**
     * Répresentation textuelle du carré magique.
     *
     * @return Une chaîne de caractère avec les valeurs du carré.
     */
    @Override
    public String toString() {
        int longueur = String.valueOf(n * n).length() + 1;
        StringBuilder mot = new StringBuilder(); //creer un object qui est un String;
        for (int[] arr : Values) { // lit le tableau par colonne.
            mot.append("\n");// met a la ligne soutln.
            for (int el : arr) {//lit le tab par ligne
                String val = String.valueOf(el);// transforme des entiers en chaine de caractere.
                int espaces = longueur - val.length();
                mot.append(" ").append(el).append(" ".repeat(espaces));
            }
        }
        return mot.toString();
    }

    /**
     * Accesseur : Donne l'ordre du carré magique.
     *
     * @return un entier qui se trouve être l'ordre.
     */
    public int getn() {
        return n;
    }

    /**
     * Donne les valeurs qui composent le carré.
     *
     * @return Un tableau en deux dimensions contenant les valeurs.
     */
    public int[][] getValues() {
        return Values;
    }

    /**
     * qui calcule la somme des éléments de la colonne num du tableau
     *
     * @param num de la ligne
     * @return la somme.
     */
    public int sumLigne(int num) {
        if (num < 0 || num >= n) {
            throw new IllegalArgumentException("La ligne demandée doit être dans le carré : " + num);
        }
        int sum = 0;
        for (int el : Values[num]) {
            sum += el;
        }
        return sum;
    }

    /**
     * MIKAEEEELLLL : pourquoi on peut initialisez une variable comme int j; et
     * a des moments sa fonctionne pas. calcule la somme des éléments de la
     * ligne num du tableau.
     *
     * @param num de la colonne.
     * @return la somme.
     */
    public int sumColonne(int num) {
        if (num < 0 || num >= n) {
            throw new IllegalArgumentException("La ligne demandée doit être dans le carré : " + num);
        }
        int sum = 0;
        for (int[] arr : Values) {
            sum += arr[num];
        }

        return sum;
    }

    /**
     * Calcule la somme d'une des deux diagonales.
     *
     * @param num 1 pour la première diagonale et 2 pour la seconde.
     * @return La somme d'une des deux diagonales.
     */
    public int sumDiag(int num) {
        int sum = 0;
        if (!(num == 1 || num == 2)) {
            throw new IllegalArgumentException("Il faut sélectionner la première (1) ou seconde (2) diagonale : " + num);
        }
        if (num == 1) {
            for (int i = 0; i < n; i++) {
                sum += Values[i][i];
            }
        }
        if (num == 2) {
            for (int i = 0; i < n; i++) {
                sum += Values[i][n - 1 - i];
            }
        }
        return sum;
    }

    /**
     * Va verifier si le carré magic c-à-d si la somme des diagonales sont egaux
     * et si la somme des lignes et des colonnes sont égaux.
     *
     * @return false si il ne l'est pas et true si il l'est.
     */
    public boolean isMagicSquare() {
        int base = sumLigne(0);
        int sumDiag1 = sumDiag(1);
        int sumDiag2 = sumDiag(2);
        if (base != sumDiag1 || base != sumDiag2) {
            return false;
        }
        int i = 0;
        while (i < n) {
            if (base != sumLigne(i) || base != sumColonne(i)) {
                return false;
            } else {
                i++;
            }
        }
        return i == n;
    }

    /**
     * affoche le carré magique.
     */
    public void displayMagicSquare() {
        System.out.println();
        System.out.println("Square order : " + getn());
        int longueur = String.valueOf(n * n).length() + 1;
        String fmt = "%" + longueur + "d";
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf(fmt, Values[i][j]); //permet un allignement des differentes valeurs du carré.
                System.out.print(" ".repeat(longueur)); // reproduit une concatenation entre des valeurs et des chaines de caractère.
            }
            System.out.print("-> " + sumLigne(i));
        }
        System.out.println();
        String fmt2 = "%" + longueur + "s";
        for (int i = 0; i < n; i++) {
            System.out.printf(fmt2, "s");
            System.out.print(" ".repeat(longueur));
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf(fmt, sumColonne(i));
            System.out.print(" ".repeat(longueur));
        }

    }

}
