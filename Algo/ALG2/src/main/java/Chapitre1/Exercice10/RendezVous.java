package Chapitre1.Exercice10;

import Chapitre1.Exercice10.Date1;
import java.util.List;

/**
 *
 * @author alecw
 */
public class RendezVous {

    private Date1 date;
    private String motif;

    public RendezVous(Date1 date, String motif) {
        this.date = date;
        this.motif = motif;
    }

    public Date1 getDate() {
        return this.date;
    }

    public String getMotif() {
        return this.motif;
    }

    @Override
    public String toString() {
        return "RendezVous{" + "date=" + date + ", motif=" + motif + '}';
    }

}
