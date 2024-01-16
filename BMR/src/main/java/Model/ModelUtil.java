package Model;


import disignPattern.Observable;
import disignPattern.Observer;

import java.util.ArrayList;

public class ModelUtil implements Observable {
    private double bmrMen;
    private double bmrWomen;
    private double calories;
    private double weight;
    private double taille;
    private double age;
    private double activityLevel;
    private ArrayList<Observer> observers;

    public ModelUtil() {
        this.bmrMen = 0;
        this.bmrWomen = 0;
        this.calories = 0;
    }

    public double getBmrMen() {
        return this.bmrMen;
    }

    public double getBmrWomen() {
        return this.bmrWomen;
    }

    public double getCalories() {
        return this.calories;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSize(double taille) {
        this.taille = taille;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setActivityLevel(double activityLevel) {
        this.activityLevel = activityLevel;
    }

    public void setcalCalculatorMen() {
        this.calories = this.bmrMen * this.activityLevel;
        //notifyObservers();
    }

    public void setcalCalculatorWomen() {
        this.calories = this.bmrWomen * this.activityLevel;
        //notifyObservers();
    }

    public void setbmrCalulatorMen() {
        this.bmrMen = (13.7 * this.weight) + (5 * this.taille) - (6.8 * this.age) + 66;
        //notifyObservers();
    }

    public void setbmrCalculatorWomen() {
        this.bmrWomen = (9.6 * this.weight) + (1.8 * this.taille) - (4.7 * this.age) + 655;
        //notifyObservers();
    }
    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }



}

