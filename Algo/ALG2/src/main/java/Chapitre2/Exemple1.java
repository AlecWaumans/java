package Chapitre2;

import java.util.Arrays;

/**
 *
 * @author alecw
 */
public class Exemple1 {
    
    public static void main(String[] args) {
        remplirCoins();
    }
    
    public static void remplirCoins() {
        String[][] grille = new String[3][5];
        grille[0][0] = "NO";
        grille[0][4] = "NO";
        grille[2][0] = "NO";
        grille[2][4] = "NO";
        System.out.println(Arrays.deepToString(grille));
    }
}
