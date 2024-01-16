package Model.items;

import Model.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Rock extends Items {
    private ImageView img;

    private Position posRock;

    public Rock(Color color, Position posRock) {
        super(color);
        this.posRock = posRock;
        this.img = new ImageView(imageTerre());
    }
    public ImageView getImg(){
        return this.img;
    }
    private Image imageTerre(){
        InputStream is = null;
        try {
            is = Files.newInputStream(Paths.get("ressourcs/image/rock.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Image(is);
    }
    public Position getPosRock(){
        return this.posRock;
    }
    public void setPosRock(Position posRock){
        this.posRock = posRock;

    }

    @Override
    public List<Position> getPossibleMoves(Position position, Board board) {
        List<Position> possibleMoves = new ArrayList();
        if (!board.contains(position)) {
            throw new IllegalArgumentException("The position is outside the board." + position);
        }
        Items items = board.getItems(position);
        Position e = position.next(Direction.E);
        Position w = position.next(Direction.W);
        Position s = position.next(Direction.S);
        Position se = position.next(Direction.SE);
        Position sw = position.next(Direction.SW);



        if (items != null) {
            Color itemsColor = items.getColor();
            if (itemsColor == Color.GREY) {
                if (board.contains(s)) {
                    if (board.getItems(s) == null) {
                        possibleMoves.add(s);
                    }
                }
                if (board.contains(se)) {
                        if (board.getItems(se) == null && board.getItems(e) == null
                                && board.getItems(s) != null
                                && board.getItems(s).getColor() == Color.GREY) {
                            //If below it is a rock and east and south-east of it there is no item.
                            possibleMoves.add(se);
                        }

                }
                if (board.contains(sw)) {
                        if (board.getItems(sw) == null && board.getItems(w) == null
                                && board.getItems(s) != null
                                && board.getItems(s).getColor() == Color.GREY) {
                            //If below it is a rock and to the west and southwest of it there is no item.
                            possibleMoves.add(sw);
                        }
                    }
            }
        }
        return possibleMoves;
    }


    @Override
    public String toString() {
        String GREY_BACKGROUND = "\u001B[47m";
        String RESET_BACKGROUND = "\u001B[0m";
        String espace = "  ";
        return GREY_BACKGROUND + espace + RESET_BACKGROUND;
    }
}
