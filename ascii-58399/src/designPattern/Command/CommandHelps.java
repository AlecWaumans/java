package designPattern.Command;

import view.Command;

public class CommandHelps implements Command {

    public CommandHelps(){

    }

    @Override
    public void execute() {
        System.out.println("****Commands****");
        System.out.println("Show : show drawing");
        System.out.println("Exit : Exit system");
        System.out.println("delete : remove shape selectioned");
        System.out.println("delete : parameter(int numshape)");
        System.out.println("Color: change color of the shape selectioned");
        System.out.println("color : parameter(int numshape, char colorFutur)");
        System.out.println("Move : move the shape");
        System.out.println("Move : parameter(int numShape, int horizontal, int vertical)");
        System.out.println("List : show list of shape in drawing");
        System.out.println("add : add shape");
        System.out.println("If you want to add a shape write the command as below "
                + "starting with the name of shape and these parameters in the correct order.");
        System.out.println("add shape parameter parameter ...");
        System.out.println("circle : parameter (char color, int center x coordinate, int center y coordinate" + ",double radius");
        System.out.println("Rectangle : parameter(int upperleft x coordinate, int upperleft y coordinate," + "double width, double height, char color");
        System.out.println("Square : parameter(int upperleft x coordinate, int upperleft y coordinate," + "double side, char color");
        System.out.println("Line : parameter(int xFistPoint, int yFistPoint,int xSecondPoint, int ySecondPoint, color)");
    }

    @Override
    public void unexecute() {

    }
}
