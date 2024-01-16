package ExamenJuin2021;

/**
 *
 * @author alecw
 */
public class Commit {

    private int Numero;
    private String groupe;

    public Commit(String groupe, int numero) {
        this.groupe = groupe;
        this.Numero = numero;
    }

    public String getGroupe() {
        return this.groupe;
    }

    @Override
    public String toString() {
        return "commit" + groupe + " Numero " + Numero;
    }
}
