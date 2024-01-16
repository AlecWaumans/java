package g58399.chess.main;

import g58399.chess.controller.RandomPlayController;
import g58399.chess.model.Game;
import g58399.chess.model.Model;
import g58399.chess.view.TextView;

/**
 *
 * @author alecw
 */
public class mainDefense {

    /**
     * Ici on peut demarrer le programe c'est la methode principal qui va lancer
     * tout.
     *
     * @param args
     */
    public static void main(String[] args) {
        Model game = new Game();
        RandomPlayController controller = new RandomPlayController(game, new TextView(game));
        controller.play();
    }
    
}
