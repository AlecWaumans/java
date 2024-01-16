package Chapitre4;

import java.util.List;

/**
 *
 * @author alecw
 */
public class RuptureNiv0 {

    public static void main(String[] args) {

    }

    public static void RuptureNiveau0(List<Etudiant> etudiants) {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    public static void RuptureNiveau0Bis(List<Etudiant> etudiants) {
        int i = 0;
        i = 0;
        while (i < etudiants.size()) {
            etudiants.get(i);
            i++;
        }
    }

}
