package designPattern.Command;

import model.Point;
import view.Command;
import view.Shape;

import java.util.List;

public class CommandMove implements Command {
    private List<Shape> shapes;
    private double horFutur;
    private double verFutur;
    private double horPast;
    private double verPast;
    private int numShape;


    public CommandMove(List<Shape> shapes,double horPast,
                       double verPast, double horFutur,
                            double verFutur,int numShape){
        this.shapes = shapes;
        this.horPast = horPast;
        this.verPast = verPast ;
        this.horFutur = horFutur;
        this.verFutur = verFutur;
        this.numShape = numShape;
    }

    @Override
    public void execute() {
        this.shapes.get(this.numShape).move(this.horFutur, this.verFutur);
    }

    @Override
    public void unexecute() {
        this.shapes.get(this.numShape).move(this.horPast, this.verPast);
    }
}
