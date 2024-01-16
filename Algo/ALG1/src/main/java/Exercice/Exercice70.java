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
public class Exercice70 {

    public static int factorielle(int n) {
        int fact = n == 0 ? 1 : n;

        for (int i = n - 1; i >= 2; i--) {
            fact = fact*i;
        }

        return fact;

    }

    public static void main(String[] args) {
        //System.out.println(factorielle(5));
        for(int i = 0; i < 10; i++){
            System.out.print(i+"! = ");
            System.out.println(factorielle(i));
        }
    }

}
