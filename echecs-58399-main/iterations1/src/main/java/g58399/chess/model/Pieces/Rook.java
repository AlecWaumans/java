package g58399.chess.model.Pieces;

import g58399.chess.model.Board;
import g58399.chess.model.Color;
import g58399.chess.model.Direction;
import g58399.chess.model.Position;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Rook extends Piece {

    /**
     * Allows you to instantiate a piece of Rook type.
     *
     * @param color with a given colour.
     */
    public Rook(Color color) {
        super(color);
    }

    /**
     * See piece for the javadoc of this method.
     */

    @Override
    public List<Position> getPossibleMoves(Position position, Board board) {
        return super.getPossibleMovesLongueDistance(position, board, getDirectionGetPossibleMovesRook());
    }

    /**
     *
     * @return The list of directions the Rook can take.
     */
    private List<Direction> getDirectionGetPossibleMovesRook() {
        List<Direction> oriantation = new ArrayList();
        oriantation.add(Direction.N);
        oriantation.add(Direction.S);
        oriantation.add(Direction.E);
        oriantation.add(Direction.W);
        return oriantation;
    }

    @Override
    public String toString() {
        return (getColor() == Color.BLACK) ? "  RookB  " : "  RookW  ";
    }
}
