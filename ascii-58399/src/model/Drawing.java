package model;


import designPattern.Command.CommandList;
import designPattern.Command.CommandManages;
import designPattern.Command.CommandMove;
import designPattern.Command.CommandSup;
import view.Command;
import view.Shape;

import java.util.List;
import java.util.ArrayList;

public class Drawing {
    private List<Shape> shapes;
    private int height;
    private int width;
    private CommandManages comManages;

    public Drawing() {
    }

    public Drawing(int width, int height, CommandManages manage) {
        this.shapes = new ArrayList<Shape>();
        this.height = height;
        this.width = width;
        this.comManages = manage;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
    public List<Shape> getShapes(){
        return this.shapes;
    }
    public void movShape(int numShape, double horFutur, double verFutur){
        double horPast = this.shapes.get(numShape).getPoint().getX();
        double verPast = this.shapes.get(numShape).getPoint().getY();
        Command commandMove = new CommandMove( this.shapes, horPast, verPast,
                horFutur,verFutur,numShape);
        this.comManages.doCommande(commandMove);
    }
    public void groupShape(int numShapeOne, int numShapeTwo){
        double hor = this.shapes.get(numShapeOne).getPoint().getX();
        double ver = this.shapes.get(numShapeOne).getPoint().getY();
        this.shapes.get(numShapeTwo).getPoint().setX(hor);
        this.shapes.get(numShapeTwo).getPoint().setY(ver);
    }


    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }
    public void supShapes(int numShape){
        Shape shape = this.shapes.get(numShape);
        Command commandSup = new CommandSup(this.shapes, numShape, shape);
        this.comManages.doCommande(commandSup);
    }
    public void list(){
        Command commandList = new CommandList(this.shapes);
        this.comManages.doCommande(commandList);
    }

    /*
     * Returns the drawing or the given point p.
     * If there is no drawing, nothing is returned.
     */
    public Shape getShapeAt(Point p) {
        for (Shape shape : this.shapes) {
            if (shape.isInside(p)) {
                return shape;
            }
        }
        return null;
    }

}
