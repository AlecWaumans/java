package reglementdecompte.view;

import reglementdecompte.model.Board;
import reglementdecompte.model.Model;

/**
 *
 * @author alecw
 */
public class TextView implements View {

    private Model model;

    public TextView(Model model) {
        this.model = model;
    }

    /**
     * displays a title and a welcome message to players.
     */
    @Override
    public void displayTitle() {
        System.out.println("                                   ***Reglement de compte***");
        System.out.println("                       Hello and welcome to our reglement de compte game!! ");
        System.out.println();
    }

    /**
     * displays the game board.See the important note about this below.
     *
     */
    @Override
    public void displayBoard() {
        System.out.println("   ---------------------------------------------------------------------------------");

        for (int lg = 0; lg < Board.BOARD_SIZE; lg++) {
            System.out.print(15 - lg);
            System.out.print("  |");
            for (int col = 0; col < Board.BOARD_SIZE; col++) {
                Position pos = new Position(lg, col);s
                if (model.getPiece(pos) == null) {
                    System.out.print("         |");
                } else {
                    System.out.print("" + model.getPiece(pos) + "|");
                }

                if (col == 7) {
                    System.out.println();
                    System.out.print("   ---------------------------------------------------------------------------------");

                }

            }
            System.out.println();
        }
        System.out.println();
        System.out.print("       ");
        for (int i = 0; i < 8; i++) {
            System.out.print(LettreColonne(i));
            System.out.print("         ");
        }
        System.out.println();
        System.out.println();
    }

    /**
     * shows the winning player.
     */
    @Override
    public void displayWinner() {
        System.out.println("And the winner is " + model.getCurrentPlayer());
    }

    /**
     * displays a message inviting the current player (white or black) to play,
     */
    @Override
    public void displayPlayer() {
        System.out.println("It's your turn to play " + model.getCurrentPlayer());
    }

    /**
     * displays the error message passed in parameter.
     *
     * @param message The error message in question which is a sentence.
     */
    @Override
    public void displayError(String message) {
        System.out.println(message);
    }

}
