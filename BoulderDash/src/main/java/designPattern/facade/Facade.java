package designPattern.facade;

import Model.Game;
import Model.GameState;
import Model.Position;
import designPattern.Command.Command;
import designPattern.Command.CommandManages;

import java.util.Stack;

public class Facade {
    public Facade(){

    }

    /**
     * @return A command manager he’s gonna create.
     */
    private CommandManages createCommandManages(){
        Stack<Command> undo = new Stack<Command>();
        Stack<Command> redo = new Stack<Command>();

        CommandManages manages = new CommandManages(undo, redo);
        return manages;
    }

    /**
     * @return a games he created with an initialization of the command manager.
     */
    private Game createGame(CommandManages manages){
        return new Game(manages);
    }

    /**
     * This method will start a game.
     * @param choiceLevel is difficult level
     */

    public void startGame(int choiceLevel){
        Game game = createGame(createCommandManages());
        game.start(choiceLevel);
    }

    /**
     * The method that will verify whether the game is finished or not.
     * @return true if the game is finished otherwise false.
     */
    public boolean isEndGame(Game game){
        if(game.getState().equals(GameState.LOSE)){
            return true;
        }
        if(game.getState().equals(GameState.WIN)){
            return true;
        }
        return false;
    }

    /**
     * This method will allow us to play a shot so to move our player or other command
     * Like leaving the game.
     * @param manages as well as the initial command manajeur.
     * @param commande enter by user
     */
    public void jouerUnCoup(Game game,CommandManages manages, String commande){
        commande.toLowerCase();
        char LetterCommande = commande.charAt(0);
        if(isCommand(LetterCommande)) {
            game.updateRocksDiams();
            switch (LetterCommande) {
                case 'd' -> {

                    Position startPos = game.getPawnPlayer();
                    Position endPos = new Position(startPos.getRow(), startPos.getColumn() + 1);
                    game.CommandMovePawn(startPos, endPos);

                }
                case 'q' -> {

                    Position startPos = game.getPawnPlayer();
                    Position endPos = new Position(startPos.getRow(), startPos.getColumn() - 1);
                    game.CommandMovePawn(startPos, endPos);

                }
                case 'z' -> {

                    Position startPos = game.getPawnPlayer();
                    Position endPos = new Position(startPos.getRow() - 1, startPos.getColumn());
                    game.CommandMovePawn(startPos, endPos);

                }
                case 's' -> {

                    Position startPos = game.getPawnPlayer();
                    Position endPos = new Position(startPos.getRow() + 1, startPos.getColumn());
                    game.CommandMovePawn(startPos, endPos);
                }
                // if you will cancel game
                case 'x' -> {
                    System.exit(0);
                }

                case 'h' -> {
                    game.helps();
                }
                case 'u' -> {
                    manages.undo();
                }
                case 'r' -> {
                    manages.redo();
                }
            }
            game.updateState();
        }
    }

    /**
     * @param letterCommande the command the user used.
     * @return rue if it corresponds to a command if not false
     */
    public boolean isCommand(char letterCommande) {
        return !(letterCommande == 'd')
                && !(letterCommande == 'q')
                && !(letterCommande == 'z')
                && !(letterCommande == 's')
                && !(letterCommande == 'h')
                && !(letterCommande == 'a')
                && !(letterCommande == 'e')
                && !(letterCommande == 'x')
                && !(letterCommande == 'u')
                && !(letterCommande == 'r');
    }
}
