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
public class Exercice92 {
    public static int[] lancers2des(int n){
        int [] resultat = new int[11];// indices 0 à 10 
        for (int i = 0; i < n; i++){
            int des1 = A3.aleatoire(1,6); // ex 26
            int des2 = A3.aleatoire(1,6);
            int somme = des1 + des2;
            resultat[somme - 2]++;
        }
        return resultat;
    }
    public static void main(String[] args) {
        System.out.println("lancers de deux dés");
        afficherTableau(lancers2des(10));
        afficherTableau(lancers2des(100));
        System.out.println();
    }
    
}
