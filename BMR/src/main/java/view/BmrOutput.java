package view;

import Model.ModelUtil;
import disignPattern.Observer;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BmrOutput extends GridPane implements Observer {
    private TextField BMRField;
    private TextField caloriesField;
    private ModelUtil model;

    public BmrOutput(ModelUtil model) {
        this.model = model;
        setPadding(new Insets(5));
        setHgap(10);
        setVgap(8);

        //----Title-----
        //------Résultats------
        Label TitleRes = new Label("Résultats");
        TitleRes.setFont(Font.font("System", FontWeight.BOLD, 15));
        TitleRes.setUnderline(true);
        add(TitleRes, 0, 0);
        GridPane.setHalignment(TitleRes, HPos.LEFT);
        GridPane.setMargin(TitleRes, new Insets(0, 0, 10, 0));

        //------BMR------
        Label BMR = new Label("BMR");
        BMR.setFont(Font.font("System", FontWeight.BOLD, 13));
        add(BMR, 0, 1);
        GridPane.setHalignment(BMR, HPos.LEFT);
        GridPane.setMargin(BMR, new Insets(0, 0, 10, 0));
        //------Calories------
        Label Calories = new Label("Calories");
        Calories.setFont(Font.font("System", FontWeight.BOLD, 13));
        add(Calories, 0, 2);
        GridPane.setHalignment(Calories, HPos.LEFT);
        GridPane.setMargin(Calories, new Insets(0, 0, 10, 0));

        //------TextField-----
        //------Bmr Field-----
        this.BMRField = new TextField();
        BMRField.setPromptText("Résultats du BMR");
        add(BMRField, 1, 1);
        GridPane.setHalignment(BMRField, HPos.LEFT);
        GridPane.setMargin(BMRField, new Insets(0, 0, 10, 0));


        //------Calories Field-----
        this.caloriesField = new TextField();
        caloriesField.setPromptText("Dépense en calories");
        add(caloriesField, 1, 2);
        GridPane.setHalignment(caloriesField, HPos.LEFT);
        GridPane.setMargin(caloriesField, new Insets(0, 0, 10, 0));

    }
    public TextField getBMRField(){
        return this.BMRField;
    }
    public TextField getCaloriesField(){
        return this.caloriesField;
    }

    public void setTfdBMR(String bmr) {
        this.BMRField.setText(bmr);
    }

    public void setTfdCalories(String calories) {
        this.caloriesField.setText(calories);
    }

    public void setRedField() {
        this.BMRField.setStyle("-fx-text-fill: red");
        this.caloriesField.setStyle("-fx-text-fill: red");
    }

    public void setBlackField() {
        this.BMRField.setStyle("-fx-text-fill: black");
        this.caloriesField.setStyle("-fx-text-fill: black");
    }

    public void clear() {
        if (this.BMRField != null || this.caloriesField != null) {
            this.BMRField.clear();
            this.caloriesField.clear();
        }
    }
    @Override
    public void update() {
        this.BMRField.setText("" + model.getBmrMen());
        this.caloriesField.setText("" + model.getCalories());
    }


}
