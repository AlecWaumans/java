/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

/**
 *
 * @author alecw
 */
public class Exercice76 {

    public static void main(String[] args) {
        System.out.println("Somme des chiffres : ");
        System.out.println(sommeChiffres(133045));
    }

    public static int sommeChiffres(int n) {
        int somme = 0;

        while (n > 0) {
            somme += n % 10;
            n /= 10;
        }
        return somme;

    }

}
