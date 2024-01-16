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
public class Exercice91 {

    public static void main(String[] args) {
        System.out.println("au moins un 20");
        int[] cotes1 = {0, 5, 7, 10, 12, 15, 17};
        int[] cotes2 = {0, 5, 7, 20, 12, 15, 17};
        int[] cotes3 = {0, 20, 7, 20, 12, 20, 17};

        System.out.println("AuMoindUn20");
        System.out.println(auMoinsUn20(cotes1));
        System.out.println(auMoinsUn20(cotes2));
        System.out.println(auMoinsUn20(cotes3));
        System.out.println();
        
        System.out.println("ExactementUn20");
        System.out.println(exactementUn20(cotes1));
        System.out.println(exactementUn20(cotes2));
        System.out.println(exactementUn20(cotes3));
        System.out.println();
    }

    public static boolean auMoinsUn20(int[] cotes) {
        boolean trouve = false;
        for (int i = 0; !trouve && i < cotes.length; i++) {
            if (cotes[i] == 20) {
                trouve = true;
            }
        }
        return trouve;

    }

    public static boolean exactementUn20(int[] cotes) {
        int compteur20 = 0;
        for (int i = 0; compteur20 < 2 && i < cotes.length; i++) {
            if (cotes[i] == 20) {
                compteur20++;
            }
        }
        return compteur20 == 1;
    }

}
