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
public class Exercice48bis {

    public static void ex2() {
        int a, b;
        a = add(3, 4); // cfr. ci-dessus // = 7
        System.out.println(a);// il va sortir 7
        a = 3;
        b = 5;
        b = sub(b, a);
        System.out.println(b);// B vaut 2 car Ligne 24/25
    }

    public static int sub(int a, int b) {
        return a - b;
    }

}
