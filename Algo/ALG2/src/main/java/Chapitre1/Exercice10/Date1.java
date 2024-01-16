package Chapitre1.Exercice10;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Date1 {

    private int jours;
    private int mois;
    private int année;

    public Date1(int jours, int mois, int année) {
        this.année = année;
        this.mois = mois;
        this.jours = jours;
    }

    public int getJours() {
        return this.jours;
    }

    public int getMois() {
        return this.mois;
    }

    public int getAnnée() {
        return this.année;
    }
    public static Date1 Aujourdhui() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduisez le jours actuel");
        int jours = clavier.nextInt();
        System.out.println("Introduisez le mois actuel");
        int mois = clavier.nextInt();
        System.out.println("Introduisez l'année actuel");
        int année = clavier.nextInt();

        Date1 adj = new Date1(jours, mois, année);

        return adj;
    }
    

    @Override
    public String toString() {
        return "Date{" + jours + "/" + mois + "/" + année + '}';
    }

}
