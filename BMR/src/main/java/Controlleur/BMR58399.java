package Controlleur;


import Model.ModelUtil;
import disignPattern.Observer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import view.BmrInput;
import view.BmrOutput;

/*
 * ATTENTION :
 * Bonjour monsieur le proffesseur,
 * les observer observables ne fonctionne pas,
 * c'est une matière que je comprends , mais que j'arrive pas à l'écrire ...
 * Si vous savez ce qui ne vas pas Pouvez-vous me communiquez l'explication
 * de ce problême afin que je puisse mieux comprendre.
 * Bien à vous
 * Alec Waumans 58399
 */

public class BMR58399 extends Application {
    private BmrInput input;
    private BmrOutput output;


    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        ModelUtil model = new ModelUtil();
        primaryStage.setTitle("Calcul du BMR");
        primaryStage.setResizable(false);//Avoid size modification

        VBox root = new VBox(10);
        this.input = new BmrInput();
        this.output = new BmrOutput(model);
//------Menu------
        Menu fileMenu = new Menu("file");

        //-----Menu items----
        fileMenu.getItems().add(new MenuItem("exit"));

        //------Main Menu bar------
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);

        root.getChildren().add(menuBar);

        fileMenu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.exit(0);
            }
        });
        HBox gridplace = new HBox();
        gridplace.getChildren().addAll(input, output);
        root.getChildren().add(gridplace);

        //model.registerObserver(output);

        //-------Button -----
        Button clear = new Button("clear");
        clear.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                input.clear();
                output.clear();
            }
        });
        output.getBMRField().addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                output.getBMRField().setEditable(false);
                keyEvent.consume();
            }
        });
        output.getCaloriesField().addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                output.getCaloriesField().setEditable(false);
            }
        });
        Button btnCalcul = new Button("Calcul du BMR");
        btnCalcul.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                if (input.getTfdTailleText().isEmpty() || input.getTfdPoidText().isEmpty()
                        || input.getTfdAgetext().isEmpty() || !input.isFemale() && !input.isMale() || input.getLifeStyle() == null) {
                    output.setRedField();
                    output.setTfdBMR("Failed !");
                    output.setTfdCalories("Failed !");

                } else if (input.getTfdTailleText().equals("0") || input.getTfdPoidText().equals("0")
                        || input.getTfdAgetext().equals("0")) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);

                    alert.setTitle("Erreur d'encodage");
                    alert.setHeaderText("Valeur erronée");
                    alert.setContentText("Vous devez encoder une valeur strictement supérieur à zéro");

                    alert.showAndWait();

                } else {
                    try {
                        model.setSize(Double.parseDouble(input.getTfdTailleText()));
                        model.setAge(Double.parseDouble(input.getTfdAgetext()));
                        model.setWeight(Double.parseDouble(input.getTfdPoidText()));

                        if (input.isMale()) {
                            model.setbmrCalulatorMen();
                            String bmrString = String.valueOf(model.getBmrMen());
                            output.setBlackField();
                            output.setTfdBMR(bmrString);
                            double valueLifeStyle = input.getlifeStyleValue(input.getLifeStyle());
                            model.setActivityLevel(valueLifeStyle);
                            model.setcalCalculatorMen();
                            String calorieString = String.valueOf(model.getCalories());
                            output.setTfdCalories(calorieString);
                        }
                        if (input.isFemale()) {
                            model.setbmrCalculatorWomen();
                            String bmrString = String.valueOf(model.getBmrWomen());
                            output.setBlackField();
                            output.setTfdBMR(bmrString);
                            double valueLifeStyle = input.getlifeStyleValue(input.getLifeStyle());
                            model.setActivityLevel(valueLifeStyle);
                            model.setcalCalculatorWomen();
                            String calorieString = String.valueOf(model.getCalories());
                            output.setTfdCalories(calorieString);
                        }
                    } catch (Exception exception) {
                        output.setRedField();
                        output.setTfdBMR("Failed !");
                        output.setTfdCalories("Failed !");
                    }
                }
            }
        });

        root.getChildren().addAll(btnCalcul, clear);
        btnCalcul.setMaxWidth(Double.MAX_VALUE);
        clear.setMaxWidth(Double.MAX_VALUE);

//-----Scene-----
        Scene scene = new Scene(root, 700, 370);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}


