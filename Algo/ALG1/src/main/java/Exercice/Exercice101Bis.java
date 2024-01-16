/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

/**
 *
 * @author alecw
 */
public class Exercice101Bis {

    public static int[] rempliGroupe() {
        int[] tableau = new int[4*5];
        int valeur = 1;
        for (int debut = 0; debut < tableau.length; debut += 4){
            for(int i = debut; i < debut + 4; i++) {
                tableau[i] = valeur;
            }
            valeur++;
        }
              
        return tableau;
    }
    public static void main(String[] args) {
        System.out.println("Remplir un tableau");
        tabTest = rempliGroupe();
        afficherTableau(tabTest);
        tabTest = rempliAssemble();
        afficherTableau(tabTest);
        System.out.println();
    }
}
