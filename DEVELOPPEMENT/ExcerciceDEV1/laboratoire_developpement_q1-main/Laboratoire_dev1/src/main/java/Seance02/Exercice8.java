/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance02;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice8 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le nombre de seconde que vous voulez mettre en minutes : ");
        int seconde = clavier.nextInt();
        int minute = seconde / 60;
        System.out.println("Cela fait en minute : " + minute);
    }

}
