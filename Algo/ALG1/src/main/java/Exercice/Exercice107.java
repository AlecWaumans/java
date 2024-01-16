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
public class Exercice107 {

    public static void main(String[] args) {
        System.out.println("Calcul de fraction");
        System.out.println(fraction("3/4"));
        System.out.println(fraction("4/2"));
        System.out.println(fraction("1/3"));
        System.out.println(fraction("0/2"));
        System.out.println();
    }

    public static double fraction(String valeur) {
        int position = valeur.indexOf("/");
        String numerateur = valeur.substring(0, position);
        String denominateur = valeur.substring(position + 1);

        int num = Integer.parseInt(numerateur);
        int den = Integer.parseInt(denominateur);

        double resultat = (double) num / den;

        return resultat;
    }

}
