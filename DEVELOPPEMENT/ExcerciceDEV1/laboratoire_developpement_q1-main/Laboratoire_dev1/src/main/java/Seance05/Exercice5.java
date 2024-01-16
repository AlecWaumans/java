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
public class Exercice5 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduisez un mot : ");
        String mot = clavier.nextLine();
        
        for (int i = mot.length() - 1; i >= 0; i--) {
            System.out.print(mot.charAt(i));
        }
    }
    
}
