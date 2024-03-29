/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance12;

//import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests unitaires de la classe du mot le plus long.
 *
 * @author esiProf
 */

public class LeMotLePlusLongTest {
    
     @Test
    public void testTirerVoyelle() {
        System.out.println("testTirerVoyelle");
        char[] voyelles = {'A', 'E', 'I', 'O', 'U', 'Y'};
        char result = LeMotLePlusLong.tirerVoyelle();
        boolean find = false;
        int indice = 0;
        while (!find && indice < voyelles.length) {
            find = result == voyelles[indice];
            indice++;
        }
        //Assert.assertTrue(find);
    }

    @Test
    public void testTirerConsonne() {
        System.out.println("testTirerConsonne");
        char[] consonnes = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
            'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'};
        char result = LeMotLePlusLong.tirerConsonne();
        boolean find = false;
        int indice = 0;
        while (!find && indice < consonnes.length) {
            find = result == consonnes[indice];
            indice++;
        }
        //Assert.assertTrue(find);
    }

    @Test
    public void testAfficherLettresNull() {
        System.out.println("testAfficherLettresNull");
        char[] lettres = null;
        LeMotLePlusLong.afficherLettres(lettres);

    }

    @Test
    public void testAfficherLettresVide() {
        System.out.println("testAfficherLettresVide");
        char[] lettres = {};
        LeMotLePlusLong.afficherLettres(lettres);

    }

    @Test
    public void testAfficherLettresRempli() {
        System.out.println("testAfficherLettresRempli");
        char[] lettres = {'b', 'o', 'n', 'j', 'o', 'u', 'r'};
        LeMotLePlusLong.afficherLettres(lettres);

    }

    @Test
    public void testVérifierLettresTabNull() {
        System.out.println("testVérifierLettresTabNull");
        char[] lettres = null;
        String mot = "";
        LeMotLePlusLong.VérifierLettres(lettres, mot);
    }

    @Test
    public void testVérifierLettresMotNull() {
        System.out.println("testVérifierLettresMotNull");
        char[] lettres = {'a', 'b'};
        String mot = null;
        LeMotLePlusLong.VérifierLettres(lettres, mot);
    }

    @Test
    public void testVérifierLettresVideFalse() {
        System.out.println("testVérifierLettresVideFalse");
        char[] lettres = {};
        String mot = "moi";
        boolean expResult = false;
        boolean result = LeMotLePlusLong.VérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresVideTrue() {
        System.out.println("testVérifierLettresVideTrue");
        char[] lettres = {};
        String mot = "";
        boolean expResult = true;
        boolean result = LeMotLePlusLong.VérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresTrue() {
        System.out.println("testVérifierLettresTrue");
        char[] lettres = {'b', 'c', 'n', 'j', 'o', 'a'};
        String mot = "abc";
        boolean expResult = true;
        boolean result = LeMotLePlusLong.VérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresFalse() {
        System.out.println("testVérifierLettresFalse");
        char[] lettres = {'c', 'n', 'j', 'o', 'c'};
        String mot = "abc";
        boolean expResult = false;
        boolean result = LeMotLePlusLong.VérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresDernier() {
        System.out.println("testVérifierLettresDernier");
        char[] lettres = {'d', 'r', 'n', 'j', 'o', 'e', 'r'};
        String mot = "def";
        boolean expResult = false;
        boolean result = LeMotLePlusLong.VérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresRepetitionTrue() {
        System.out.println("testVérifierLettresRepetitionTrue");
        char[] lettres = {'b', 's', 'n', 'j', 'o', 'u', 'r', 'o'};
        String mot = "bonjour";
        boolean expResult = true;
        boolean result = LeMotLePlusLong.VérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresRepetitionFalse() {
        System.out.println("testVérifierLettresRepetitionFalse");
        char[] lettres = {'b', 'o', 'r', 'j', 's', 'u', 'n'};
        String mot = "bonjour";
        boolean expResult = false;
        boolean result = LeMotLePlusLong.VérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresTouteLesLettres() {
        System.out.println("testVérifierLettresTouteLesLettres");
        char[] lettres = {'b', 'o', 'n', 'j', 'o', 'u', 'r'};
        String mot = "bonjour";
        boolean expResult = true;
        boolean result = LeMotLePlusLong.VérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testDansDictionnaireNull() {
        System.out.println("testDansDictionnaireNull");
        String mot = null;
        LeMotLePlusLong.dansDictionnaire(mot);
    }

    @Test
    public void testDansDictionnaireVide() {
        System.out.println("testDansDictionnaireVide");
        String mot = "";
        boolean expResult = false;
        boolean result = LeMotLePlusLong.dansDictionnaire(mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testDansDictionnairePremier() {
        System.out.println("testDansDictionnairePremier");
        String mot = "AA";
        boolean expResult = true;
        boolean result = LeMotLePlusLong.dansDictionnaire(mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testDansDictionnaireDernier() {
        System.out.println("testDansDictionnaireDernier");
        String mot = "ZYTHUMS";
        boolean expResult = true;
        boolean result = LeMotLePlusLong.dansDictionnaire(mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testDansDictionnaireHasard() {
        System.out.println("testDansDictionnaireHasard");
        String mot = "TRANSAT";
        boolean expResult = true;
        boolean result = LeMotLePlusLong.dansDictionnaire(mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testDansDictionnaireFalse() {
        System.out.println("testDansDictionnaireFalse");
        String mot = "aaabhdvwdvdw";
        boolean expResult = false;
        boolean result = LeMotLePlusLong.dansDictionnaire(mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testMeilleurMotNull() {
        System.out.println("testMeilleurMotNull");
        char[] lettres = null;
        LeMotLePlusLong.meilleurMot(lettres);
    }

    @Test
    public void testMeilleurMotVide() {
        System.out.println("testMeilleurMotVide");
        char[] lettres = {};
        String expResult = "";
        String result = LeMotLePlusLong.meilleurMot(lettres);
        assertEquals(expResult, result);
    }

    @Test
    public void testMeilleurMotUnSeul() {
        System.out.println("testMeilleurMotUnSeul");
        char[] lettres = {'c', 'u', 'c', 'a', 'e', 'i', 'l'};
        String expResult = "ACCUEIL";
        String result = LeMotLePlusLong.meilleurMot(lettres);
        assertEquals(expResult, result);
    }

    @Test
    public void testMeilleurMotPlusieurs() {
        System.out.println("testMeilleurMotPlusieurs");
        char[] lettres = {'T', 'I', 'A', 'T', 'C', 'C', 'I', 'T', 'E'};
        String expResult = "CITAIT";
        String result = LeMotLePlusLong.meilleurMot(lettres);
        assertEquals(expResult, result);
    }

    @Test
    public void testMeilleurMotAucun() {
        System.out.println("testMeilleurMotAucun");
        char[] lettres = {'i', 'o', 'r', 'e', 'i', 'n'};
        String expResult = "IRONIE";
        String result = LeMotLePlusLong.meilleurMot(lettres);
        assertEquals(expResult, result);
    }

}
