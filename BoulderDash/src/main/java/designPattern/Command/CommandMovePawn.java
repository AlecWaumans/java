package designPattern.Command;

import Model.Board;
import Model.Position;
import Model.items.Diams;
import Model.items.Pawn;

import java.util.List;

public class CommandMovePawn implements Command {
    private Position startPos;
    private Position endpos;
    private Pawn pawn;
    private Board board;
    private List<Diams> diamsList;
    private List<Diams> diamsListRecup;


    public CommandMovePawn(Position startPos, Position endpos, Pawn pawn, Board board, List<Diams> diamsList, List<Diams> diamsListRecup){
        this.startPos = startPos;
        this.endpos = endpos;
        this.pawn = pawn;
        this.diamsList = diamsList;
        this.board = board;
        this.diamsListRecup = diamsListRecup;
    }
    @Override
    public void execute() {
        this.pawn.movePawnPosition(this.startPos,this.endpos, this.board,this.diamsList, this.diamsListRecup);
    }

    @Override
    public void unexecute() {
        if(this.endpos != null) {
            this.pawn.movePawnPosition(this.endpos, this.startPos, this.board, this.diamsList, this.diamsListRecup);
        }
    }
}
