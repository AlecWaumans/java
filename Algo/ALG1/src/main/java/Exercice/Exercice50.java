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
public class Exercice50 {

    public static int max4(int a, int b, int c, int d) {
        int max;
        if (a >= b && a >= c && a >= d) {
            max = a;
        } else if (b >= c && b >= d) {
            max = b;
        } else if (c >= d) {
            max = c;
        } else {
            max = d;

        }
        return max;
            
    }
    // 50bis Maximum de 4 nombres
    public static int max4bis(int a, int b, int c, int d){
        int maxab = Math.max(a,b);
        int maxcd = Math.max(c,d);
        return Math.max(maxab, maxcd);
        
    }
    public static int max4bisbis(int a, int b, int c, int d){
        return Math.max( Math.max(a,b) , Math.max(c,d));
        
    }
    public static int max4bisbisbisbis(int a, int b, int c, int d){
        return Math.max( Math.max(Math.max(a,b),c),d);
        
    }
    
    public static void main(String[] args) {
        System.out.println(max4(1,5,7,2));
    }

}
