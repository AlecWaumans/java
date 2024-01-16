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
public class Exercice81 {

    public static void main(String[] args) {
        fourchette();
    }

    public static void fourchette() {
        Scanner clavier = new Scanner(System.in);
        int n = (int) (Math.random() * 100 + 1);
        System.out.println("Commencons le jeux !");

        int i = 0;
        boolean atrouve = false;

        while (!atrouve && i < 8) {
            System.out.println("Entre un nombre : ");
            int essai = clavier.nextInt();
            if (n < essai) {
                System.out.println("Le nombre donnée est trop grand");
            } else if (n > essai) {
                System.out.println("Le nombre donnée est trop petit");
            } else {
                atrouve = true;
            }

            ++i;
        }
        if (atrouve) {
            System.out.println("Bravo, vous avez trouvé ");
        } else {
            System.out.println("Désolé, le nombre etait: " + n);
        }

    }
}
