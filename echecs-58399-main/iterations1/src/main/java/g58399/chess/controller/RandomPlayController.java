package g58399.chess.controller;

import g58399.chess.model.Game;
import g58399.chess.model.GameState;
import g58399.chess.model.Model;
import g58399.chess.model.Move;
import g58399.chess.model.Position;
import g58399.chess.view.View;
import java.util.List;

/**
 *
 * @author alecw
 */
public class RandomPlayController {

    private Model game;
    private View view;

    /**
     * The manufacturer initializes a new controller
     *
     * @param model the interface model of the game
     * @param view the game view interface
     */
    public RandomPlayController(Model model, View view) {
        this.game = model;
        this.view = view;
    }

    public void play() {
        view.displayTitle();
        game.start();

        int i = 1;
        while (game.getState() != GameState.CHECK_MATE || game.getState() != GameState.STALE_MATE || i < 100) {
            do {
                view.displayBoard();
                view.displayPlayer();

                List<Move> moveAllValide = game.getAllValidation();
                Move move = moveAllValide.get(2);

                Position DepartPosition = move.getOrigin();
                Position EndPosition = move.getTarget();
                if (game.isValidMove(DepartPosition, EndPosition)) {
                    game.movePiecePosition(DepartPosition, EndPosition);
                }
            } while (game.getState() == GameState.PLAY);
            if (game.getState() == GameState.CHECK) {
                do {
                    view.displayBoard();
                    view.displayPlayer();
                    view.displayCheck();
                    Position DepartPosition = view.askPosition();
                    Position EndPosition = view.askPosition();
                    if (game.isValidMove(DepartPosition, EndPosition)) {
                        game.movePiecePosition(DepartPosition, EndPosition);
                    }
                } while (game.getState() == GameState.CHECK);

            }
            i++;
        }
        if (game.getState() == GameState.STALE_MATE) {
            view.displayStaleMat();
        }
        if (game.getState() == GameState.CHECK_MATE) {
            view.displayMat();
        }

        view.displayWinner();
    }

}
