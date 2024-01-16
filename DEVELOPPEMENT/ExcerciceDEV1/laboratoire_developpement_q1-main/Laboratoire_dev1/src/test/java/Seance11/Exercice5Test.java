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
public class Exercice5Test {
    /**
     * Test of testMiroirNull method, of class Exercice5.
     */
    @Test
    public void testMiroirNull() {
        System.out.println("testMiroirNull");
        int[] tab = null;
        Exercice5.miroir(tab);
    }
    /**
     * Test of testMiroirVide method, of class Exercice5.
     */
    @Test
    public void testMiroirVide() {
        System.out.println("testMiroirVide");
        int[] tab = {};
        int[] expResult = {};
        int[] result = Exercice5.miroir(tab);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of testMiroirTaillePaire method, of class Exercice5.
     */
    @Test
    public void testMiroirTaillePaire() {
        System.out.println("testMiroirTaillePaire");
        int[] tab = {1,2,3,4};
        int[] expResult = {4,3,2,1};
        int[] result = Exercice5.miroir(tab);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of testMiroirTailleImpaire method, of class Exercice5.
     */
    @Test
    public void testMiroirTailleImpaire() {
        System.out.println("testMiroirTailleImpaire");
        int[] tab = {-12,8,-4,9,-25};
        int[] expResult = {-25,9,-4,8,-12};
        int[] result = Exercice5.miroir(tab);
        assertArrayEquals(expResult, result);
    }

    
}
