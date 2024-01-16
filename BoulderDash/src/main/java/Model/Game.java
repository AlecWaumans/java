package Model;

import Model.items.*;
import designPattern.Command.*;

import java.util.ArrayList;
import java.util.List;

import static Model.Board.max_Width;
import static Model.Board.max_height;

public class Game {
    private Board board;
    private Player red;
    private List<Rock> rockList;
    private List<Diams> diamsList;
    private List<Diams> diamsListRecup;

    private Player currentPlayer;
    private GameState state;
    private Pawn pawn;

    private CommandManages comManages;

    public Game() {

    }

    public Game(CommandManages manage) {
        this.red = new Player(Color.RED);
        this.board = new Board();
        this.rockList = new ArrayList<Rock>();
        this.diamsList = new ArrayList<Diams>();
        this.diamsListRecup = new ArrayList<Diams>();
        this.comManages = manage;
    }


    public GameState getState() {
        return this.state;
    }

    public Player getCurrentPlayer() {
        return this.currentPlayer;
    }

    /**
     * @param pos position of item.
     * @return the item that is in the position set to parameterize.
     */
    public Items getItems(Position pos) {
        if (!board.contains(pos)) {
            throw new IllegalArgumentException("The position is outside the chess");
        }
        return board.getItems(pos);
    }

    /**
     * @return position of the pawn on the board.
     */

    public Position getPawnPlayer() {
        return this.board.getPawnPosition();
    }

    /**
     * This method will be useful to put the name of the player in the games.
     *
     * @param name user choice.
     */

    public void setNamePlayer(String name) {
        this.currentPlayer.setName(name);
    }

    /**
     * @return The number of diamonds the player has already received.
     */

    public int diamsRecup() {
        return this.diamsListRecup.size();
    }

    /**
     * Method that will create and initiate the games (the board with all items and player).
     *
     * @param level games that will change the number of diamond and rock depending on the level.
     */

    public void start(int level) {
        this.currentPlayer = this.red;
        this.state = GameState.PLAY;
        //pawn initialization
        Pawn pawn = new Pawn(Color.RED);
        Position posPawn = new Position(2, 3);
        this.board.setItems(pawn, posPawn);
        this.pawn = pawn;

        // initialization of the wall square and the two bars

        for (int i = 0; i < max_height; i++) {
            createItemsMur(0, i);
        }
        for (int i = 1; i < 20; i++) {
            createItemsMur(i, 0);
        }
        for (int i = 0; i < max_height; i++) {
            createItemsMur(19, i);
        }

        for (int i = 1; i < 20; i++) {
            createItemsMur(i, 57);
        }
        for (int i = 1; i < 40; i++) {
            createItemsMur(6, i);
        }
        for (int i = 17; i < max_height - 1; i++) {
            createItemsMur(13, i);
        }

        // earth initialization
        for (int i = 0; i < max_Width; i++) {
            for (int j = 0; j < max_height; j++) {
                Position pos = new Position(i, j);
                if (this.board.getItems(pos) == null) {
                    createItemsTerre(i, j);
                }
            }
        }
        // Remove some items from the tray.
        for (int i = 10; i < 20; i++) {
            ResetItems(4, i);
            ResetItems(10, i);
            ResetItems(15, i);
        }
        for (int i = 25; i < 40; i++) {
            ResetItems(2, i);
            ResetItems(8, i);
            ResetItems(16, i);
        }
        for (int i = 7; i < 13; i++) {
            ResetItems(i, 45);
            ResetItems(i, 3);
        }
        // rocks initialization
        boolean listCompleteRock;
        listCompleteRock = true;
        while (listCompleteRock) {
            createItemsRock();
            int tailleListRock = this.rockList.size();
            if (level == 0) {
                if (tailleListRock == 5) {
                    listCompleteRock = false;
                }
            } else if (level == 1) {
                if (tailleListRock == 30) {
                    listCompleteRock = false;
                }
            } else if (level == 2) {
                if (tailleListRock == 70) {
                    listCompleteRock = false;
                }
            } else {
                if (tailleListRock == 100) {
                    listCompleteRock = false;
                }
            }
        }
        // diamonds initialization
        boolean listCompleteDiams;
        listCompleteDiams = true;
        while (listCompleteDiams) {
            createItemsDiams();
            int tailleListDiams = this.diamsList.size();

            if (level == 0) {
                if (tailleListDiams == 1) {
                    listCompleteDiams = false;
                }
            } else if (level == 1) {
                if (tailleListDiams == 30) {
                    listCompleteDiams = false;
                }
            } else if (level == 2) {
                if (tailleListDiams == 20) {
                    listCompleteDiams = false;
                }
            } else {
                if (tailleListDiams == 10) {
                    listCompleteDiams = false;
                }
            }
        }
    }

    /**
     * initialization of the output once the game conditions are met.
     */

    public void createItemExit() {
        Position posExit = new Position(16, 50);
        if (this.board.getItems(posExit) != null
                && this.board.getItems(posExit).getColor().equals(Color.GREEN)) {
            Exit exit = new Exit(Color.WHITE);
            this.board.setItems(exit, posExit);
        }
    }

    private void createItemsTerre(int row, int column) {
        Terre terre = new Terre(Color.GREEN);
        Position posTerre = new Position(row, column);
        this.board.setItems(terre, posTerre);
    }

    private void createItemsDiams() {
        Position posDiams = randomPos();
        if (this.board.getItems(posDiams) != null
                && this.board.getItems(posDiams).getColor().equals(Color.GREEN)) {
            Diams diams = new Diams(Color.BLUE, posDiams);
            this.board.setItems(diams, posDiams);
            this.diamsList.add(diams);
        }
    }

    private void createItemsRock() {
        Position posRock = randomPos();
        if (this.board.getItems(posRock) != null
                && this.board.getItems(posRock).getColor().equals(Color.GREEN)) {
            Rock Rock = new Rock(Color.GREY, posRock);
            this.board.setItems(Rock, posRock);
            this.rockList.add(Rock);
        }
    }

    private void createItemsMur(int row, int column) {
        Items mur = new Mur(Color.BLACK);
        Position pos = new Position(row, column);
        this.board.setItems(mur, pos);
    }

    private void ResetItems(int row, int column) {
        Position pos = new Position(row, column);
        this.board.dropItems(pos);
    }

    /**
     * @return random position on the board.
     */

    private Position randomPos() {
        int rowRandom = (int) (Math.random() * (19 - 1));
        int columnRandom = (int) (Math.random() * (57 - 1));
        Position pos = new Position(rowRandom, columnRandom);
        return pos;
    }

    /**
     * @return true if all the positions that all diamond list diamonds on the tray can do have.
     */
    private boolean isEmptyPosMoveDiams() {
        for (Diams diam : this.diamsList) {
            Position posDiams = diam.getPosDiams();
            List<Position> diamMovePoss = diam.getPossibleMoves(posDiams, this.board);
            if (!diamMovePoss.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method will bring down
     * all rock that certain condition until
     * their final position.
     */

    public void diamPosChange() {
        while (!isEmptyPosMoveDiams()) {
            for (Diams diam : this.diamsList) {
                Position startPos = diam.getPosDiams();
                List<Position> diamsMovePoss = diam.getPossibleMoves(startPos, this.board);
                Position diamS = startPos.next(Direction.S);
                Position diamSS = diamS.next(Direction.S);
                Position diamE = startPos.next(Direction.E);
                Position diamSE = startPos.next(Direction.SE);
                Position diamSSE = diamSE.next(Direction.S);
                Position diamW = startPos.next(Direction.W);
                Position diamSW = startPos.next(Direction.SW);
                Position diamSSW = diamSW.next(Direction.S);

                if (getItems(diamSS) != null
                        && getItems(diamSS).getColor() == Color.RED
                        && getItems(diamS) == null) {
                    // if the SS position of the diamond is the player => kill
                    movePosition(startPos, diamSS);
                    diam.setPosDiams(diamSS);
                    this.state = GameState.LOSE;
                }
                if (!diamsMovePoss.isEmpty() && diamSSE.equals(getPawnPlayer())
                        && board.getItems(diamE) == null
                        && board.getItems(diamSE) == null
                        && board.getItems(diamS) != null
                        && board.getItems(diamS).getColor() == Color.GREY) {
                    // if the SSE position of the diamond is the player and pos E has no item
                    // as well as the pos SE and that it below it is a rock => kill
                    movePosition(startPos, diamSSE);
                    diam.setPosDiams(diamSE);
                    this.state = GameState.LOSE;
                }
                if (!diamsMovePoss.isEmpty() && diamSSW.equals(getPawnPlayer())
                        && board.getItems(diamW) == null
                        && board.getItems(diamSW) == null
                        && board.getItems(diamS) != null
                        && board.getItems(diamS).getColor() == Color.GREY) {
                    // if the SSW position of the diamond is the player and pos W has no item
                    // as well as the pos SW and that below it is a rock => kill
                    movePosition(startPos, diamSSW);
                    diam.setPosDiams(diamSW);
                    this.state = GameState.LOSE;
                }

                if (!diamsMovePoss.isEmpty() && diamsMovePoss.get(0).equals(diamS)) {
                    Position endpos = diamsMovePoss.get(0);
                    //First if there is a way to move to S done.
                    movePosition(startPos, endpos);
                    diam.setPosDiams(endpos);
                    diamsMovePoss = diam.getPossibleMoves(endpos, this.board);
                    diamS = endpos.next(Direction.S);

                    if (!diamsMovePoss.isEmpty() && diamsMovePoss.get(0).equals(diamS)) {
                        movePosition(endpos, diamS);
                        //then if there is still a way to go south does the.
                        diam.setPosDiams(diamS);
                    }
                    if (!diamsMovePoss.isEmpty()) {
                        movePosition(endpos, diamsMovePoss.get(0));
                        //otherwise moves the first position they want to move.
                        diam.setPosDiams(diamsMovePoss.get(0));
                    }
                } else {
                    if (!diamsMovePoss.isEmpty()) {
                        movePosition(diam.getPosDiams(), diamsMovePoss.get(0));
                        //if you still have positions to perform after this.
                        diam.setPosDiams(diamsMovePoss.get(0));
                    }
                }

            }
        }
    }

    /**
     * @return true if there is no more possible change of position to do for all rocks.
     */
    private boolean isEmptyPosMoveRock() {
        for (Rock rock : this.rockList) {
            Position posRock = rock.getPosRock();
            List<Position> rockMovePoss = rock.getPossibleMoves(posRock, this.board);
            if (!rockMovePoss.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method will bring down
     * all rock that certain condition until
     * their final position.
     */

    public void rockPosChange() {
        while (!isEmptyPosMoveRock()) {
            for (Rock rock : this.rockList) {
                Position startPos = rock.getPosRock();
                List<Position> rockMovePoss = rock.getPossibleMoves(startPos, this.board);
                Position RockSud = startPos.next(Direction.S);
                Position RockSS = RockSud.next(Direction.S);
                Position RockE = startPos.next(Direction.E);
                Position RockSE = startPos.next(Direction.SE);
                Position RockSSE = RockSE.next(Direction.S);
                Position RockW = startPos.next(Direction.W);
                Position RockSW = startPos.next(Direction.SW);
                Position RockSSW = RockSW.next(Direction.S);

                if (getItems(RockSS) != null
                        && getItems(RockSS).getColor() == Color.RED
                        && getItems(RockSud) == null) {
                    // if the SS position of the rock is the player => kill
                    movePosition(startPos, RockSS);
                    rock.setPosRock(RockSS);
                    this.state = GameState.LOSE;

                }
                if (!rockMovePoss.isEmpty() && RockSSE.equals(getPawnPlayer())
                        && board.getItems(RockE) == null
                        && board.getItems(RockSE) == null
                        && board.getItems(RockSud) != null
                        && board.getItems(RockSud).getColor() == Color.GREY) {
                    // if the rock SSE position is the player and pos E has no item
                    // as well as the pos SE and that in below it is a rock => kill
                    movePosition(startPos, RockSSE);
                    rock.setPosRock(RockSE);
                    this.state = GameState.LOSE;

                }
                if (!rockMovePoss.isEmpty() && RockSSW.equals(getPawnPlayer())
                        && board.getItems(RockW) == null
                        && board.getItems(RockSW) == null
                        && board.getItems(RockSud) != null
                        && board.getItems(RockSud).getColor() == Color.GREY) {
                    // if the rock SSW position is the player and pos W has no item
                    // as well as the pos SW and that in below it is a rock => kill
                    movePosition(startPos, RockSSW);
                    rock.setPosRock(RockSW);
                    this.state = GameState.LOSE;

                }

                if (!rockMovePoss.isEmpty() && rockMovePoss.get(0).equals(RockSud)) {
                    //First if there is a way to move to S done.
                    Position endpos = rockMovePoss.get(0);
                    movePosition(startPos, endpos);
                    rock.setPosRock(endpos);
                    rockMovePoss = rock.getPossibleMoves(endpos, this.board);
                    RockSud = endpos.next(Direction.S);

                    if (!rockMovePoss.isEmpty() && rockMovePoss.get(0).equals(RockSud)) {
                        //then if there is still a way to go south does the.
                        movePosition(endpos, RockSud);
                        rock.setPosRock(RockSud);
                    }
                    if (!rockMovePoss.isEmpty()) {
                        //otherwise moves the first position they want to move.
                        movePosition(endpos, rockMovePoss.get(0));
                        rock.setPosRock(rockMovePoss.get(0));
                    }
                } else {
                    if (!rockMovePoss.isEmpty()) {
                        //if you still have positions to perform after this.
                        movePosition(rock.getPosRock(), rockMovePoss.get(0));
                        rock.setPosRock(rockMovePoss.get(0));
                    }
                }

            }
        }

    }

    /**
     * Allows a pawn to change places from an old position to a new one.
     *
     * @param oldPos old position select.
     * @param newPos new position select.
     */

    public void movePosition(Position oldPos, Position newPos) {
        if (!this.board.contains(oldPos)) {
            throw new IllegalArgumentException("The position is outside the board. " + oldPos);
        }
        if (!this.board.contains(newPos)) {
            throw new IllegalArgumentException("The position is outside the board. " + newPos);
        }
        Items item = this.board.getItems(oldPos);
        if (this.board.getItems(newPos) != null) {
            if (this.board.getItems(newPos).getColor() == Color.GREEN) {
                this.board.dropItems(newPos);
            } else if (this.board.getItems(newPos).getColor() == Color.RED) {
                this.board.dropItems(newPos);
            }
        }
        this.board.setItems(item, newPos);
        this.board.dropItems(oldPos);
    }


    public void updateRocksDiams() {
        rockPosChange();
        diamPosChange();
    }

    /**
     * This method will serve to change the state of the game that certain condition.
     */

    public void updateState() {
        Position posPawn = this.board.getPawnPosition();
        Position ExitPos = new Position(16, 50);
        // if there is more diamond and the state of the game is on play
        if (this.diamsListRecup.size() == 10 && this.state.equals(GameState.PLAY)) {
            this.state = GameState.PROGRESS;
        }
        // if the player’s position is the same as the exit position and the game and is in the process of being finished.
        if (posPawn.equals(ExitPos) && this.state.equals(GameState.PROGRESS)) {
            this.state = GameState.WIN;
        }
    }

    /**
     * @return the number of exits on the set.
     */
    public int OneExit() {
        return this.board.oneExit();
    }

    public void helps() {
        Command commandHelps = new CommandHelps();
        this.comManages.doCommande(commandHelps);
    }

    public void CommandMovePawn(Position startPos, Position endpos) {
        Command commandMove = new CommandMovePawn(startPos, endpos, this.pawn, this.board, this.diamsList, this.diamsListRecup);
        this.comManages.doCommande(commandMove);
    }

}
