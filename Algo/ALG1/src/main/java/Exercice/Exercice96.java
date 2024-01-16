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
public class Exercice96 {
    public static boolean estSymétrique(String[] chaines){
        boolean res = true;
        int n =  chaines.length;
        for (int i = 0; i < n/2 && res; i++){
            res = chaines[i].equals(chaines[n - 1 - i]);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Tableau symétrique");
        String[] chaines1 = {"Hi", "test","milieu","test","fin"};
        System.out.println(estSymétrique(chaines1));
        String[] chaines2 = {"Hi", "test","test","hi"};
        System.out.println(estSymétrique(chaines2));
        String[] chaines3 = {"Hi", "test", "Ko", "hi"};
        System.out.println(estSymétrique(chaines3));
         String[] chaines4 = {"hi", "test", "test", "hi"};
        System.out.println(estSymétrique(chaines4));
        System.out.println();
    }
}
