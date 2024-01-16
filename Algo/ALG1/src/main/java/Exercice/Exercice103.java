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
public class Exercice103 {
    public static int[] occurencesChiffres(int n){
        int[] occurences = new int[10];
        while(n != 0){
            int chiffre = n % 10;
            occurences[chiffre]++;
            n /= 10;
            
        }
        return occurences;
    }
    public static void main(String[] args) {
        System.out.println("Occurences des chiffres");
        afficherTableau(occurencesChiffres(1002851125));
        System.out.println();
    }
    
}
