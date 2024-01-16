package Chapitre4;

import java.util.List;

/**
 *
 * @author alecw
 */
public class Ex1ChasseGaspi {
    public static void main(String[] args) {
        
    }

    public void afficherGapsilleur(List<Job> impressions, int limite) {
       // Ici, impressions est triée selon le login. je dois afficher tous les utilisateurs 
       //(leur login) dont le nombre total d'impression dépasse limite.
        

        int i = 0;
        while (i < impressions.size()) {
            String login = impressions.get(i).getLogin();
            int cpt = 0;
            while (i < impressions.size() && impressions.get(i).getLogin().equals(login)) {
                cpt += impressions.get(i).getNombre();
                i++;
            }
            if (cpt > limite) {
                System.out.println(login + " " + cpt);
            }
        }
    }
}
