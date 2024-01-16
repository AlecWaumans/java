/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance04;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Entrez 10 valeurs ");
        
        int indice = 1;
        
        while(indice<=10){
            int valeur = clavier.nextInt();
            if(valeur%2==0){
                System.out.println("Cette valeur est pair : " + valeur);
            }
            indice++;
        }
    }
    
}
