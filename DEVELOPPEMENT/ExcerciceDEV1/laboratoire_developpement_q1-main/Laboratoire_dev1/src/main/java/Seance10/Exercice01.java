/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance10;

/**
 *
 * @author alecw
 */
public class Exercice01 {
    public static void main(String[] args) {
        System.out.println(abs(5));
    }
    public static double abs(double x){
        if(x < 0){
            return -x;
        }else{
            return x;
        }
    }
    
}
