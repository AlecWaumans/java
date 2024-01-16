package Model;

import Model.items.Exit;
import Model.items.Items;

public class Board {
    private Square[][] board;
    public static final int max_Width = 20;
    public static final int max_height = 58;

    public Board() {
        this.board = new Square[max_Width][max_height]; // creation of a two dimensional table with 8 rows and 8 columns.
        for (int i = 0; i < max_Width; i++) { // go through the table line by line.
            for (int j = 0; j < max_height; j++) { // go through the table column by column.
                this.board[i][j] = new Square(null);// and at each square create an Object square containing no Pieces.
            }
        }
    }

    /**
     * @param pos position chosen to know if it is on the board.
     * @return true if it is on the board and false if not.
     */
    public boolean contains(Position pos) {
        return !(pos.getColumn() < 0
                || pos.getColumn() >= max_height
                || pos.getRow() < 0
                || pos.getRow() >= max_Width);
    }

    /**
     * @param position the position of the item.
     * @return the item that is on the position in the parameter.
     */

    public Items getItems(Position position) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position is outside the board." + position);
        }
        return board[position.getRow()][position.getColumn()].getItems();
    }

    /**
     * @param items that will be put on the set.
     * @param position that will be put on the set.
     */

    public void setItems(Items items, Position position) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position is outside the board." + position);
        }
        board[position.getRow()][position.getColumn()].setItems(items);
    }
    /**
     * @param position on which the item will be removed.
     * This method will retirer l’item of the board.
     */

    public void dropItems(Position position) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position is outside the board." + position);
        }
        board[position.getRow()][position.getColumn()].setItems(null);

    }

    /**
     * @return pos of pawn on the board
     */
    public Position getPawnPosition() {
        Position posItems = new Position(0, 0);
        for (int i = 0; i < max_Width; i++) {
            for (int j = 0; j < max_height; j++) {
                if (this.board[i][j].getItems() != null
                        && this.board[i][j].getItems().getColor().equals(Color.RED)) {
                    posItems = new Position(i, j);
                }
            }
        }
        return posItems;
    }

    /**
     * @return The number of exits on the set technically will never exceed 1.
     * This method will help us to ensure that we do not have more than one exit.
     */
    public int oneExit(){
        int nbreExit = 0;
        for (int i = 0; i < max_Width; i++) {
            for (int j = 0; j < max_height; j++) {
                if (this.board[i][j].getItems() != null
                        && this.board[i][j].getItems().getColor().equals(Color.WHITE)) {
                    nbreExit++;
                }
            }
        }
        return nbreExit;
    }
}
