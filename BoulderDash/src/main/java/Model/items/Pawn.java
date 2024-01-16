package Model.items;

import Model.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Pawn extends Items {
    private ImageView img;

    public Pawn(Color color) {
        super(color);
        this.img = new ImageView(imagePawn());
    }
    public ImageView getImg(){
        return this.img;
    }
    private Image imagePawn(){
        InputStream is = null;
        try {
            is = Files.newInputStream(Paths.get("ressourcs/image/pawn.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Image(is);
    }


    @Override
    public List<Position> getPossibleMoves(Position position, Board board) {
        List<Position> possibleMoves = new ArrayList();
        if (!board.contains(position)) {
            throw new IllegalArgumentException("The position is outside the board." + position);
        }
        Items items = board.getItems(position);
        Position n = position.next(Direction.S);
        Position w = position.next(Direction.W);
        Position e = position.next(Direction.E);
        Position s = position.next(Direction.N);

        if (items != null) {
            Color itemsColor = items.getColor();
            if (itemsColor == Color.RED) {
                if (board.contains(s)) {
                    if (board.getItems(s) == null) {
                        possibleMoves.add(s);
                    } else if (board.getItems(s).getColor() == Color.BLUE
                            || board.getItems(s).getColor() == Color.GREEN
                            || board.getItems(s).getColor() == Color.WHITE) {
                        //if the positon S is not null, but it is either from earth a diamond or an output it can go on.
                        possibleMoves.add(s);
                    }
                }
                if (board.contains(n)) {
                    if (board.getItems(n) == null) {
                        possibleMoves.add(n);
                    } else if (board.getItems(n).getColor() == Color.BLUE
                            || board.getItems(n).getColor() == Color.GREEN
                            || board.getItems(n).getColor() == Color.WHITE) {
                        //idem S.
                        possibleMoves.add(n);
                    }
                }
                if (board.contains(e)) {
                    if (board.getItems(e) == null) {
                        possibleMoves.add(e);
                    } else if (board.getItems(e).getColor() == Color.BLUE
                            || board.getItems(e).getColor() == Color.GREEN
                            || board.getItems(e).getColor() == Color.WHITE) {
                        //idem S.
                        possibleMoves.add(e);
                    }
                }
                if (board.contains(w)) {
                    if (board.getItems(w) == null) {
                        possibleMoves.add(w);
                    } else if (board.getItems(w).getColor() == Color.BLUE
                            || board.getItems(w).getColor() == Color.GREEN
                            || board.getItems(w).getColor() == Color.WHITE) {
                        //idem S.
                        possibleMoves.add(w);
                    }
                }
            }
        }
        return possibleMoves;


    }

    /**
     * This method will move the player.
     *
     * @param oldPos    pos of pawn
     * @param newPos    the new position he wants to go.
     * @param board     the game board.
     * @param diamsList The list of diamonds in the game.
     */
    public void movePawnPosition(Position oldPos, Position newPos, Board board, List<Diams> diamsList, List<Diams> diamsListRecup) {
        if (!board.contains(oldPos)) {
            throw new IllegalArgumentException("The position is outside the board. " + oldPos);
        }
        if (!board.contains(newPos)) {
            throw new IllegalArgumentException("The position is outside the board. " + newPos);
        }
        if (board.getItems(oldPos) == null) {
            throw new IllegalArgumentException("There is no pawn here " + oldPos);
        }
        if (Color.RED != board.getItems(oldPos).getColor()) {
            throw new IllegalArgumentException("this items can't move !!  " + board.getItems(oldPos));
        }
        /**
         * here when there will be a one-day move if on the new position
         * there is an item of green color he removes it. But if
         * there is a blue item he removes, but he removes it from the list of diamonds.
         */
        Items actualPawn = board.getItems(oldPos);
        if (board.getItems(newPos) != null) {
            if (board.getItems(newPos).getColor() == Color.GREEN) {
                board.dropItems(newPos);
            } else if (board.getItems(newPos).getColor() == Color.BLUE) {
                diamsListRecup.add((Diams) board.getItems(newPos));
                diamsList.remove(board.getItems(newPos));
                board.dropItems(newPos);
            }
        }


        //if newpos is contained in the list of possibilities
        // movement then it makes the movement.
        if (isValideMove(oldPos, newPos, board)) {
            board.setItems(actualPawn, newPos);
            board.dropItems(oldPos);
        }

    }

    public boolean isValideMove(Position oldPos, Position newPos, Board board) {
        List<Position> possibleMoves = board.getItems(oldPos).getPossibleMoves(oldPos, board);
        return possibleMoves.contains(newPos);
    }

    @Override
    public String toString() {
        String RED_BACKGROUND = "\u001B[41m";
        String RESET_BACKGROUND = "\u001B[0m";
        String espace = "  ";
        return RED_BACKGROUND + espace + RESET_BACKGROUND;
    }
}
