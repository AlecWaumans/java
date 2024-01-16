package reglementdecompte.main;

import reglementdecompte.controller.Controller;
import reglementdecompte.model.Game;
import reglementdecompte.model.Model;
import reglementdecompte.view.TextView;

/**
 *
 * @author alecw
 */
public class main {

    /**
     * Start the chess game.
     *
     * @param args
     */
    public static void main(String[] args) {
        Model game = new Game();
        Controller controller = new Controller(game, new TextView(game));
        controller.play();
    }
}
