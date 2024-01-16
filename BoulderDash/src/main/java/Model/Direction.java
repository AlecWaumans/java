package Model;

public enum Direction {
    N(-1, 0),
    W(0, -1),
    E(0, 1),
    SW(1, -1),
    S(1, 0),
    SE(1, 1);


    private int deltaRow;
    private int deltaColumn;

    Direction(int deltaR, int deltaC){
        this.deltaRow = deltaR;
        this.deltaColumn = deltaC;
    }
    /**
     * accessor that will allow us to retrieve the private attribute deltaRow.
     *
     * @return the value of deltaRow.
     */
    public int getDeltaRow() {
        return deltaRow;
    }

    /**
     * accessor that will allow us to retrieve the private attribute
     * deltaColumn.
     *
     * @return the value of deltaRow.
     */
    public int getDeltaColumn() {
        return deltaColumn;
    }
}
