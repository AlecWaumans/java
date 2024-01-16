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
// cond ? ... : ... ;== if(cond){...}else{...};
public class Exercice71 {

    public static void main(String[] args) {
        System.out.println(produit(3,5));

    }

    public static int produit(int a, int b) {
        int resultat = 0;
        for (int i = 0; i < b; i++){
            resultat += a;
        }
        return resultat;
    }
}
