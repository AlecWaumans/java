/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance08;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Lecture {

    public static void main(String[] args) {
        int entier = lireEntier("Veuillez indroduire un entier : ");
        double chiffreVirgule = lireDouble("Veuillez introduire un double : ");
        System.out.println("votre entier est : " + entier);
        System.out.println("Votre nombre à virgule est : " + chiffreVirgule);
        int min = 0;
        int max = 100;
        int nbsMinMax = LireEntierMinMax2("Entrez un nombre entre " + max + " et " + min, max, min);
    }

    public static int lireEntier(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.println(message);
        while (!clavier.hasNextInt()) {
            clavier.next();
            System.out.println("Le nombre saisi n'est pas un entier.");
            System.out.println(message);
        }
        return clavier.nextInt();
    }

    public static double lireDouble(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.println(message);
        while (!clavier.hasNextDouble()) {
            clavier.next();
            System.out.println("Le nombre saisi n'est pas un nombre à virgule");
            System.out.println(message);
        }
        return clavier.nextDouble();

    }

    public static int LireEntierMinMax(String message, int min, int max) {
        Scanner clavier = new Scanner(System.in);
        System.out.println(message);
        while (!clavier.hasNextInt()|| clavier.nextInt() <= 0 || clavier.nextInt() >= 100) {
            clavier.next();
            System.out.println("Le nombre saisi n'est pas un entier compris entre 0 et 100");
            System.out.println(message);
        }
        return clavier.nextInt();

    }
    // petit probleme dans cette methode ne comprend pas pourquoi ?
    
    public static int LireEntierMinMax2(String message, int min, int max){
        int entier = lireEntier(message);
        while(entier < min || entier > max){
            System.out.println("L'entier n'est pas compris entre "+ min + " et " + max);
            entier = lireEntier(message);
        }
        return entier;
    }

}
