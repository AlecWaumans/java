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
public class Exercice4Test {

    /**
     * Test of testAfficherTaillesNull method, of class Exercice4.
     */
    @Test
    public void testAfficherTaillesNull() {
        System.out.println("testAfficherTaillesNull");
        String[] tab = null;
        Exercice4.afficherTailles(tab);
    }

    /**
     * Test of testAfficherTaillesVide method, of class Exercice4.
     */
    @Test
    public void testAfficherTaillesVide() {
        System.out.println("testAfficherTaillesVide");
        String[] tab = {};
        Exercice4.afficherTailles(tab);
    }

    /**
     * Test of testAfficherTaillesTaille3 method, of class Exercice4.
     */
    @Test
    public void testAfficherTaillesTaille3() {
        System.out.println("testAfficherTaillesTaille3");
        String[] tab = {"a", "bc", "def"};
        Exercice4.afficherTailles(tab);
    }

    /**
     * Test of testAfficherTaillesAutreTaille method, of class Exercice4.
     */
    @Test
    public void testAfficherTaillesAutreTaille() {
        System.out.println("testAfficherTaillesAutreTaille");
        String[] tab = {"a", "bc", "def", "ghij"};
        Exercice4.afficherTailles(tab);
    }

    /**
     * Test of testPlusLongMotNull method, of class Exercice4.
     */
    @Test
    public void testPlusLongMotNull() {
        System.out.println("testPlusLongMotNull");
        String[] tab = null;
        Exercice4.plusLongMot(tab);
    }

    /**
     * Test of testPlusLongMotVide method, of class Exercice4.
     */
    @Test
    public void testPlusLongMotVide() {
        System.out.println("testPlusLongMotVide");
        String[] tab = {};
        Exercice4.plusLongMot(tab);
    }

    /**
     * Test of testPlusLongMotDernierMot method, of class Exercice4.
     */
    @Test
    public void testPlusLongMotDernierMot() {
        System.out.println("testPlusLongMotDernierMot");
        String[] tab = {"a", "bc", "def"};
        String expResult = "def";
        String result = Exercice4.plusLongMot(tab);
        assertEquals(expResult, result);
    }

    /**
     * Test of testPlusLongMotPremierMot method, of class Exercice4.
     */
    @Test
    public void testPlusLongMotPremierMot() {
        System.out.println("testPlusLongMotPremierMot");
        String[] tab = {"abcde", "bc", "def", "ghij"};
        String expResult = "abcde";
        String result = Exercice4.plusLongMot(tab);
        assertEquals(expResult, result);
    }

    /**
     * Test of testPlusLongMotAutreMot method, of class Exercice4.
     */
    @Test
    public void testPlusLongMotAutreMot() {
        System.out.println("testPlusLongMotAutreMot");
        String[] tab = {"ab", "bc", "defghij", "ghij"};
        String expResult = "defghij";
        String result = Exercice4.plusLongMot(tab);
        assertEquals(expResult, result);
    }

    /**
     * Test of testPlusLongMotPlusieursMots method, of class Exercice4.
     */
    @Test
    public void testPlusLongMotPlusieursMots() {
        System.out.println("testPlusLongMotPlusieursMots");
        String[] tab = {"abcd", "bcef", "defg", "ghi"};
        String expResult = "abcd";
        String result = Exercice4.plusLongMot(tab);
        assertEquals(expResult, result);
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
}
