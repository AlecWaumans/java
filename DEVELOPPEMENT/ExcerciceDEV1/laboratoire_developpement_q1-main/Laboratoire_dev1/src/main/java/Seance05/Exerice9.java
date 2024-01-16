/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance05;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exerice9 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez une pharase : ");
        String phrase = clavier.nextLine();
        int dernierIndice = phrase.length() - 1;

        boolean commenceParMajuscule = Character.isUpperCase(phrase.charAt(0));
        System.out.print("La première lettre ");
        if (commenceParMajuscule) {
            System.out.println("est une majuscule");
        } else {
            System.out.println("n'est pas une majuscule");
        }

        boolean termineParPoint = phrase.charAt(dernierIndice) == '.';
        System.out.print("Le dernièr caractère ");
        if (termineParPoint) {
            System.out.println("est un point");
        } else {
            System.out.println("n'est pas un point");
        }

    }

}

