/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alecw
 */
public class Exercice1Test {

    @Test
    public void testMultiplierNull() {
        System.out.println("testMultiplierNull");
        int[] tab = null;
        int valeur = 0;
        Exercice1.multiplier(tab, valeur);
    }

    /**
     * Test of afficherTab method, of class Exercice1.
     */
    @Test
    public void testAfficherTabPositif() {
        System.out.println("afficherTabPositif");
        int[] tab = {1, 2, 3};
        Exercice1.afficherTab(tab);
        int[] tabAttendu = {1, 2, 3};
        // TODO review the generated test code and remove the default call to fail.
        assertArrayEquals(tabAttendu, tab);
    }

    /**
     * Test of afficherTab method, of class Exercice1.
     */
    @Test
    public void testAfficherTabVide() {
        System.out.println("afficherTabVide");
        int[] tab = {};
        Exercice1.afficherTab(tab);
        int[] tabAttendu = {};
        // TODO review the generated test code and remove the default call to fail.
        assertArrayEquals(tabAttendu, tab);
    }

    /**
     * Test of afficherTab method, of class Exercice1.
     */
    @Test
    public void testAfficherTabnégatif() {
        System.out.println("afficherTabNégatif");
        int[] tab = {-1, -2, -3};
        Exercice1.afficherTab(tab);
        int[] tabAttendu = {-1, -2, -3};
        // TODO review the generated test code and remove the default call to fail.
        assertArrayEquals(tabAttendu, tab);
    }

    /**
     * Test of incrémenter method, of class Exercice1.
     */
    @Test
    public void testIncrémenterPositif() {
        System.out.println("incrémenterPositif");
        int[] tab = {1, 2, 3};
        Exercice1.incrémenter(tab);
        int[] tabAttendu = {2, 3, 4};
        // TODO review the generated test code and remove the default call to fail.
        assertArrayEquals(tabAttendu, tab);
    }

    /**
     * Test of incrémenter method, of class Exercice1.
     */
    @Test
    public void testIncrémenterTableauVide() {
        System.out.println("incrémenterVide");
        int[] tab = {};
        Exercice1.incrémenter(tab);
        int[] tabAttendu = {};
        assertArrayEquals(tabAttendu, tab);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of incrémenter method, of class Exercice1.
     */
    @Test
    public void testIncrémenterTableauNégatif() {
        System.out.println("incrémenterNegatif");
        int[] tab = {-1, -2, -3};
        Exercice1.incrémenter(tab);
        int[] tabAttendu = {0, 1, 2};
        assertArrayEquals(tabAttendu, tab);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multiplier method, of class Exercice1.
     */
    @Test
    public void testMultiplierVide() {
        System.out.println("multiplierVide");
        int[] tab = {};
        int valeur = 0;
        int[] expResult = {};
        Exercice1.multiplier(tab, valeur);
        assertArrayEquals(expResult, tab);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multiplier method, of class Exercice1.
     */
    @Test
    public void testMultiplierPositif() {
        System.out.println("multiplierPositif");
        int[] tab = {1, 2, 3};
        int valeur = 3;
        int[] expResult = {3, 6, 9};
        Exercice1.multiplier(tab, valeur);
        assertArrayEquals(expResult, tab);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multiplier method, of class Exercice1.
     */
    @Test
    public void testMultiplierNégatif() {
        System.out.println("multiplierNégatif");
        int[] tab = {-1, 2, -3};
        int valeur = -3;
        int[] expResult = {3, -6, 9};
        Exercice1.multiplier(tab, valeur);
        assertArrayEquals(expResult, tab);
        // TODO review the generated test code and remove the default call to fail.
    }

}
