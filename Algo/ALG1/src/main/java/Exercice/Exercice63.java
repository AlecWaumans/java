/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice63 {
    public static void main(String[] args) {
        ex63();
    }
    public static void ex63() {
        Scanner clavier = new Scanner(System.in);
        int compteur = 0;
        String ouiNon;
        
        do{
            System.out.println("entrer un nombre : ");
            int nombre = clavier.nextInt();
            clavier.nextLine();// ignorée le retour à la ligne apres le nombre
            
            if(nombre % 2==1){
                compteur++;
            }
            System.out.println("Voulez-vous continuer ?");
            ouiNon = clavier.nextLine();
        }while (ouiNon.equals("O")); //et si on veut faire plusieurs touche d'arrêt on fera (ouiNon.equals("O")) || (ouiNon.equals("O"));
        System.out.println("Vous avez entrée"+ compteur + "Nombres impairs.");
        }
    public static void exo65() {
        //int variable = scanner clavier
        //while(nombre!=0){
            //if(nombre%2==1){
            //Sout("impair");
            //}
            //nombre = scanner clavier
            //}     
    }
    public static void exo66() {//compter reussites
        //System.out.println("Veuillez entrez votre cotes.");
        //System.out.println("terminer par un nombre négatif ou sup à 20");
        
        //int reussites = 0;
        //int total=0;
        //int cote = clavier scanner
                //while(0<=cote&&cote<=20){
                    //total++;
                //if (cote>=10){
                    //reussites++
                //}
                //cote = clavier scanner
                //}
        //double pourcentage = (double)reussite/cote*100;
            //System.out.println("Le pourcentage de réussite est "+pourcentage);
    }
}

