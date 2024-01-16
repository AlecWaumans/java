package view;

import Model.LifeStyle;
import disignPattern.Observable;
import disignPattern.Observer;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.ArrayList;

public class BmrInput extends GridPane implements Observable {
    private TextField tailleField;
    private TextField poidField;
    private TextField ageField;
    private RadioButton femaleRadioButton;
    private RadioButton maleRadioButton;
    private ChoiceBox<LifeStyle> stileDeVieChoixBox;
    private ArrayList<Observer> observers;


    public BmrInput() {
        setPadding(new Insets(5));
        setHgap(10);
        setVgap(8);

        //----Title-----
        //------donnée------
        Label TitleDonLeft = new Label("Données");
        TitleDonLeft.setFont(Font.font("System", FontWeight.BOLD, 15));
        TitleDonLeft.setUnderline(true);
        add(TitleDonLeft, 0, 0);
        GridPane.setHalignment(TitleDonLeft, HPos.LEFT);
        GridPane.setMargin(TitleDonLeft, new Insets(0, 0, 10, 0));
        //------Taille------
        Label taille = new Label("Taille(cm)");
        taille.setFont(Font.font("System", FontWeight.BOLD, 13));
        add(taille, 0, 1);
        GridPane.setHalignment(taille, HPos.LEFT);
        GridPane.setMargin(taille, new Insets(0, 0, 10, 0));
        //------poid------
        Label poid = new Label("Poid(kg)");
        poid.setFont(Font.font("System", FontWeight.BOLD, 13));
        add(poid, 0, 2);
        GridPane.setHalignment(poid, HPos.LEFT);
        GridPane.setMargin(poid, new Insets(0, 0, 10, 0));
        //------age------
        Label age = new Label("Age(années)");
        age.setFont(Font.font("System", FontWeight.BOLD, 13));
        add(age, 0, 3);
        GridPane.setHalignment(age, HPos.LEFT);
        GridPane.setMargin(age, new Insets(0, 0, 10, 0));
        //------sexe------
        Label sexe = new Label("Sexe");
        sexe.setFont(Font.font("System", FontWeight.BOLD, 13));
        add(sexe, 0, 4);
        GridPane.setHalignment(sexe, HPos.LEFT);
        GridPane.setMargin(sexe, new Insets(0, 0, 10, 0));
        //------Style de vie------
        Label lifeStyle = new Label("Style de vie ");
        lifeStyle.setFont(Font.font("System", FontWeight.BOLD, 13));
        add(lifeStyle, 0, 5);
        GridPane.setHalignment(lifeStyle, HPos.LEFT);
        GridPane.setMargin(lifeStyle, new Insets(0, 0, 10, 0));

        //------TextField-----
        //------taille-----
        this.tailleField = new TextField();
        tailleField.setPromptText("Taille en cm");
        add(tailleField, 1, 1);
        GridPane.setHalignment(tailleField, HPos.LEFT);
        GridPane.setMargin(tailleField, new Insets(0, 0, 10, 0));


        //------poid-----
        this.poidField = new TextField();
        poidField.setPromptText("Poids en kg");
        add(poidField, 1, 2);
        GridPane.setHalignment(poidField, HPos.LEFT);
        GridPane.setMargin(poidField, new Insets(0, 0, 10, 0));


        //------age-----
        this.ageField = new TextField();
        ageField.setPromptText("age en années");
        add(ageField, 1, 3);
        GridPane.setHalignment(ageField, HPos.LEFT);
        GridPane.setMargin(ageField, new Insets(0, 0, 10, 0));


        //----radioButton----

        HBox sexHBox = new HBox();
        sexHBox.setSpacing(5);

        ToggleGroup sexChoice = new ToggleGroup();
        this.femaleRadioButton = new RadioButton("Femme");
        this.maleRadioButton = new RadioButton("Homme");

        femaleRadioButton.setToggleGroup(sexChoice);
        maleRadioButton.setToggleGroup(sexChoice);

        sexHBox.getChildren().addAll(femaleRadioButton, maleRadioButton);
        add(sexHBox, 1, 4);


        //------menuButton-----

        Label stileDeVie = new Label("Stile de vie");
        stileDeVie.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD, 20));
        add(stileDeVie, 1, 5);

        this.stileDeVieChoixBox = new ChoiceBox();
        stileDeVieChoixBox.getItems().addAll(LifeStyle.Sédentaire, LifeStyle.Peu_Actif, LifeStyle.Actif, LifeStyle.Fort_Actif, LifeStyle.Extrêmement_Actif);
        stileDeVieChoixBox.setPrefWidth(130);
        stileDeVieChoixBox.setPrefHeight(30);
        add(stileDeVieChoixBox, 1, 5);
    }

    public String getTfdTailleText() {
        return this.tailleField.getText();
    }

    public String getTfdPoidText() {
        return this.poidField.getText();
    }

    public String getTfdAgetext() {
        return this.ageField.getText();
    }

    public LifeStyle getLifeStyle() {
        return this.stileDeVieChoixBox.getValue();
    }

    public boolean isFemale() {
        return this.femaleRadioButton.isSelected();
    }

    public boolean isMale() {
        return this.maleRadioButton.isSelected();
    }

    public double getlifeStyleValue(LifeStyle lifeStyle) {
        return lifeStyle.getActivityLevel();
    }

    public void clear() {
        this.tailleField.clear();
        this.ageField.clear();
        this.poidField.clear();
        this.femaleRadioButton.setSelected(false);
        this.maleRadioButton.setSelected(false);
        this.stileDeVieChoixBox.setValue(null);

    }
    @Override
    public void registerObserver(Observer obs) {
        this.observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        this.observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : this.observers){
            observer.update();
        }
    }

}
