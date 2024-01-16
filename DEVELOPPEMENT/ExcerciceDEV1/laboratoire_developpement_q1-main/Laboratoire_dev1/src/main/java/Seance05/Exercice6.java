/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance05;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice6 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("introduisez un mot : ");
        String mot = clavier.nextLine();
        
        for (int i = 0; i< mot.length(); i++){
            if(mot.charAt(i)=='a'||mot.charAt(i)=='e'||mot.charAt(i)=='i'||mot.charAt(i)=='o'||mot.charAt(i)=='u'||mot.charAt(i)=='y'){
                System.out.print(mot.charAt(i));
            }
        }
        
    }
    
}
