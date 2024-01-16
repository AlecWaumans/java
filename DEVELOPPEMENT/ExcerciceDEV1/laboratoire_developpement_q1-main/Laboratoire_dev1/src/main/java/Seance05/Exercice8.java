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
public class Exercice8 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Ecrivez...");
        String phrase = clavier.nextLine();

        if (phrase.equals("OK ESI")) {
            System.out.println("Je vous écoute ?");
        } else {
            System.out.println("Je n'ai pas compris !");
        }
    }

}
