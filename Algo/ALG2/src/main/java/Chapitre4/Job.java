package Chapitre4;

/**
 *
 * @author alecw
 */
public class Job {

    private String login;
    private int date;
    private int nombre;

    public Job(String Login, int Date, int Nombre) {
        this.date = Date;
        this.login = Login;
        this.nombre = Nombre;
    }

    public String getLogin() {
        return this.login;
    }

    public int getDate() {
        return this.date;
    }

    public int getNombre() {
        return this.nombre;
    }
}
