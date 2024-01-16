package model;

import designPattern.Command.*;
import view.Command;
import view.Shape;

public class AsciiPaint extends Drawing {
    private Drawing drawing;
    private CommandManages comManages;


    public AsciiPaint() {
    }

    public AsciiPaint(int width, int height, CommandManages manage) {
        super(width, height, manage);
        this.comManages = manage;
    }

    public Drawing getDrawing() {
        return drawing;
    }

    public void setDrawing(Drawing drawing) {
        this.drawing = drawing;
    }


    public void newCircle(char color, int x, int y, double radius) {
        Point pointCircle = new Point(x, y);
        Circle circle = new Circle(color, pointCircle, radius);
        Command commandCircle = new CommandAdd(this.drawing,circle);
        this.comManages.doCommande(commandCircle);

    }

    public void newRectangle(int x, int y, double width, double height, char color) {
        Point pointRectangle = new Point(x, y);
        Rectangle rectangle = new Rectangle(pointRectangle, width, height, color);
        Command commandRec= new CommandAdd(this.drawing,rectangle);
        this.comManages.doCommande(commandRec);
    }

    public void newSquare(int x, int y, double side, char color) {
        Point pointSquare = new Point(x, y);
        Square square = new Square(pointSquare, side, color);
        Command commandSquare = new CommandAdd(this.drawing,square);
        this.comManages.doCommande(commandSquare);
    }
    public void newLine(double ax, double ay, double bx, double by, char color){
        Point pointa = new Point(ax, ay);
        Point pointb = new Point(bx, by);
        Line line = new Line(pointa, pointb,color);
        Command commandLine = new CommandAdd(this.drawing,line);
        this.comManages.doCommande(commandLine);
    }

    /*
     * Goes through all the drawing given point by point And for each point verified
     * if the point is in a force it prints the color of the point on the drawing
     * otherwise prints blank.
     */
    public void Ascii(Drawing drawing) {
        Command commandShow = new CommandShow(drawing);
        this.comManages.doCommande(commandShow);
    }
    public void setColor(int num, char colorFutur){
        Shape shape = drawing.getShapes().get(num);
        char colorPast = shape.getColor();
        Command commandColor = new CommandColor(colorFutur,colorPast,shape);
        this.comManages.doCommande(commandColor);

    }
    public void helps(){
         Command commandHelps = new CommandHelps();
         this.comManages.doCommande(commandHelps);
    }


}

