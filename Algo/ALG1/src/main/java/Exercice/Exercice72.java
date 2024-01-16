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
public class Exercice72 {

    public static void main(String[] args) {
        table();

    }

    public static void table() {
        for (int a = 1; a <= 10; ++a) {
            for (int b = 0; b <= 10; b++) {
                System.out.println("1x" + b + "=" + (a * b));
            }
            System.out.println();
        }
    }
}
