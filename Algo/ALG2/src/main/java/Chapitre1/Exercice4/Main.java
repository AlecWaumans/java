package Chapitre1.Exercice4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Main {
    
    public static void main(String[] args) {
        List<Personne> maListe = new ArrayList();
        Personne personne1 = new Personne(2);
        Personne personne2 = new Personne(5);
        Personne personne3 = new Personne(6);
        Personne personne4 = new Personne(11);
        Personne personne5 = new Personne(4);
        Personne personne6 = new Personne(2);
        Personne personne7 = new Personne(12);
        
        maListe.add(personne1);
        maListe.add(personne2);
        maListe.add(personne3);
        maListe.add(personne4);
        maListe.add(personne5);
        maListe.add(personne6);
        maListe.add(personne7);
        
        System.out.println(maListe);
        System.out.println(getPersMois(2, maListe));
        
    }
    
    public static List<Personne> getPersMois(int mois, List<Personne> personne) {
        List<Personne> ListePersNéeDuMois = new ArrayList();
        for (int i = 0; i < personne.size(); i++) {
            if (personne.get(i).getMoisDeNaissance() == mois) {
                ListePersNéeDuMois.add(personne.get(i));
            }
        }
        return ListePersNéeDuMois;
        
    }
}
