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
public class Exercice47 {

    public static boolean StationementCorrecte(int jours, int maison) {
        boolean entre1et15 = jours <= 15;
        boolean impaire = maison % 2 == 1;

        return entre1et15 == impaire;
    }

    public static void main(String[] args) {
        System.out.println(StationementCorrecte(5, 2));
        System.out.println(StationementCorrecte(5, 3));
        System.out.println(StationementCorrecte(25, 2));
        System.out.println(StationementCorrecte(25, 3));

    }
}
