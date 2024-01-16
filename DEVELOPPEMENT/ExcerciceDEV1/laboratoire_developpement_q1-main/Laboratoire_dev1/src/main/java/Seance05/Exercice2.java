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
public class Exercice2 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("introduisez un mot : ");
        String mot = clavier.nextLine();

        if (mot.charAt(0) == 'a' || mot.charAt(0) == 'e' || mot.charAt(0) == 'i' || mot.charAt(0) == 'o' || mot.charAt(0) == 'u' || mot.charAt(0) == 'y') {
            System.out.println("La premiere lettre est une voyelle ");
        }else{
            System.out.println("la premiere lettre est une consomne");
        }
    }

}
