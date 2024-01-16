package Model.items;

import Model.Board;
import Model.Color;
import Model.Direction;
import Model.Position;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Diams extends Items {
    private ImageView img;

    private Position posDiams;

    public Diams(Color color, Position posDiams){
        super(color);
        this.posDiams = posDiams;
        this.img = new ImageView(imageDiam());
    }
    public ImageView getImg(){
        return this.img;
    }
    private Image imageDiam(){
        InputStream is = null;
        try {
            is = Files.newInputStream(Paths.get("ressourcs/image/diamant.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Image(is);
    }
    public Position getPosDiams(){
        return this.posDiams;
    }
    public void setPosDiams(Position posDiams){
        this.posDiams = posDiams;
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
            if (itemsColor == Color.BLUE) {
                if (board.contains(s)) {
                    if (board.getItems(s) == null) {
                        //if the item is blue and the S position is on the tray
                        // and that on the S positon there is no item.
                        possibleMoves.add(s);
                    }
                }
                if (board.contains(se)) {
                    if (board.getItems(se) == null && board.getItems(e) == null
                            && board.getItems(s) != null
                            && board.getItems(s).getColor() == Color.GREY) {
                        //If below it is a rock and east and southeast of it there is no item.
                        possibleMoves.add(se);
                    }
                }
                if (board.contains(sw)) {
                    if (board.getItems(sw) == null && board.getItems(w) == null
                            && board.getItems(s) != null
                            && board.getItems(s).getColor() == Color.GREY) {
                        //If below it is a rock and on the west and southwest of it there is no item.
                        possibleMoves.add(sw);
                    }
                }
            }
        }
        return possibleMoves;
    }

    @Override
    public String toString() {
        String BLUE_BACKGROUND = "\u001B[44m";
        String RESET_BACKGROUND = "\u001B[0m";
        String espace = "  ";
        return BLUE_BACKGROUND + espace + RESET_BACKGROUND;
    }

}
