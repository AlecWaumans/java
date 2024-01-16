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
public class Exercice97 {
    public static int maximum(int[] tableau) {
        int max = tableau[0];
        
        for(int i = 0; i < tableau.length; i ++){
            if(tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Maximum");
        tabTest = initalternance(10);
        System.out.println(maximum(tabTest));
        System.out.println();
    }
}
