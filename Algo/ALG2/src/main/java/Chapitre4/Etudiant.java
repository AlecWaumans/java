package Chapitre4;

/**
 *
 * @author alecw
 */
public class Etudiant {

    private int Matricule;
    private String Nom;
    private String Prénom;
    private int DateNaissance;
    private String Option;

    public Etudiant(int matricule, String nom, String prénom, int dateNaissance, String option) {
        this.Matricule = matricule;
        this.Nom = nom;
        this.Prénom = prénom;
        this.DateNaissance = dateNaissance;
        this.Option = option;
    }

    public int getMatricule() {
        return this.Matricule;
    }

    public String getNom() {
        return this.Nom;
    }

    public String getPrénom() {
        return this.Prénom;
    }

    public int getDateNaissance() {
        return this.DateNaissance;
    }

    public String getOption() {
        return this.Option;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "Matricule=" + Matricule + ", Nom=" + Nom + ", Prénom=" + Prénom + ", DateNaissance=" + DateNaissance + ", Option=" + Option + '}';
    }

}
