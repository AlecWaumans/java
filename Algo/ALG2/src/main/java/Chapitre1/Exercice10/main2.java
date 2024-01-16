package Chapitre1.Exercice10;

import Chapitre1.Exercice10.RendezVous;
import Chapitre1.Exercice10.Date1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class main2 {

    public static void main(String[] args) {
        List<RendezVous> maListe = new ArrayList();
        Date1 date1 = new Date1(1, 11, 1999);
        Date1 date2 = new Date1(2, 11, 1999);
        Date1 date3 = new Date1(3, 11, 1999);

        Date1 date4 = new Date1(25, 04, 2022);
        Date1 date5 = new Date1(26, 04, 2022);

        RendezVous rdv1 = new RendezVous(date1, "toux");
        RendezVous rdv2 = new RendezVous(date2, "toux");
        RendezVous rdv3 = new RendezVous(date3, "toux");
        RendezVous rdv4 = new RendezVous(date4, "toux");
        RendezVous rdv5 = new RendezVous(date5, "toux");

        maListe.add(rdv1);
        maListe.add(rdv2);
        maListe.add(rdv3);
        maListe.add(rdv4);
        maListe.add(rdv5);

        Date1 adj = Date1.Aujourdhui();
        System.out.println(adj);
        System.out.println("planning " + maListe);
        System.out.println();

        for (int i = 0; i < maListe.size() - 1; i++) {
            if (adj.getAnnée() > maListe.get(i).getDate().getAnnée()) {
                maListe.remove(i);
            }
            if (adj.getAnnée() == maListe.get(i).getDate().getAnnée() && adj.getMois() > maListe.get(i).getDate().getMois()) {
                maListe.remove(i);
            }
            if (adj.getAnnée() == maListe.get(i).getDate().getAnnée() && adj.getMois() == maListe.get(i).getDate().getMois()
                    && adj.getJours() > maListe.get(i).getDate().getJours()) {
                maListe.remove(i);
            }
        }
        System.out.println("planning " + maListe);
    }

}
