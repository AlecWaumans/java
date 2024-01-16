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
public class Exercice3 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("écrivez la longueur d'un carré :  ");
        int coté = clavier.nextInt();
        System.out.println("L'aire du carré est :" + coté * coté + "cm²");

    }

}
