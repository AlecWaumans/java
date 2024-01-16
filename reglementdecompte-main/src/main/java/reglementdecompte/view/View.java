package reglementdecompte.view;

/**
 *
 * @author alecw
 */
public interface View {

    /**
     * displays a title and a welcome message to players.
     */
    public void displayTitle();

    /**
     * displays the game board. See the important note about this below.
     *
     */
    public void displayBoard();

    /**
     * shows the winning player.
     */
    public void displayWinner();

    /**
     * displays a message inviting the current player (white or black) to play,
     */
    public void displayPlayer();

    /**
     * displays the error message passed in parameter.
     *
     * @param message The error message in question which is a sentence.
     */
    public void displayError(String message);

}
