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
public class interro_dev1_2021bis {

    public static void exercice3() {
        int a = 1;
        while (true) {
            System.out.println(a);
            a *= 2;
        }
    }

    public static void exercice4() {
        System.out.println("1/2 = 0 reste 1");
        System.out.println("2/2 = 0 reste 0");
        System.out.println("3/2 = 0 reste 1");
        System.out.println("4/2 = 0 reste 0");
        System.out.println("5/2 = 0 reste 1");
        System.out.println("5/2 = 0 reste 0");
        System.out.println("6/2 = 0 reste 1");
        System.out.println("7/2 = 0 reste 0");
        System.out.println("8/2 = 0 reste 1");
        System.out.println("9/2 = 0 reste 0");

        // ou 
        
        for (int b = 1; b <= 9; b++) {
            for (int a = 1; a <= 9; a++) {
                System.out.println(a + "/" + b + "=" + (a / b) + "Reste" + (a % b));
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        exercice4();

    }

}
