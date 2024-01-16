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
public class Exercice48 {

    public static void ex1() {
        int x, y;// on introduit la valeur
        x = add(3, 4);// a va prendre la valeur de 3 et b = 4
        System.out.println(x);// il va printer X= 7 car ligne 26
        x = 3;
        y = 5;
        y = add(x, y);
        System.out.println(y);
    }

    public static int add(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }
}
