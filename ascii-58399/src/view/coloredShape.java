package view;

public abstract class coloredShape implements Shape {
    private char color;

    public coloredShape(char color) {
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
