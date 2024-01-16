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
public class Exercice45 {

    public static boolean fourchette(int val, int a, int b) {
        int min, max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        return (min < val && val < max);
    }

    public static void main(String[] args) {
        System.out.println(fourchette(3, 2, 1));
        System.out.println(fourchette(10, 1, 5));
    }
}
