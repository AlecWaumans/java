/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

import static Exercice.Exercice87.afficherTableau;


/**
 *
 * @author alecw
 */
public class Exercice93 {

    public static void main(String[] args) {
        int[] tabTest;

        System.out.println("Nombre de jours dans un mois");
        afficherTableau(nbJoursParMois(2000));
        afficherTableau(nbJoursParMois(2021));

    }

    public static int[] nbJoursParMois(int annee) {
        int[] mois = new int[12];
        for (int i = 0; i < 12; i++) {
            mois[i] = A5.jourDansMois(i + 1, annee);
        }
        return mois;

    }

}
