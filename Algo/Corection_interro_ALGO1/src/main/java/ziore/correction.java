/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ziore;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class correction {
    static int lireEntier(String msg){
        Scanner clavier = new Scanner(System.in);
        while (!clavier.hasNextInt()){
            clavier.next();
            System.out.println("Ré-essayez!");
        }
        return clavier.nextInt();
    }
   static void afficherplusieursFois(int nbFois, String ch){
       if(nbFois < 0){
           throw new IllegalArgumentException("Le nombre de fois doit être positif "+ nbFois);
       }
       System.out.println(ch.repeat(nbFois));
   }
    static int lireEntierPositif(String msg){
        int nb = lireEntier("Entrez un entier positif: ");
        while(nb < 0){
            nb = lireEntier("L'entier doit être positif: ");
        }
        return nb;
       
    }
    public static void main(String[] args) {
        System.out.println("Alec waumans 58399");
        int nbPositif = lireEntierPositif("Entrez un entier positif: ");
        afficherplusieursFois(nbPositif + 1, "OK");s
        
    }
    
}
