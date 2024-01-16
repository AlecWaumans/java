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
public class Exercice79 {

    public static void main(String[] args) {
        System.out.println(miroire(155));

    }

    public static int miroire(int n) {
        int miroire = 0;

        while (n > 0) {
            miroire = miroire * 10 + n % 10;
            n /= 10;
        }
        return miroire;
    }
}
