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
public class Exercice83 {

    public static void main(String[] args) {
        ex83bis();
    }

    public static void ex83() {
        int[] tableau = new int[100];
        int i = 0;
        while (i < 100) {
            i = i + 1;
            tableau[i] = i;
        }

    }

    public static void ex83bis() {
        int[] tableau = new int[100];
        for (int i = 0; i < 100; i++) {
            tableau[i] = i;
        }

    }
}
