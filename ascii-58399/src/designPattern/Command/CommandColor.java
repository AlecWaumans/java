package designPattern.Command;

import view.Command;
import view.Shape;

import java.awt.*;

public class CommandColor implements Command {

    private char colorFutur;
    private char colorPast;

    private Shape shape;


    public CommandColor(char colorFutur, char colorPast, Shape shape){
        this.colorFutur = colorFutur;
        this.colorPast = colorPast;
        this.shape = shape;
    }

    @Override
    public void execute() {
        this.shape.setColor(colorFutur);
    }

    @Override
    public void unexecute() {
        this.shape.setColor(colorPast);
    }
}
