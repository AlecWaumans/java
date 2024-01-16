package g58399.dev2.taquin;

/**
 *
 * @author g58399
 */
public class Puzzle {

    private int[][] board;
    private int nbMoves;

    public Puzzle(int[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = (i + j);
            }
        }
        board[2][2] = -1;
        this.board = board;
        this.nbMoves = nbMoves;
    }

    public int[][] getBoard() {
        return this.board;
    }

    public int getNbMoves() {
        return this.nbMoves;
    }

    public void move(Position position) {
        Position pos = new Position(0, 0);
        pos = findEmptyPosition();
        board[position.getLine()][position.getColumn()] = board[pos.getLine()][pos.getColumn()];
        board[pos.getLine()][pos.getColumn()] = board[position.getLine()][position.getColumn()];
    }

    private Position findEmptyPosition() {
        Position pos = new Position(0, 0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == -1) {
                    return pos = new Position(i, j);
                }
            }
        }
        return pos;
    }

    public boolean isOver() {
        int[][] tab = new int[3][3];
        Puzzle boardOrdonnée = new Puzzle(tab);
        if (this.board == boardOrdonnée.getBoard()) {
            return true;
        } else {
            return false;
        }

    }

}
