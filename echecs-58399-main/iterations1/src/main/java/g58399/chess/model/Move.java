package g58399.chess.model;

/**
 *
 * @author alecw
 */
public class Move {

    private Position origin;//une position de depart
    private Position target;// une position de fin 

    //un constructeur qui va nous permettre de les initialisés.
    public Move(Position origin, Position target) {
        this.origin = origin;
        this.target = target;
    }

    /**
     * @return La position de depart
     */
    public Position getOrigin() {
        return this.origin;
    }

    /**
     * @return La position de fin du mouvement.
     */
    public Position getTarget() {
        return this.target;
    }

    /**
     * @return un string qui est l'affichage de l'object move que l'on va creer.
     */
    @Override
    public String toString() {
        return "Move{" + origin + ", " + target + '}';
    }
}
