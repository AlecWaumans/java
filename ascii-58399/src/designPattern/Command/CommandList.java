package designPattern.Command;

import view.Command;
import view.Shape;

import java.util.List;

public class CommandList implements Command {
    private List<Shape> shapes;

    public CommandList(List<Shape> shapes){
        this.shapes = shapes;
    }

    @Override
    public void execute() {
        System.out.println("List shape : ");
        int i = 1;
        for(Shape shape : this.shapes){
            System.out.print(i +":");
            System.out.println(shape.toString());
            i++;
        }
    }

    @Override
    public void unexecute() {

    }
}
