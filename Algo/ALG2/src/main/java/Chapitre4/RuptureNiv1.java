package Chapitre4;

import java.util.List;

/**
 *
 * @author alecw
 */
public class RuptureNiv1 {

    public static void main(String[] args) {

    }

    public static void RuptureNiveau1(List<Etudiant> etudiants) {
        //creer une arrayList des otpions 
        // on suppose les données classées en majeur sur l’option
        for (Etudiant etudiant : etudiants) {
            int cptEtudiantsOption = 0;
        }
    }

    public static void RuptureNiveau1Bis(List<Etudiant> etudiants) {
        String saveOption = "";
        int cptEtudiantsOption = 0;
        int i = 0;  // En vert ce qui est lié au niveau 0
        while (i < etudiants.size()) {
            saveOption = etudiants.get(i).getOption();
            cptEtudiantsOption = 0;
            while (i < etudiants.size() && etudiants.get(i).getOption().equals(saveOption)) {
                cptEtudiantsOption++;
                i++;
            }
            System.out.println(cptEtudiantsOption + "étudiant dans l'option " + saveOption);
        }
    }
}
