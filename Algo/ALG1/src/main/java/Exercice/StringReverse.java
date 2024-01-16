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
public class StringReverse {

    public static void main(String[] args) {
        System.out.println("Renverser un string");
        System.out.println(renverse("test"));
        System.out.println();

    }

    public static String renverse(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}
