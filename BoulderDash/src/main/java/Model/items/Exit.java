package Model.items;

import Model.Board;
import Model.Color;
import Model.Position;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Exit extends Items{
    private ImageView img;

    public Exit(Color color) {
        super(color);
        this.img = new ImageView(imageDiam());
    }
    public ImageView getImg(){
        return this.img;
    }
    private Image imageDiam(){
        InputStream is = null;
        try {
            is = Files.newInputStream(Paths.get("ressourcs/image/exit.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Image(is);
    }

    @Override
    public List<Position> getPossibleMoves(Position position, Board board) {
        return null;
    }

    @Override
    public String toString() {
        String WHITE_BACKGROUND = "\u001B[45m";
        String RESET_BACKGROUND = "\u001B[0m";
        String espace = "  ";
        return WHITE_BACKGROUND + espace + RESET_BACKGROUND;
    }
}
