package Chapitre4;

import java.util.List;

/**
 *
 * @author alecw
 */
public class RuptureNiv2 {

    public void RuptureNiveau2(List<Etudiant> etudiants) {
        String saveOption;
        int saveAnnéeNaissance;
        int cptEtudiantsAnnéeOption = 0;
        int i = 0;
        while (i < etudiants.size()) {
            saveOption = etudiants.get(i).getOption();
            while (i < etudiants.size() && etudiants.get(i).getOption().equals(saveOption)) {
                saveAnnéeNaissance = 0;
                while (i < etudiants.size() && etudiants.get(i).getOption().equals(saveOption)
                        && etudiants.get(i).getDateNaissance() == saveAnnéeNaissance) {
                    cptEtudiantsAnnéeOption++;
                    i++;
                }
                System.out.println(cptEtudiantsAnnéeOption + "étudiant(s) dans l'option" + saveOption + "sont nés en " + saveAnnéeNaissance);
            }
        }
    }
}
