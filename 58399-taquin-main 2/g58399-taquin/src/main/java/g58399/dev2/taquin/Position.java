package g58399.dev2.taquin;

/**
 *
 * @author g58399
 */
public class Position {
    
    private int line;// Ceci est l'attribut qui va definir la ligne de la position.
    private int column;// Ceci est l'attribut qui va definir la column de la position. 

    public Position(int line, int column) {
        this.line = line;
        this.column = column;
        
    }
    
    public int getLine() {
        return this.line;
    }
    
    public int getColumn() {
        return this.column;
    }
    
    @Override
    public String toString() {
        return getLine() + "," + getColumn();
    }
    
    public boolean isAdjacent(Position position) {
        if (position.getColumn() == position.getColumn() + 1 || position.getColumn() == position.getColumn() - 1 || position.getLine() == position.getLine() + 1 || position.getLine() == position.getLine() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Position pos = new Position(2, 3);
        Position pos2 = new Position(3, 3);
        System.out.println(pos.getColumn());
        System.out.println(pos.getLine());
        System.out.println(pos.toString());
        System.out.println(pos.isAdjacent(pos2));
    }
    
}
