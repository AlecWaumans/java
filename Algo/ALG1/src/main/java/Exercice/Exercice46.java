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
public class Exercice46 {

    public static double prixphotocopies(int nombre) {
        double prix;

        if (nombre < 11) {
            prix = nombre * 0.10;
        } else if (nombre < 31) {
            prix = 10 * 0.10 + (nombre - 10) * 0.09;
        } else {
            prix = 10 * 0.10 + 20 * 0.09 + (nombre - 30) * 0.08;

        }

        return prix;
    }

    public static void main(String[] args) {
        System.out.println(prixphotocopies(0) + "=" + 0);
        System.out.println(prixphotocopies(5) + "=" + 0.5);
        System.out.println(prixphotocopies(9) + "=" + 0.9);
        System.out.println(prixphotocopies(10) + "=" + 1);
        System.out.println(prixphotocopies(11) + "=" + 1.09);
        System.out.println(prixphotocopies(30) + "=" + 2.8);
        System.out.println(prixphotocopies(31) + "=" + 2.88);
    }
}
