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
public class Exercice43 {
    public static int nbJours ( int mois ){
        int result;
        switch (mois){
            case 2 :
                result = 28;
                break;
            case 1:
            case 3: 
           case 5: 
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;
            default:
                result = 30;
                break;
        }
        return result;
    }
}
