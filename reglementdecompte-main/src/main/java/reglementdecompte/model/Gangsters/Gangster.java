package reglementdecompte.model.Gangsters;

import reglementdecompte.model.Arme;
import reglementdecompte.model.Color;

/**
 *
 * @author alecw
 */
public abstract class Gangster {

    private Color color; // this attribute will define the color of the ganster
    private Arme arme;

    /**
     * Here the constructor will allow us to initialise the piece with the given
     * colour of gangster.
     *
     * @param color
     * @param arme
     */
    public Gangster(Color color, Arme arme) {
        this.color = color;
        this.arme = arme;
    }

    /**
     *
     * @return color of Gangster
     */
    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Arme getArme() {
        return this.arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }
    

}
