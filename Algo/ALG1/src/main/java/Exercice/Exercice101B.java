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
public class Exercice101B {
    public static int[] rempliAssemble(){
        int[] tableau = new int[4 * 5];
        
        for(int group = 0; group < 4; ++group){
            for (int i = 0; i < 5; i++){
                tableau[group * 5 + i] = i + 1;
            }
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
