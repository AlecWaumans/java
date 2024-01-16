package view.Maps;

import Model.Color;
import Model.Position;
import Model.items.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static Model.Board.max_height;

public class MapOne {
    private GridPane pane;

    public MapOne(GridPane pane){
        this.pane = pane;
    }
    public GridPane getPane(){
        return this.pane;
    }
    public void createMaps(){
        //----------terre Image --------

        for (int i = 0; i < 58; i++) {
            for (int j = 0; j < 20; j++) {
                createItemsTerre(i,j);
            }
        }

        // --------Rock image-----

        createItemsRock(3,4);

        //--------Diams Image --------

        createItemsDiams(5,5);

        //--------MUR Image-----------
        for (int i = 0; i < max_height; i++) {
            createItemsMur(i,0);
        }
        for (int i = 1; i < 20; i++) {
            createItemsMur(0,i);
        }
        for (int i = 0; i < max_height; i++) {
            createItemsMur(i,19);
        }

        for (int i = 1; i < 20; i++) {
            createItemsMur(57,i);
        }
        for (int i = 1; i < 40; i++) {
            createItemsMur(i,6);
        }
        for (int i = 17; i < max_height - 1; i++) {
            createItemsMur(i,13);
        }

        //--------------Pawn Image ----------
        createItemPawn();

        //--------------Exit Image----------
        createItemExit();

        pane.setGridLinesVisible(true);
    }
    private void createItemPawn(){
        Pawn pawn = new Pawn(Color.RED);
        pawn.getImg().setFitHeight(25);
        pawn.getImg().setFitWidth(25);
        pane.add(pawn.getImg(),3,3);
    }
    private void createItemExit() {
        Exit exit = new Exit(Model.Color.WHITE);
        exit.getImg().setFitHeight(25);
        exit.getImg().setFitWidth(25);
        pane.add(exit.getImg(),50,16);
    }
    private void createItemsMur(int row, int column) {
        Mur mur = new Mur(Color.BLACK);
        mur.getImg().setFitWidth(25);
        mur.getImg().setFitHeight(25);
        pane.add(mur.getImg(), row, column);
    }
    private void createItemsDiams(int row, int column) {
        Position posDiams = new Position(row,column);
        Diams diams = new Diams(Model.Color.BLUE, posDiams);
        diams.getImg().setFitWidth(25);
        diams.getImg().setFitHeight(25);
        pane.add(diams.getImg(), row,column);
    }
    private void ResetItems(int row, int column) {
        pane.getChildren().remove(row,column);
    }
    private void createItemsTerre(int row, int column){
        Terre terre = new Terre(Model.Color.GREEN);
        terre.getImg().setFitWidth(25);
        terre.getImg().setFitHeight(25);
        pane.add(terre.getImg(), row, column);
    }
    private void createItemsRock(int row, int column){
        Position posRock = new Position(5,6);
        Rock rock = new Rock(Model.Color.GREY, posRock);
        rock.getImg().setFitWidth(25);
        rock.getImg().setFitHeight(25);
        pane.add(rock.getImg(),row,column);
    }


}
