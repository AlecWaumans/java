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
public class Exercice101 {
    public static int[] rempliGroupe() {
        int[] tableau = new int[4*5];
        for(int i = 0; i < 4; i++){
            tableau[i] = 1;
        }
        for(int i = 4; i < 8; i++){
            tableau[i] = 2;
        
        }
        for(int i = 8; i < 12; i++){
            tableau[i] = 3;
        
        }
        for(int i = 12; i < 16; i++){
            tableau[i] = 4;
        }
        for(int i = 16; i < 20; i++){
            tableau[i] = 5;
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
