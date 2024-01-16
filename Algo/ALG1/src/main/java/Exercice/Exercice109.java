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
public class Exercice109 {

    public static void main(String[] args) {
        System.out.println("Gauche et droite");
        System.out.println(gauche("bonjour", 4));
        System.out.println();

        System.out.println("Conversion de nom");
        System.out.println(droite("Bonjour", 4));
        System.out.println();
    }

    public static String gauche(String str, int n) {
        return str.substring(0, n);

    }

    public static String droite(String str, int n) {
        return str.substring(str.length() - n);

    }
}
