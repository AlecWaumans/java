package g58399.dev2.td02;

/**
 * Dans cette class nous allons definir les attributs de celle-ci ET lui ajouter
 * des valeurs d'attribut afin de pouvoir voir en tout temps Dans le main quel
 * est la valeurs de chaque attribut de notre object.
 *
 * @author alecw
 */
public class Moment {

    private int heure;// c'est l'attribut qui va correspondre aux heures.
    private int minute;// c'est l'attribut qui va correspondre aux minutes.
    private int seconde;// c'est l'attribut qui va correspondre aux secondes.

    /**
     * La classe public ici est le constructeur de la class moment
     *
     * @param heure correspond aux heures de la classe moment.
     * @param minute correspond aux minutes de la classe moment.
     * @param seconde correspond aux secondes de la classe moment.
     */
    public Moment(int heure, int minute, int seconde) {
        this.heure = heure;
        this.minute = minute;
        this.seconde = seconde;

    }

    /**
     * ici on a crée un deuxieme constructeur dont on definit les attributs a
     * l'avance.
     */
    public Moment() {
        this.heure = 00;
        this.minute = 00;
        this.seconde = 00;
    }

    /**
     * accesseur qui va nous permettre d'atteindre l'attribut heure.
     *
     * @return the value of the hour
     */
    public int getheure() {
        if (heure > 23 && heure < 0) {
            throw new IllegalArgumentException("La valeurs entrer dans les heures sont incorrecte");
        }
        return heure;
    }

    /**
     * accesseur qui va nous permettre d'atteindre l'attribut minute.
     *
     * @return value of the minutes
     */
    public int getminute() {
        if (minute < 0 && minute > 59) {
            throw new IllegalArgumentException("La valeurs entrer dans les minutes sont incorrecte");
        }
        return minute;
    }

    /**
     * accesseur qui va nous permettre d'atteindre l'attribut seconde.
     *
     * @return value of seconds
     */
    public int getseconde() {
        if (seconde < 0 && seconde > 59) {
            throw new IllegalArgumentException("La valeurs entrer dans les secondes sont incorrecte");
        }
        return seconde;
    }

    /**
     * va retourner une chaine de carectère avec les attributs pour former heure
     * : minute : seconde. en ajoutant la methode tostring quand on imprime
     * moment1 ils sont bien afficher mais reste toujours privé.
     *
     * @return heure : minute : seconde
     */
    @Override // Cette classe est override car la methode to string est une methode deja presente dans ma classe object
    public String toString() {
        return getheure() + " : " + getminute() + " : " + getseconde();
    }

    /**
     * Cette methode va verifier si les deux objects selectionnée on les même
     * attribut.
     *
     * @param other les objects qu'on veut comparée.
     * @return true si les deux objects ont les même attributs.
     */
    public boolean equals(Moment other) {
        boolean equals = false;
        if (getheure() == heure && getminute() == minute && getseconde() == seconde) {
            equals = true;
        }
        return equals;
    }

    /**
     * cette methode va calculer l'object moment en seconde.
     *
     * @return la valeur de l'object moment en seconde.
     */
    public int toSeconds() {
        return heure * 60 * 60 + minute * 60 + seconde;
    }

    /**
     * Cette méthode va comparée deux moments si le premier moment est plus
     * élevé il va retourner 1, -1 si il est en descoud et 0 si il est egal aux
     * deuxiemes moment.
     *
     * @param other les autres moments qui sont comparée;
     * @return un entier, 1 si moment 1 est + élevée que moment2, 0 si égaux, -1
     * si moment1 est inférieur à moment2.
     */
    public int compareTo(Moment other) {
        int value = 0;
        if (toSeconds() == other.toSeconds()) {
            value = 0;
        }
        if (toSeconds() > other.toSeconds()) {
            value = 1;
        }
        if (toSeconds() < other.toSeconds()) {
            value = -1;
        }
        return value;
    }

}
