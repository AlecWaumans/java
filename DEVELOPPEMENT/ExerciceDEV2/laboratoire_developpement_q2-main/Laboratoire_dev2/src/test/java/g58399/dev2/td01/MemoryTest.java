package g58399.dev2.td01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alecw
 */
public class MemoryTest {

    public MemoryTest() {
    }

    /**
     * Test of initCards method, of class Memory.
     */
    @Test
    public void testInitCardsCasgénéral() {
        System.out.println("initCards");
        int n = 4;
        int[] expResult = {1, 1, 2, 2, 3, 3, 4, 4};
        int[] result = Memory.initCards(n);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test la methode initCards de la taille minimal de la class memory
     */
    @Test
    public void testInitCardsTailleminimal() {
        System.out.println("initCards Taille Minimal");
        int n = 3;
        int[] expResult = {1, 1, 2, 2, 3, 3};
        int[] result = Memory.initCards(n);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test la methode initCards de la taille maximal de la class memory
     */
    @Test
    public void testInitCardsTailleMaximal() {
        System.out.println("initCards Taille Maximal");
        int n = 20;
        int[] expResult = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20};
        int[] result = Memory.initCards(n);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test de la méthode intiCards avec le lancement d'un exception en dessouds
     * du nomnbre attentdu.
     */
    @Test
    public void testInitCardsExeption() {
        assertThrows(IllegalArgumentException.class, () -> Memory.initCards(2));
    }

    /**
     * Test de la méthode intiCards avec le lancement d'un exception au dessuds
     * du nomnbre attentdu.
     */
    @Test
    public void testInitCardsExeption2() {
        assertThrows(IllegalArgumentException.class, () -> Memory.initCards(21));
    }

    /**
     * Test of afficherTab method, of class Exercice1.
     */
    @Test
    public void testAfficherTabPositif() {
        System.out.println("afficherTabPositif");
        int[] tab = {1, 2, 3};
        Memory.afficherTabint(tab);
        int[] tabAttendu = {1, 2, 3};
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
        Memory.afficherTabint(tab);
        int[] tabAttendu = {-1, -2, -3};
        // TODO review the generated test code and remove the default call to fail.
        assertArrayEquals(tabAttendu, tab);
    }

}
