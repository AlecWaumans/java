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
public class Exercice67 {

    public static void main(String[] args) {

    }

    //exercice 67 : suite
    public static void a() {
        int i = 0;
        for (int = i - 1; true ; i--){
        System.out.println(i);
        }

    }

    public static void b() {
        for (int i = 1, j = 2; true; i += j, j++) {
            System.out.println(i);
        }

    }

    public static void c() {
        for (int i = 1; true; i++) {
            System.out.println(i % 2);
        }

    }

    public static void d() {
        for (int i = 1; true; i++) {
            System.out.println(i % 3);
        }

    }

    public static void e() {
        int i = 1;
        while (true) {
            System.out.println(i);
            if (i < 3) {
                i++;
            } else {
                i = 1;
            }
        }

    }

    public static void f() {
        while (true) {
            int i = 1;
            while (i < 3) {
                System.out.println(i);// => 1,2
                i++;
            }
            while (i > 1) {
                System.out.println(i);// => 3,2
                i--;
            }
        }

    }
}
