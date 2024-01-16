package Model.items;

import Model.Board;
import Model.Color;
import Model.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class Items {
    private Color color;
    public Items(Color color){
        this.color = color;

    }
    public Color getColor() {
        return color;
    }
    /**
     * @param position from which we will calculate all the positions that the item can move.
     * @param board the board of the game.
     * @return all the positions the item can do.
     */
    public abstract List<Position> getPossibleMoves(Position position, Board board);

}
