/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.dev1.td10;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class MonMath {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le rayon de votre cercle : ");
        int rayon = clavier.nextInt();
        System.out.println("Le prerimettre d'un cercle de 10 cm de rayon est : " + périmettre(rayon) + " cm");
        System.out.println("L'aire du cercle de rayon 10 est : " + aireCercle(rayon) + " cm²");
        System.out.println("introduisez trois nombre: ");
        double x = clavier.nextDouble();
        double y = clavier.nextDouble();
        double z = clavier.nextDouble();
        System.out.println("Le nombre le plus petit des deux premiers chiffres est : " + min2(x, y));
        System.out.println("Le nombre le plus petit des trois chiffres est " + min3(x, y, z));
        System.out.println("La moyenne des deux nombres ce trouve être : " + moyenne(x, y));
        System.out.println("Introduisez deux nombres entiers : ");
        int a = clavier.nextInt();
        int b = clavier.nextInt();
        System.out.println("Le premier nombre est divisible par le deuxieme ? : " + estDivisible(a, b));
        System.out.println("La valeur absolue de la premiere valeur est : " + ValeurAbsolue(a));
        System.out.println("Introduisez un entier entre 100 et 999 : ");
        int nb = clavier.nextInt();
        System.out.println("les unités de ce nombre est : " + unité(nb));
        System.out.println("Les dizaines de ce nombre est : " + dizaine(nb));
        System.out.println("Les centaine de ce nombre est : " + centaine(nb));
        System.out.println("Le chiffre mirroir de ce nombre est : " + miroir(nb));
    }

    public static double périmettre(double rayon) {
        if(rayon < 0){
            throw new IllegalArgumentException("Le rayon dois être positif: " + rayon);
        }
        return 2 * Math.PI * rayon;
    }

    public static double aireCercle(double rayon) {
        return Math.PI * rayon * rayon;
    }

    public static double min2(double x, double y) {
        double min = x;
        if (x > y) {
            min = y;
        } else {
        }
        return min;
    }

    public static double min3(double x, double y, double z) {
        double min = min2(x, y);
        min = min2(min, z);
        return min;
    }

    public static double moyenne(double x, double y) {
        return (x + y) / 2;
    }

    public static boolean estDivisible(int a, int b) {
        return (a % b) == 0;
    }

    public static int ValeurAbsolue(int a) {
        if (a < 0) {
            a = -a;
        }
        return a;
    }

    public static int unité(int nb) {
        return (nb % 10);
    }

    public static int dizaine(int nb) {
        return (nb / 10) % 10;
    }

    public static int centaine(int nb) {
        return (nb / 100) % 10;
    }

    public static int miroir(int nb) {
        return unité(nb) * 100 + dizaine(nb) * 10 + centaine(nb);
    }

}
