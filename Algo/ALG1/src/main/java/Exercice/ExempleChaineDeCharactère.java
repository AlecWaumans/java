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
public class ExempleChaineDeCharactère {

    public static void main(String[] args) {
        ex2();

    }

    public static void ex1() {
        System.out.println("hello");
        System.out.println();

        char c = 'L';

        char test = Character.toLowerCase(c);
        System.out.println(test);

    }

    public static void ex2() {
        System.out.println("hello");
        System.out.println();

        String str = "hello";
        double test = (int) Double.parseDouble(str);
        test *= 2;

        System.out.println(test);

    }

}
