package g58399.chess.main;

import g58399.chess.controller.Controller;
import g58399.chess.model.Game;
import g58399.chess.model.Model;
import g58399.chess.view.TextView;

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
