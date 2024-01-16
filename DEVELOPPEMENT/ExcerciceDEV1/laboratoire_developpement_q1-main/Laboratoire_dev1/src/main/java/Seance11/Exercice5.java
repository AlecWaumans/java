/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance11;

/**
 *
 * @author alecw
 */
public class Exercice5 {

    /**
     * Cette methode va nous montrez deux methodes qui vont copier le tableau
     * mise dans le main ainsi que sont miroir;
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        afficherTab(tableau);
        int[] copie1 = copie(tableau);
        int[] copie2 = pasUneCopie(tableau);
        tableau[0] = 9;
        System.out.print("tableau: ");
        afficherTab(tableau);
        System.out.print("copie1 : ");
        afficherTab(copie1);
        System.out.print("copie2: ");
        afficherTab(copie2);
        System.out.print("miroir: ");
        afficherTab(miroir(tableau));
    }

    /**
     * Cette methode copie en passant par chaque élément et va les copiers un
     * par un ou cas ou il y aurait des modifications comme sa il peut les
     * copiers.
     *
     * @param tab tableau principal {1,2,3,4,5}
     * @return la copie du tableau
     */
    public static int[] copie(int[] tab) {
        int[] copie = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            copie[i] = tab[i];
        }
        return copie;
    }

    /**
     * va juste faire une copie du tab mais ne prend pas en compte les
     * modification faite sur le tableau.
     *
     * @param tab tableau principal {1,2,3,4,5}
     * @return la copie du tableau
     */
    public static int[] pasUneCopie(int[] tab) {
        int[] copie = tab;
        return copie;
    }

    /**
     * Cette methode va afficher correctement le tableau a la fin.
     *
     * @param tab tableau principal {1,2,3,4,5} ou un autre selon sur qui la
     * methode va etre appliquer.
     */
    public static void afficherTab(int[] tab) {
        System.out.print("[ ");
        for (int element : tab) {
            System.out.print(element + ", ");
        }
        System.out.println("]");
    }

    /**
     * Cette méthode va nous permettre de renverser le tableau ainsi le premier
     * élément va devenir le dernier et ainsi de suite pour avoir son effet
     * mirroir.
     *
     * @param tab tableau principal {1,2,3,4,5} ou un autre selon sur qui la
     * methode va etre appliquer.
     * @return va retourner le mirroir du tableau netrez à l'entrez.
     */
    public static int[] miroir(int[] tab) {
        int[] miroir = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            miroir[tab.length - 1 - i] = tab[i];
        }
        return miroir;
    }
}
