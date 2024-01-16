package designPattern.Command;

import model.Drawing;
import view.Command;
import view.Shape;

public class CommandAdd implements Command {
    private Shape shape;
    private Drawing drawing;

    public CommandAdd(Drawing drawing, Shape shape){
        this.shape = shape;
        this.drawing = drawing;
    }

    @Override
    public void execute() {
        this.drawing.addShape(this.shape);
    }

    @Override
    public void unexecute() {
        this.drawing.supShapes(this.drawing.getShapes().indexOf(this.shape));
    }

}
