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
public class Exercice106 {
    public static int bienPlace(char[] proposition, char[] combinaison){
        int compteur = 0;
        for(int i = 0; i < combinaison.length; i++){
            if(proposition[i] == combinaison[i]){
                compteur++;
            }
        }
        return compteur;
    }
    public static void main(String[] args) {
        char[] combinaison = {'1', '2', '3', '2'};
        
        
        char[] proposition1 = {'4','2', '1', '3'};
        System.out.println(bienPlace(proposition1, combinaison));
        
        char[] proposition0 = {'2','3', '1', '3'};
        System.out.println(bienPlace(proposition0, combinaison));
        
        char[] proposition2 = {'3','2', '1', '2'};
        System.out.println(bienPlace(proposition2, combinaison));
        
        char[] proposition4 = {'1','2', '3', '2'};
        System.out.println(bienPlace(proposition4, combinaison));
    }
    
}
