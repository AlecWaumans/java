package designPattern.Command;

import model.Drawing;
import view.Command;
import view.Shape;

import java.util.List;

public class CommandSup implements Command {

    private int numShape;

    private List<Shape> shapes;

    private Shape shape;

    public CommandSup(List<Shape> listShapes, int numShape, Shape shape){
        this.shapes = listShapes;
        this.numShape = numShape;
        this.shape = shape;
    }

    @Override
    public void execute() {
        this.shapes.remove(this.numShape);
    }

    @Override
    public void unexecute() {
        this.shapes.add(this.numShape, this.shape);
    }
}
