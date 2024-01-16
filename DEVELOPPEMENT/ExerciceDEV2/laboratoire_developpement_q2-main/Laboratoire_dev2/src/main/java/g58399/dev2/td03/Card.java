package g58399.dev2.td03;

/**
 * implémentation d'une carte à jouer pour le jeux Memory
 *
 * @author alecw
 */
public class Card {

    private boolean hidden; //prend la valeur vrai si la carte est cachée et faux dans le cas contraire
    private int value; //  représente la valeur de la carte

    /**
     * Ceci est le constructeur qui va nous permettre de les instanciers.
     *
     * @param value c'est l'attribut de la classe card qui est la valeur de
     * celle-ci;
     * @param hidden c'est l'attribut de la classe card qui va dire si = true la
     * carte est caché si false elle est révélée a l'utilisateur.
     */
    public Card(int value, boolean hidden) {
        if (this.value < 0) {
            throw new IllegalArgumentException("Cette carte comporte un attribut bizzare");
        }
        this.hidden = hidden;
        this.value = value;

    }

    /**
     * Constructeur qui implemente une carte cachée par défaut.
     *
     * @param value de la carte.
     */
    public Card(int value) {
        this(value, true);
    }

    /**
     * accesseur qui va faire en sorte que la valeur est accessible dans les
     * autres classes grace a l'appelle de cette methode.
     *
     * @return retourne la valeur de la carte.
     */
    public int getvalue() {
        return this.value;
    }

    /**
     * accesseur qui va faire en sorte de savoir si elle est face caché ou pas
     * et qui rend cette information est accessible dans les autres classes
     * grace a l'appelle de cette methode.
     *
     * @return une valeur booleenne qui dit si la carte est face caché ou non.
     */
    public boolean isHidden() {
        return this.hidden;
    }

    /**
     * c'est un setter qui va modifier l'attribut hidden et va revele la carte
     * du coup.
     */
    public void reveal() {
        if (this.hidden) {
            this.hidden = false;
        }
    }

    /**
     * Cette methode va retourner une chaine de cartère pour revélé la valeur ou
     * un ? celon si la carte est face caché ou non.
     *
     * @return va afficher ? si la carte est sensé etre true donc caché si non
     * il retourne sa valeur.
     */
    @Override
    public String toString() {
        if (this.hidden) {
            return "?";
        } else {    
            return "" + this.value;
        }
    }

    /**
     * crée le hash code lié à la carte.
     *
     * @return Un hash code.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.hidden ? 1 : 0);
        hash = 41 * hash + this.value;
        return hash;
    }

    /**
     * Cette methode va verifier si les deux objects sont tout les deux les
     * mêmes en tout point.F
     *
     * @param obj oject que l'ont veut comparée
     * @return une valeur boolean si sont pas les mêmes retourne false dans le
     * cas contraire true.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        if (this.hidden != other.hidden) {
            return false;
        }
        return this.value == other.value;
    }

}
