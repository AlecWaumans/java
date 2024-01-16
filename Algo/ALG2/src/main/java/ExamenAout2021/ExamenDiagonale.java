package ExamenAout2021;

/**
 *
 * @author alecw
 */
public class ExamenDiagonale {

    public static void main(String[] args) {
        int[][] matrice = {{1, -6, 20},
        {-2, 1, 26},
        {20, 22, 18}};
        sumDiagSontEgaux(matrice);
        int[][] matrice2 = {{1, 3}, {3, 2}};
        sumDiagSontEgaux(matrice2);

    }

    public static void sumDiagSontEgaux(int[][] matrice) {
        boolean sontEgaux = false;
        int somDiagUn = 0;
        int somDiagDeux = 0;
        int somDiagTrois = 0;
        int longueurMatrice = matrice.length;

        for (int k = 0; k < longueurMatrice; k++) {
            for (int l = 0; l < longueurMatrice; l++) {
                if (k == l) {
                    somDiagUn += matrice[k][l];
                } else if (k == l + 1) {
                    somDiagDeux += matrice[k][l];
                } else if (k + 1 == l) {
                    somDiagTrois += matrice[k][l];
                }
            }
        }
        System.out.println(somDiagUn);
        System.out.println(somDiagDeux);
        System.out.println(somDiagTrois);
        if (somDiagUn == somDiagDeux
                && somDiagTrois == somDiagTrois
                && somDiagUn == somDiagTrois) {
            sontEgaux = true;

        }
        System.out.println(sontEgaux);
    }
}
