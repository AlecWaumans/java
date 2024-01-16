/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.dev1.td10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alecw
 */
public class CercleTest {

    /**
     * Test de la méthode périmètre avec le lancement d'un exception.
     */
    @Test
    public void périmètre_rayonNégatif_IAExceptuon() {
        assertThrows(IllegalArgumentException.class, () -> Cercle.périmètre(-5));
    }

}
