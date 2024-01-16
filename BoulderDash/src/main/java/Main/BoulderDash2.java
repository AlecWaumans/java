package Main;

import Model.Game;
import designPattern.Command.Command;
import designPattern.Command.CommandManages;
import designPattern.facade.Facade;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import view.Maps.MapOne;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Stack;

public class BoulderDash2 extends Application {

    GameMenu menuGame;
    Stage window;
    Scene scene1, scene2, scene3;
    private int level;
    public Parent createContent() {
        Pane root = new Pane();

        root.setPrefSize(725, 400);

        try (InputStream is = Files.newInputStream(Paths.get("ressourcs/image/start.jpeg"))) {
            ImageView img = new ImageView(new Image(is));
            img.setFitWidth(700);
            img.setFitHeight(350);
            root.getChildren().add(img);
        } catch (IOException e) {
            System.out.println("Couldn't load image");
        }

        BoulderDash2.startButton start = new BoulderDash2.startButton("Start");
        start.setTranslateX(225);
        start.setTranslateY(370);
        start.setOnMouseClicked(event -> {
            FadeTransition fadeT = new FadeTransition(Duration.seconds(0.50), start);
            fadeT.setFromValue(0);
            fadeT.setToValue(1);
            fadeT.setOnFinished(evt -> window.setScene(scene2));
            fadeT.play();
        });
        root.getChildren().addAll(start);
        return root;

    }

    private Parent createContent2() {
        Pane root = new Pane();
        root.setPrefSize(900, 500);

        try (InputStream is = Files.newInputStream(Paths.get("ressourcs/image/level.jpeg"))) {
            ImageView img = new ImageView(new Image(is));
            img.setFitWidth(1000);
            img.setFitHeight(500);
            root.getChildren().add(img);
        } catch (IOException e) {
            System.out.println("Couldn't load image");
        }
        Title title = new Title("Choisissez votre niveau !");
        title.setTranslateX(185);
        title.setTranslateY(0);

        startButton start = new startButton("New Game");
        start.setTranslateX(320);
        start.setTranslateY(470);
        start.setOnMouseClicked(event -> {
            FadeTransition fadeT = new FadeTransition(Duration.seconds(0.50), start);
            fadeT.setFromValue(0);
            fadeT.setToValue(1);
            fadeT.setOnFinished(evt -> window.setScene(scene3));
            fadeT.play();
        });

        levelButton Facile = new levelButton("Facile");
        Facile.setTranslateX(300);
        Facile.setTranslateY(150);


        levelButton Moyen = new levelButton("Moyen");
        Moyen.setTranslateX(300);
        Moyen.setTranslateY(250);

        levelButton Difficile = new levelButton("Difficile");
        Difficile.setTranslateX(300);
        Difficile.setTranslateY(350);

        Facile.setOnMouseClicked(event -> {
            Facile.setOpacity(1);
            Moyen.setOpacity(0.7);
            Difficile.setOpacity(0.7);
            this.level = 1;
            System.out.println(level);


        });
        Moyen.setOnMouseClicked(event -> {
            Facile.setOpacity(0.7);
            Moyen.setOpacity(1);
            Difficile.setOpacity(0.7);
            this.level = 2;
            System.out.println(level);

        });

        Difficile.setOnMouseClicked(event -> {
            Facile.setOpacity(0.7);
            Moyen.setOpacity(0.7);
            Difficile.setOpacity(1);
            this.level = 3;
            System.out.println(level);
        });

        root.getChildren().addAll(start, title, Facile, Moyen, Difficile);


        root.getChildren().add(menuGame);
        return root;
    }

    private Parent createContent3() {
        Pane root = new Pane();
        root.setPrefSize(1500, 700);
        GridPane pane = new GridPane();
        MapOne mapOne = new MapOne(pane);
        mapOne.createMaps();
        root.getChildren().addAll(mapOne.getPane());

        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        primaryStage.setTitle("BoulderDash");
        primaryStage.setResizable(true);//Avoid size modification
        System.out.println("Lancement du jeux");
        primaryStage.setResizable(false);//Avoid size modification

        //--------gestionnaire D'evenement--------
        //---------Menu--------
        this.menuGame = new GameMenu();
        menuGame.setVisible(false);
        window.addEventHandler(KeyEvent.KEY_RELEASED, (KeyEvent event) -> {
            if (KeyCode.ESCAPE == event.getCode()) {
                menuGame.setVisible(true);
            }
        });
        Stack<Command> undo = new Stack<Command>();
        Stack<Command> redo = new Stack<Command>();

        CommandManages manages = new CommandManages(undo, redo);
        Game game = new Game(manages);
        //--------Scene1-------
        scene1 = new Scene(createContent());

        //---------Scene2------
        scene2 = new Scene(createContent2());
        Facade facade = new Facade();

        //---------Scene3------
        game.start(this.level);
        scene3 = new Scene(createContent3());


        //-----Windows-----
        window.setScene(scene1);
        window.show();
    }

    public class GameMenu extends Parent {
        GameMenu() {
            Pane root = new Pane();

            Rectangle rt = new Rectangle(800, 700);
            rt.setFill(Color.WHITE);
            rt.setOpacity(0.7);

            root.setPrefSize(900, 700);

            VBox menu = new VBox(10);
            startButton resume = new startButton("RESUME");
            resume.setOnMouseClicked(event -> {
                FadeTransition ft = new FadeTransition(javafx.util.Duration.seconds(0.75), menuGame);
                ft.setFromValue(1);
                ft.setToValue(0);
                ft.setOnFinished(evt -> menuGame.setVisible(false));
                ft.play();
            });
            startButton exit = new startButton("EXIT");
            exit.setOnMouseClicked(event -> {
                System.exit(0);
            });

            menu.setTranslateX(300);
            menu.setTranslateY(200);


            menu.getChildren().addAll(resume, exit);
            root.getChildren().addAll(rt, menu);
            getChildren().addAll(root);
        }
    }

    public static class startButton extends StackPane {
        public startButton(String name) {
            Text text = new Text(name);
            text.setFont(Font.font(20));
            text.setFill(Color.WHITE);


            Rectangle rt = new Rectangle(250, 30);
            rt.setOpacity(0.7);
            rt.setFill(Color.BLACK);
            setAlignment(Pos.CENTER);
            getChildren().addAll(rt, text);

            setOnMouseEntered(event -> {
                rt.setFill(Color.GREY);
                text.setFill(Color.BLACK);
            });
            setOnMouseExited(event -> {
                rt.setFill(Color.BLACK);
                text.setFill(Color.WHITE);
            });

        }
    }

    public static class levelButton extends StackPane {
        levelButton(String name) {
            Text text = new Text(name);
            text.setFont(Font.font(20));
            text.setFill(Color.WHITE);


            Rectangle rt = new Rectangle(300, 50);
            //rt.setOpacity(0.7);
            rt.setFill(Color.BLACK);
            setAlignment(Pos.CENTER);
            getChildren().addAll(rt, text);

            setOnMouseEntered(event -> {
                rt.setFill(Color.GREY);
                text.setFill(Color.BLACK);
            });
            setOnMouseExited(event -> {
                rt.setFill(Color.BLACK);
                text.setFill(Color.WHITE);
            });

        }
    }

    private static class Title extends StackPane {
        public Title(String name) {
            Rectangle bg = new Rectangle(525, 60);
            bg.setStroke(Color.BLACK);
            bg.setStrokeWidth(2);
            bg.setFill(null);

            Text text = new Text(name);
            text.setFill(Color.BLACK);
            text.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 50));

            setAlignment(Pos.CENTER);
            getChildren().addAll(bg, text);
        }
    }
}
