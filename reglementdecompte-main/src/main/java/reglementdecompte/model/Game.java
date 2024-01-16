package reglementdecompte.model;

import java.util.List;
import reglementdecompte.model.Gangsters.Gangster;

/**
 *
 * @author alecw
 */
public class Game implements Model {

    private Board board;
    private Player Blue;
    private Player Yellow;
    private Player Red;
    private Player Green;
    private Player Orange;
    private Player Mauve;
    private Player currentPlayer;

    public Game() {
        this.Blue = new Player(Color.BLUE);
        this.Yellow = new Player(Color.YELLOW);
        this.Green = new Player(Color.GREEN);
        this.Red = new Player(Color.RED);
        this.Orange = new Player(Color.ORANGE);
        this.Mauve = new Player(Color.MAUVE);
        this.board = new Board();
    }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Gangster getPiece(Position pos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Player getCurrentPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Player getOppositePlayer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isCurrentPlayerPosition(Position pos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void movePiecePosition(Position oldPos, Position newPos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isGameOver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
