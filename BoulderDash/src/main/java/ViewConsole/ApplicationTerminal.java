package ViewConsole;

import Model.Board;
import Model.Game;
import Model.Position;
import Model.GameState;
import designPattern.Command.Command;
import designPattern.Command.CommandManages;

import java.util.Scanner;
import java.util.Stack;

public class ApplicationTerminal extends Game {
    /**
     * The manufacturer initializes a new controller
     */
    public ApplicationTerminal() {
    }

    public void start() {
        Stack<Command> undo = new Stack<Command>();
        Stack<Command> redo = new Stack<Command>();

        CommandManages manages = new CommandManages(undo, redo);
        Game game = new Game(manages);

        displayTitle();
        messageInformation();

        game.start(choiceLevel());
        game.setNamePlayer(askNamePlayer());
        while (game.getState() != GameState.WIN && game.getState() != GameState.LOSE) {
            game.updateState();
            game.updateRocksDiams();
            displayBoard(game);
            if (game.getState() == GameState.LOSE) {
                break;
            }
            Scanner clavier = new Scanner(System.in);
            System.out.print(">>> ");
            String commande = clavier.nextLine();
            while (commande.equals("")) {
                notFoundMessage();
                commande = clavier.nextLine();
            }
            commande.toLowerCase();
            char LetterCommande = commande.charAt(0);
            while (isCommand(LetterCommande)) {
                notFoundMessage();
                commande = clavier.nextLine();
                commande.toLowerCase();
                LetterCommande = commande.charAt(0);
            }
            switch (LetterCommande) {
                case 'd' -> {

                    Position startPos = game.getPawnPlayer();
                    Position endPos = new Position(startPos.getRow(), startPos.getColumn() + 1);
                    game.CommandMovePawn(startPos, endPos);
                    game.updateState();

                }
                case 'q' -> {

                    Position startPos = game.getPawnPlayer();
                    Position endPos = new Position(startPos.getRow(), startPos.getColumn() - 1);
                    game.CommandMovePawn(startPos, endPos);
                    game.updateState();

                }
                case 'z' -> {

                    Position startPos = game.getPawnPlayer();
                    Position endPos = new Position(startPos.getRow() - 1, startPos.getColumn());
                    game.CommandMovePawn(startPos, endPos);
                    game.updateState();

                }
                case 's' -> {

                    Position startPos = game.getPawnPlayer();
                    Position endPos = new Position(startPos.getRow() + 1, startPos.getColumn());
                    game.CommandMovePawn(startPos, endPos);
                    game.updateState();
                }
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
            if (game.OneExit() == 0 && game.getState() == GameState.PROGRESS) {
                game.createItemExit();
            }
            if (game.getState().equals(GameState.PLAY)) {
                displayDiamsExit(game);
            }
            if (game.getState().equals(GameState.PROGRESS)) {
                displayMessageExit();
            }

        }
        if (game.getState() == GameState.WIN) {
            displayBoard(game);
            displayWinner(game);
        } else {
            displayLose(game);
        }
    }


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

    /**
     * displays a title and a welcome message to players.
     */
    public void displayTitle() {
        System.out.println("                                   ------Eco Diver-----");
        System.out.println("                       Hello and welcome to our eco Diver game!! ");
        System.out.println();
    }

    /**
     * displays the game board.See the important note about this below.
     */
    public void displayBoard(Game game) {
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        for (int lg = 0; lg < Board.max_Width; lg++) {
            for (int col = 0; col < Board.max_height; col++) {
                Position pos = new Position(lg, col);
                if (game.getItems(pos) == null) {
                    System.out.print("  ");
                } else {
                    System.out.print(game.getItems(pos));
                }
                if (col == 57) {
                    System.out.println();
                }
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

    }

    public void displayWinner(Game game) {
        System.out.println("Congratulation you have win level   ! " + game.getCurrentPlayer().getName());
    }

    public String askNamePlayer() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("What's your name ? ");
        clavier.nextLine();
        return clavier.nextLine();
    }

    public void messageInformation() {
        System.out.println("as you will see information ==> h");
    }

    public void displayDiamsExit(Game game) {
        System.out.println("Diams : " + game.diamsRecup() + " /10" + " for to exit");
    }

    public void displayMessageExit() {
        System.out.println("Find exit !!");
    }

    public void displayLose(Game game) {
        System.out.println("You lose !! " + game.getCurrentPlayer().getName());
    }

    public void notFoundMessage() {
        System.out.println("commands not found try again !");
        System.out.print(">>> ");
    }

    public int choiceLevel() {
        System.out.println("entrez le niveau de difficulté 1 2 3 ? ");
        return getIntFromKeyboard();
    }
    private int getIntFromKeyboard() {
        Scanner clavier = new Scanner(System.in);
        boolean checkKeyboard = clavier.hasNextInt();

        while (checkKeyboard == false) {
            System.out.println("The number entered is not an integer!!!");
            clavier.next();
            checkKeyboard = clavier.hasNextInt();
        }
        return clavier.nextInt();
    }



}
