package Chapitre1.Exercice4;

/**
 *
 * @author alecw
 */
public class Personne {

    private int moisDeNaissance;

    public Personne(int moisDeNaissance) {
        this.moisDeNaissance = moisDeNaissance;
    }

    public int getMoisDeNaissance() {
        return this.moisDeNaissance;
    }

    @Override
    public String toString() {
        return "Personne{" + "moisDeNaissance=" + moisDeNaissance + '}';
    }
}
