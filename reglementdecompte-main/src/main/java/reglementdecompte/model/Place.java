package reglementdecompte.model;

import reglementdecompte.model.Gangsters.Gangster;

/**
 *
 * @author alecw
 */
public class Place {

    private Gangster gangster;

    public Place(Gangster gangster) {
        this.gangster = gangster;
    }

    public Gangster getGangster() {
        return this.gangster;
    }

    public void setGangster(Gangster gangster) {
        this.gangster = gangster;
    }

    public boolean isFree() {
        return this.gangster == null;
    }
}
