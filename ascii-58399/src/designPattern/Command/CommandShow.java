package designPattern.Command;

import model.Drawing;
import model.Point;
import view.Command;
import view.Shape;

public class CommandShow implements Command {
    private Drawing drawing;

    public CommandShow(Drawing drawing){
        this.drawing = drawing;
    }

    @Override
    public void execute() {
        for (int i = 0; i <= drawing.getHeight(); i++) {
            for (int j = 0; j <= drawing.getWidth(); j++) {
                Point point = new Point(i, j);
                if (j == drawing.getWidth()) {
                    System.out.println();
                }
                if (drawing.getShapeAt(point) != null) {
                    Shape shape = drawing.getShapeAt(point);
                    System.out.print(shape.getColor());
                }
                System.out.print("   ");
            }
        }
    }

    @Override
    public void unexecute() {
        System.out.println();
    }
}
