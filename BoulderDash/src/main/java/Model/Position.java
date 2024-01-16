package Model;

import java.util.Objects;

public class Position {
    private int row; //is the attribute that defines the lines.
    private int column; //  is the attribute that defines the columns.

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
    /**
     * accessor that will allow us to retrieve the private row attribute.
     *
     * @return the value of the row attribute.
     */
    public int getRow() {
        return row;
    }

    /**
     * accessor that will allow us to retrieve the private column attribute.
     *
     * @return value of the column attribute.
     */
    public int getColumn() {
        return column;
    }

    /**
     * This method will be used to change the x and y parameters from one position to one direction.
     * @param dir with parameters x and y we want to go.
     * @return the position after moving in the chosen direction.
     */
    public Position next(Direction dir) {
        return new Position(this.row + dir.getDeltaRow(),
                this.column + dir.getDeltaColumn());

    }

    @Override
    public String toString() {
        return "Position{" + row + ", " + column + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position position)) return false;
        return row == position.row && column == position.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }
}
