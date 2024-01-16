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
public class Exercice95 {
    public static void main(String[] args) {
        System.out.println("Renverser un tableau");
        char[] tabChar;
        tabChar = new char[]{ 
            'h','e','l','o',',','w','o','r','l','d'
        };
        renverser(tabChar);
        System.out.println(new String(tabChar));
        System.out.println("");
    }
    public static void renverser(char[] tab) {
        int dernier = tab.length -1;
        
        for(int i = 0; i < tab.length / 2; ++i){
            char tmp = tab[i];
            tab[i] = tab[dernier - i];
            tab[dernier - i] = tmp;
        }
        
    }
}
