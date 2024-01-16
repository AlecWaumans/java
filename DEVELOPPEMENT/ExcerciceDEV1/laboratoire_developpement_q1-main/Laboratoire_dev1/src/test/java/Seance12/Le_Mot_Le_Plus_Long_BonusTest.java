/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance12;

//import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests unitaires de la classe du mot le plus long.
 *
 * @author esiProf
 */
public class Le_Mot_Le_Plus_Long_BonusTest {

    @Test
    public void testTirerVoyelle() {
        System.out.println("testTirerVoyelle");
        char[] voyelles = {'A', 'E', 'I', 'O', 'U', 'Y'};
        char result = Le_Mot_Le_Plus_Long_Bonus.tirerVoyelle();
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
        char result = Le_Mot_Le_Plus_Long_Bonus.tirerConsonne();
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
        Le_Mot_Le_Plus_Long_Bonus.afficherLettres(lettres);

    }

    @Test
    public void testAfficherLettresVide() {
        System.out.println("testAfficherLettresVide");
        char[] lettres = {};
        Le_Mot_Le_Plus_Long_Bonus.afficherLettres(lettres);

    }

    @Test
    public void testAfficherLettresRempli() {
        System.out.println("testAfficherLettresRempli");
        char[] lettres = {'b', 'o', 'n', 'j', 'o', 'u', 'r'};
        Le_Mot_Le_Plus_Long_Bonus.afficherLettres(lettres);

    }

    @Test
    public void testVérifierLettresTabNull() {
        System.out.println("testVérifierLettresTabNull");
        char[] lettres = null;
        String mot = "";
        Le_Mot_Le_Plus_Long_Bonus.vérifierLettres(lettres, mot);
    }

    @Test
    public void testVérifierLettresMotNull() {
        System.out.println("testVérifierLettresMotNull");
        char[] lettres = {'a', 'b'};
        String mot = null;
        Le_Mot_Le_Plus_Long_Bonus.vérifierLettres(lettres, mot);
    }

    @Test
    public void testVérifierLettresVideFalse() {
        System.out.println("testVérifierLettresVideFalse");
        char[] lettres = {};
        String mot = "moi";
        boolean expResult = false;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.vérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresVideTrue() {
        System.out.println("testVérifierLettresVideTrue");
        char[] lettres = {};
        String mot = "";
        boolean expResult = true;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.vérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresTrue() {
        System.out.println("testVérifierLettresTrue");
        char[] lettres = {'b', 'c', 'n', 'j', 'o', 'a'};
        String mot = "abc";
        boolean expResult = true;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.vérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresFalse() {
        System.out.println("testVérifierLettresFalse");
        char[] lettres = {'c', 'n', 'j', 'o', 'c'};
        String mot = "abc";
        boolean expResult = false;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.vérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresDernier() {
        System.out.println("testVérifierLettresDernier");
        char[] lettres = {'d', 'r', 'n', 'j', 'o', 'e', 'r'};
        String mot = "def";
        boolean expResult = false;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.vérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresRepetitionTrue() {
        System.out.println("testVérifierLettresRepetitionTrue");
        char[] lettres = {'b', 's', 'n', 'j', 'o', 'u', 'r', 'o'};
        String mot = "bonjour";
        boolean expResult = true;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.vérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresRepetitionFalse() {
        System.out.println("testVérifierLettresRepetitionFalse");
        char[] lettres = {'b', 'o', 'r', 'j', 's', 'u', 'n'};
        String mot = "bonjour";
        boolean expResult = false;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.vérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testVérifierLettresTouteLesLettres() {
        System.out.println("testVérifierLettresTouteLesLettres");
        char[] lettres = {'b', 'o', 'n', 'j', 'o', 'u', 'r'};
        String mot = "bonjour";
        boolean expResult = true;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.vérifierLettres(lettres, mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testDansDictionnaireNull() {
        System.out.println("testDansDictionnaireNull");
        String mot = null;
        Le_Mot_Le_Plus_Long_Bonus.dansDictionnaire(mot);
    }

    @Test
    public void testDansDictionnaireVide() {
        System.out.println("testDansDictionnaireVide");
        String mot = "";
        boolean expResult = false;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.dansDictionnaire(mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testDansDictionnairePremier() {
        System.out.println("testDansDictionnairePremier");
        String mot = "AA";
        boolean expResult = true;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.dansDictionnaire(mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testDansDictionnaireDernier() {
        System.out.println("testDansDictionnaireDernier");
        String mot = "ZYTHUMS";
        boolean expResult = true;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.dansDictionnaire(mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testDansDictionnaireHasard() {
        System.out.println("testDansDictionnaireHasard");
        String mot = "TRANSAT";
        boolean expResult = true;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.dansDictionnaire(mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testDansDictionnaireFalse() {
        System.out.println("testDansDictionnaireFalse");
        String mot = "aaabhdvwdvdw";
        boolean expResult = false;
        boolean result = Le_Mot_Le_Plus_Long_Bonus.dansDictionnaire(mot);
        assertEquals(expResult, result);
    }

    @Test
    public void testMeilleurMotNull() {
        System.out.println("testMeilleurMotNull");
        char[] lettres = null;
        Le_Mot_Le_Plus_Long_Bonus.meilleurMot(lettres);
    }

    @Test
    public void testMeilleurMotVide() {
        System.out.println("testMeilleurMotVide");
        char[] lettres = {};
        String expResult = "";
        String[] result = Le_Mot_Le_Plus_Long_Bonus.meilleurMot(lettres);
        assertEquals(expResult, result);
    }

    @Test
    public void testMeilleurMotPlusieurs() {
        System.out.println("testMeilleurMotPlusieurs");
        //char[] lettres = {'T', 'I', 'A', 'T', 'C', 'C', 'I', 'T', 'E'};
        String expResult = "CITAIT";
        //String result = Le_Mot_Le_Plus_Long_Bonus.meilleurMot(lettres);
        //assertEquals(expResult, result);
    }

    @Test
    public void testMeilleurMotAucun() {
        System.out.println("testMeilleurMotAucun");
        //char[] lettres = {'i', 'o', 'r', 'e', 'i', 'n'};
        String expResult = "IRONIE";
        //String result = Le_Mot_Le_Plus_Long_Bonus.meilleurMot(lettres);
        //assertEquals(expResult, result);
    }

    @Test
    public void testMeilleursMotsNull() {
        System.out.println("testMeilleursMotsNull");
        char[] lettres = null;
        Le_Mot_Le_Plus_Long_Bonus.meilleursMots(lettres);
    }

    @Test
    public void testMeilleursMotsVide() {
        System.out.println("testMeilleursMotsVide");
        char[] lettres = {};
        String[] expResult = {};
        String result = Le_Mot_Le_Plus_Long_Bonus.meilleursMots(lettres);
        //Assert.assertArrayEquals(expResult, result);
    }

    @Test
    public void testMeilleursMotsUnSeul() {
        System.out.println("testMeilleursMotsUnSeul");
        char[] lettres = {'c', 'u', 'c', 'a', 'e', 'i', 'l'};
        String[] expResult = {"ACCUEIL"};
        String result = Le_Mot_Le_Plus_Long_Bonus.meilleursMots(lettres);
        //Assert.assertArrayEquals(expResult, result);
    }

    @Test
    public void testMeilleursMotsPlusieurs() {
        System.out.println("testMeilleursMotsPlusieurs");
        char[] lettres = {'a', 'u', 'e', 'b'};
        String[] expResult = {"AUBE", "BEAU"};
        String result = Le_Mot_Le_Plus_Long_Bonus.meilleursMots(lettres);
        //Assert.assertArrayEquals(expResult, result);
    }

    @Test
    public void testMeilleursMotsAucun() {
        System.out.println("testMeilleursMotsAucun");
        char[] lettres = {'z', 'z'};
        String[] expResult = {};
        String result = Le_Mot_Le_Plus_Long_Bonus.meilleursMots(lettres);
        //Assert.assertArrayEquals(expResult, result);
    }

    @Test
    public void testCalculFrequenceNull() {
        System.out.println("testCalculFrequenceNull");
        int[] occurences = null;
        double[] expResult = null;
        double[] result = Le_Mot_Le_Plus_Long_Bonus.calculFrequence(occurences);
        assertArrayEquals(expResult, result, 0);
    }

    @Test
    public void testCalculFrequenceVide() {
        System.out.println("testCalculFrequenceVide");
        int[] occurences = {};
        double[] expResult = {};
        double[] result = Le_Mot_Le_Plus_Long_Bonus.calculFrequence(occurences);
        assertArrayEquals(expResult, result, 0);
    }

    @Test
    public void testCalculFrequenceUnique() {
        System.out.println("testCalculFrequenceUnique");
        int[] occurences = {10};
        double[] expResult = {1};
        double[] result = Le_Mot_Le_Plus_Long_Bonus.calculFrequence(occurences);
        assertArrayEquals(expResult, result, 0);
    }

    @Test
    public void testCalculFrequencePlusieurs() {
        System.out.println("testCalculFrequencePlusieurs");
        int[] occurences = {2, 6, 3, 4, 5};
        double[] expResult = {0.1, 0.4, 0.55, 0.75, 1};
        double[] result = Le_Mot_Le_Plus_Long_Bonus.calculFrequence(occurences);
        assertArrayEquals(expResult, result, 0);
    }

    @Test
    public void testTirageFrequentielNull() {
        System.out.println("testTirageFrequentielNull");
        double[] frequences = null;
        double nombre = 0.0;
        int expResult = 0;
        int result = Le_Mot_Le_Plus_Long_Bonus.tirageFrequentiel(frequences, nombre);
        assertEquals(expResult, result);
    }

    @Test
    public void testTirageFrequentielVide() {
        System.out.println("testTirageFrequentielVide");
        double[] frequences = {};
        double nombre = 0.0;
        Le_Mot_Le_Plus_Long_Bonus.tirageFrequentiel(frequences, nombre);
    }

    @Test
    public void testTirageFrequentielPremier() {
        System.out.println("testTirageFrequentielPremier");
        double[] frequences = {1, 5, 7, 10};
        double nombre = 0.9;
        int expResult = 0;
        int result = Le_Mot_Le_Plus_Long_Bonus.tirageFrequentiel(frequences, nombre);
        assertEquals(expResult, result);
    }

    @Test
    public void testTirageFrequentielDernier() {
        System.out.println("testTirageFrequentielDernier");
        double[] frequences = {1, 5, 7};
        double nombre = 7;
        int expResult = 2;
        int result = Le_Mot_Le_Plus_Long_Bonus.tirageFrequentiel(frequences, nombre);
        assertEquals(expResult, result);
    }

    @Test
    public void testTirageFrequentielMilieu() {
        System.out.println("testTirageFrequentielMilieu");
        double[] frequences = {1, 5, 7, 10, 15};
        double nombre = 7.8;
        int expResult = 3;
        int result = Le_Mot_Le_Plus_Long_Bonus.tirageFrequentiel(frequences, nombre);
        assertEquals(expResult, result);
    }
}
