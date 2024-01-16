/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.dev1.td10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alecw
 */
public class MonMathTest {

    public MonMathTest() {
    }

    @Test
    public void testPérimettre() {
        System.out.println("périmettre");
        double rayon = 11;
        double expResult = 62.83185307179586;
        double result = MonMath.périmettre(rayon);
        assertEquals(expResult, result);
    }

    /**
     * Test of aireCercle method, of class MonMath.
     */
    @Test
    public void testAireCercle() {
        System.out.println("aireCercle");
        double rayon = 10;
        double expResult = 314.1592653589793;
        double result = MonMath.aireCercle(rayon);
        assertEquals(expResult, result);
    }

    /**
     * Test of min2 method, of class MonMath.
     */
    @Test
    public void testMin2() {
        System.out.println("min2");
        double x = 12;
        double y = 23;
        double expResult = 12;
        double result = MonMath.min2(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of min3 method, of class MonMath.
     */
    @Test
    public void testMin3() {
        System.out.println("min3");
        double x = 12;
        double y = 23;
        double z = 45;
        double expResult = 12;
        double result = MonMath.min3(x, y, z);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of moyenne method, of class MonMath.
     */
    @Test
    public void testMoyenne() {
        System.out.println("moyenne");
        double x = 12;
        double y = 23;
        double expResult = 17.5;
        double result = MonMath.moyenne(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of estDivisible method, of class MonMath.
     */
    @Test
    public void testEstDivisible() {
        System.out.println("estDivisible");
        int a = 10;
        int b = 25;
        boolean result = MonMath.estDivisible(a, b);
        assertFalse(result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of ValeurAbsolue method, of class MonMath.
     */
    @Test
    public void testValeurAbsolue() {
        System.out.println("ValeurAbsolue");
        int a = 10;
        int expResult = 10;
        int result = MonMath.ValeurAbsolue(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of unité method, of class MonMath.
     */
    @Test
    public void testUnité() {
        System.out.println("unité");
        int nb = 125;
        int expResult = 5;
        int result = MonMath.unité(nb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of dizaine method, of class MonMath.
     */
    @Test
    public void testDizaine() {
        System.out.println("dizaine");
        int nb = 125;
        int expResult = 2;
        int result = MonMath.dizaine(nb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of centaine method, of class MonMath.
     */
    @Test
    public void testCentaine() {
        System.out.println("centaine");
        int nb = 125;
        int expResult = 1;
        int result = MonMath.centaine(nb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of miroir method, of class MonMath.
     */
    @Test
    public void testMiroir() {
        System.out.println("miroir");
        int nb = 125;
        int expResult = 521;
        int result = MonMath.miroir(nb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
