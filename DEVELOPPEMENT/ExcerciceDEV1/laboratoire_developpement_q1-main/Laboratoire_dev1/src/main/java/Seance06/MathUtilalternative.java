/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance06;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class MathUtilalternative {

    public static void main(String[] args) {
        System.out.println("Entrez le rayon de votre cerle Pour calculer son perimettre : ");
        System.out.println("Le prerimettre d'un cercle de 10 cm de rayon est : " + périmettre(demandeRayon()) + " cm");
        System.out.println("Entre le rayon de votre cercle pour calculer son aire : ");
        System.out.println("L'aire du cercle de rayon 10 est : " + aireCercle(demandeRayon()) + " cm²");
    }

    public static double périmettre(double rayon) {
        return 2 * Math.PI * rayon;
    }

    public static double aireCercle(double rayon) {
        return Math.PI * rayon * rayon;
    }

    public static int demandeRayon() {
        Scanner clavier = new Scanner(System.in);
        int rayon = clavier.nextInt();
        return rayon;
    }

}
