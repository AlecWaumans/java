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
public class Exercice100 {
    public static boolean ordonne(int [] tableau) {
        boolean estOrdonne = true;
        for(int i = 0;estOrdonne && i <tableau.length - 1;i++){
            if(tableau[i] >= tableau[i+1]){
                estOrdonne = false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        System.out.println("Tableau ordonné");
        tabTest = initAlternance(10);
        System.out.println(ordonne(tabTest));
        tabTest = initIndice();
        System.out.println(ordonne(tabTest));
        System.out.println();
    }
    
}
