package controlleur;

import designPattern.Command.CommandManages;
import model.AsciiPaint;
import model.Drawing;
import view.Command;

import java.util.Scanner;
import java.util.Stack;

public class Application extends AsciiPaint {
    private AsciiPaint paint;

    public Application() {

    }

    /*
     * Cette methode va faire le déroulement du programme.
     */

    public void start() {
        Stack<Command> undo = new Stack<Command>();
        Stack<Command> redo = new Stack<Command>();

        CommandManages manages = new CommandManages(undo, redo);
        AsciiPaint draw = new AsciiPaint(100, 100, manages);
        Drawing drawing = new Drawing(100, 100, manages);
        draw.setDrawing(drawing);


        System.out.println("------Color and Shape-------");
        Scanner clavier = new Scanner(System.in);
        System.out.println("If you want information about commands type <helps>");

        while (true) {
            System.out.print(">>> ");
            String commande = clavier.nextLine();
            String[] arrOfStr = commande.split(" ", 7);
            String addShowHelps = arrOfStr[0].toLowerCase();
            while (isCommand(addShowHelps)) {
                notFoundMessage();
                commande = clavier.nextLine();
                arrOfStr = commande.split(" ", 7);
                addShowHelps = arrOfStr[0].toLowerCase();
            }
            switch (addShowHelps) {
                case "redo" -> {
                    manages.redo();
                }
                case"undo"->{
                    manages.undo();
                }
                case "show" -> {
                    draw.Ascii(drawing);
                    System.out.println();
                }
                case "helps" -> draw.helps();
                case "list" -> drawing.list();
                case "exit" -> System.exit(0);
                case "move" -> {
                    while (arrOfStr.length < 3) {
                        missingMessage();
                        commande = clavier.nextLine();
                        arrOfStr = commande.split(" ", 7);
                    }
                    int numShapes = numShapeList(arrOfStr);
                    try {
                        int horizontal = Integer.parseInt(arrOfStr[2]);
                        int vertical = Integer.parseInt(arrOfStr[3]);
                        drawing.movShape(numShapes, horizontal, vertical);
                    } catch (Exception e) {
                        wrongMessage();
                        commande = clavier.nextLine();
                        arrOfStr = commande.split(" ", 7);
                        int horizontal = Integer.parseInt(arrOfStr[2]);
                        int vertical = Integer.parseInt(arrOfStr[3]);
                        drawing.movShape(numShapes, horizontal, vertical);
                    }
                }
                case "delete" -> {
                    while (arrOfStr.length < 2) {
                        missingMessage();
                        commande = clavier.nextLine();
                        arrOfStr = commande.split(" ", 7);
                    }
                    int numShape = numShapeList(arrOfStr);
                    drawing.supShapes(numShape);
                }


                case "color" -> {
                    while (arrOfStr.length < 2) {
                        missingMessage();
                        commande = clavier.nextLine();
                        arrOfStr = commande.split(" ", 7);
                    }

                    try {
                        int numShapeList = numShapeList(arrOfStr);
                        String colorShapeS = arrOfStr[2];
                        char colorShape = colorShapeS.charAt(0);
                        draw.setColor(numShapeList, colorShape);
                    } catch (Exception e) {
                        wrongMessage();
                        commande = clavier.nextLine();
                        arrOfStr = commande.split(" ", 7);
                        int numShapeList = numShapeList(arrOfStr);
                        String colorShapeS = arrOfStr[2];
                        char colorShape = colorShapeS.charAt(0);
                        draw.setColor(numShapeList, colorShape);
                    }
                }
                case "add" -> {
                    String shape = arrOfStr[1].toLowerCase();
                    while (isShape(shape)) {
                        notFoundMessage();
                        commande = clavier.nextLine();
                        arrOfStr = commande.split(" ", 7);
                        shape = arrOfStr[1].toLowerCase();
                    }
                    switch (shape) {
                        case "circle" -> {
                            while (arrOfStr.length < 5) {
                                missingMessage();
                                commande = clavier.nextLine();
                                arrOfStr = commande.split(" ", 7);
                            }
                            boolean isAdd = true;
                            while (isAdd) {
                                try {
                                    circleParam(arrOfStr, draw);
                                    isAdd = false;

                                } catch (Exception e) {
                                    wrongMessage();
                                    commande = clavier.nextLine();
                                    arrOfStr = commande.split(" ", 7);
                                }
                            }
                        }
                        case "rectangle" -> {
                            while (arrOfStr.length < 6) {
                                missingMessage();
                                commande = clavier.nextLine();
                                arrOfStr = commande.split(" ", 7);
                            }
                            boolean isAdd = true;
                            while (isAdd) {
                                try {
                                    recParam(arrOfStr, draw);
                                    isAdd = false;
                                } catch (Exception e) {
                                    wrongMessage();
                                    commande = clavier.nextLine();
                                    arrOfStr = commande.split(" ", 7);
                                    recParam(arrOfStr, draw);
                                }
                            }

                        }
                        case "square" -> {
                            while (arrOfStr.length < 5) {
                                missingMessage();
                                commande = clavier.nextLine();
                                arrOfStr = commande.split(" ", 7);
                            }
                            boolean isAdd = true;
                            while (isAdd) {
                                try {
                                    squareParam(arrOfStr, draw);
                                    isAdd = false;
                                } catch (Exception e) {
                                    wrongMessage();
                                    commande = clavier.nextLine();
                                    arrOfStr = commande.split(" ", 7);
                                    squareParam(arrOfStr, draw);
                                }
                            }

                        }
                        case "line" -> {
                            while (arrOfStr.length < 6) {
                                missingMessage();
                                commande = clavier.nextLine();
                                arrOfStr = commande.split("", 5);
                            }
                            boolean isAdd = true;
                            while (isAdd) {
                                try {
                                    lineParam(arrOfStr, draw);
                                    isAdd = false;
                                } catch (Exception e) {
                                    wrongMessage();
                                    commande = clavier.nextLine();
                                    arrOfStr = commande.split("", 7);
                                    lineParam(arrOfStr, draw);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void wrongMessage() {
        System.out.println("Override command : wrong parameter");
        System.out.print(">>> ");
    }

    public void missingMessage() {
        System.out.println("Override command: missing parameter");
        System.out.print(">>> ");
    }

    public void notFoundMessage() {
        System.out.println("commands not found try again !");
        System.out.print(">>> ");
    }


    public void circleParam(String[] arrOfStr, AsciiPaint draw) {
        int xCenter = Integer.parseInt(arrOfStr[2]);
        int yCenter = Integer.parseInt(arrOfStr[3]);
        double radius = Double.parseDouble(arrOfStr[4]);
        String colorCircle = arrOfStr[5];
        char cCircle = colorCircle.charAt(0);
        draw.newCircle(cCircle, xCenter, yCenter, radius);
    }

    public void squareParam(String[] arrOfStr, AsciiPaint draw) {
        int xUpperLeftSquare = Integer.parseInt(arrOfStr[2]);
        int yUpperLeftSquare = Integer.parseInt(arrOfStr[3]);
        double side = Double.parseDouble(arrOfStr[4]);
        String colorSquare = arrOfStr[5];
        char cSquare = colorSquare.charAt(0);
        draw.newSquare(xUpperLeftSquare, yUpperLeftSquare, side, cSquare);
    }

    public void recParam(String[] arrOfStr, AsciiPaint draw) {
        int xUpperLeftRec = Integer.parseInt(arrOfStr[2]);
        int yUpperLeftRec = Integer.parseInt(arrOfStr[3]);
        double widthRec = Double.parseDouble(arrOfStr[4]);
        double heightRec = Double.parseDouble(arrOfStr[5]);
        String colorRec = arrOfStr[6];
        char cRec = colorRec.charAt(0);
        draw.newRectangle(xUpperLeftRec, yUpperLeftRec, widthRec, heightRec, cRec);
    }

    public void lineParam(String[] arrOfStr, AsciiPaint draw) {
        int ax = Integer.parseInt(arrOfStr[2]);
        int bx = Integer.parseInt(arrOfStr[3]);
        int ay = Integer.parseInt(arrOfStr[4]);
        int by = Integer.parseInt(arrOfStr[5]);
        String colorLine = arrOfStr[6];
        char cLine = colorLine.charAt(0);
        draw.newLine(ax, ay, bx, by, cLine);
    }

    public int numShapeList(String[] arrOfStr) {
        int numShapesList = Integer.parseInt(arrOfStr[1]);
        return numShapesList - 1;
    }

    public boolean isCommand(String addShowHelps) {
        return !addShowHelps.equals("move")
                && !addShowHelps.equals("delete")
                && !addShowHelps.equals("exit")
                && !addShowHelps.equals("list")
                && !addShowHelps.equals("color")
                && !addShowHelps.equals("show")
                && !addShowHelps.equals("helps")
                && !addShowHelps.equals("add")
                && !addShowHelps.equals("undo")
                && !addShowHelps.equals("redo");
    }

    public boolean isShape(String shape) {
        return !shape.equals("line")
                && !shape.equals("circle")
                && !shape.equals("rectangle")
                && !shape.equals("square");
    }


}
