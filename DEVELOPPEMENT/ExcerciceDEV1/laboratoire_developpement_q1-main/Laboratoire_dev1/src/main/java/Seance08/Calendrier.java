/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance08;

import java.util.Scanner;

/**
 * ce programme est un programme qui quand on entre une date te présente en
 * sortie un calendrier à la date donnée
 *
 * @author alecw
 */
public class Calendrier {

    /**
     * Ceci est la méthode qui va lancer le programme et demander les données
     * utile et qui va ensuite lancer tout les autres méthodes en les appelants
     * pour qu'elle fasse ensemble le programme en sortie.
     *
     * @param args *
     */
    public static void main(String[] args) {
        int mois = introduireMois("introduisez le chiffre du mois : ", 1, 12);
        int année = introduireAnnée("Introduisez l'année sous forme AAAA : ", 0, 10000);

        afficherTitre(mois, année);
        afficherEntête();
        int nbJours = nombreJours(mois, année);
        int décalage = numéroJour(1, mois, année);
        afficherMois(décalage, nbJours);

    }

    /**
     * ici on va demander un entier qui va correspondre à l'année mais la
     * méthode est faite pour que si cela ne corresponde pas à une année va
     * demander à l'utilisateur l'introduction de l'entier Le nombre va se
     * retrouvée entre un min et un max
     *
     * @param message Le nombre saisi n'est pas un entier.
     * @param min 0
     * @param max 10000
     * @return il va retourner un entier entre 0 et 10000
     */
    public static int introduireAnnée(String message, int min, int max) {
        int entier = lireEntier(message);
        while (entier < min || entier > max) {
            System.out.println("L'année introduite est incomprehensible");
            entier = lireEntier(message);
        }
        return entier;
    }

    /**
     * cette methode va demander un entier de facon robuste c a d que si s'est
     * autre qu'un entier il va remettre la méthode en question.
     *
     * @param message xx
     * @return il va donc retourné un entier sans condition.
     */
    public static int lireEntier(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.println(message);
        while (!clavier.hasNextInt()) {
            clavier.next();
            System.out.println("Le nombre saisi n'est pas un entier.");
            System.out.println(message);
        }
        return clavier.nextInt();
    }

    /**
     * cette méthode à pour mais de lancer une demande d'introduction du numéro
     * du mois dans le programme de façon robuste.
     *
     * @param message xx
     *
     * @param min 1
     * @param max 12
     * @return Il va donc revenir un nombre entre 1 et 12
     */
    public static int introduireMois(String message, int min, int max) {
        int entier = lireEntier(message);
        while (entier < min || entier > max) {
            System.out.println("Le numéro du mois n'est pas compris entre " + min + " et " + max);
            entier = lireEntier(message);
        }
        return entier;
    }

    /**
     * cette methode en fonction du numero du mois introduit va afficher dans le
     * programme le nom du mois.
     *
     * @param mois xx
     *
     * @return Il va donc retournée une chaine de caractère qui se trouve etre
     * le nom du mois correspondant.
     */
    public static String nomMois(int mois) {
        String nom = null;
        switch (mois) {
            case 1:
                nom = "Janvier";
                break;
            case 2:
                nom = "Fevrier";
                break;
            case 3:
                nom = "Mars";
                break;
            case 4:
                nom = "Avril";
                break;
            case 5:
                nom = "Mai";
                break;
            case 6:
                nom = "Juin";
                break;
            case 7:
                nom = "Juillet";
                break;
            case 8:
                nom = "Aout";
                break;
            case 9:
                nom = "Septembre";
                break;
            case 10:
                nom = "Octobre";
                break;
            case 11:
                nom = "Novembre";
                break;
            case 12:
                nom = "Decembre";
                break;
            default:
                throw new IllegalArgumentException("Numéro du mois impossible " + mois);
        }
        return nom;
    }

    /**
     * Cette méthode va afficher le titre du calendrier.
     *
     * @param mois xx
     * @param année xx
     */
    public static void afficherTitre(int mois, int année) {
        if ((mois <= 0) || (mois > 12)) {
            throw new IllegalArgumentException("Le mois doit être compris entre  1 et 12");
        }
        System.out.println("==========================");
        System.out.println("      " + nomMois(mois) + " " + année + "   ");
        System.out.println("==========================");
    }

    /**
     * Cette méthode va afficher l'entete du calendrier.
     */
    public static void afficherEntête() {
        System.out.println("Lu  Ma  Me  Je  Ve  Sa  Di");
    }

    /**
     * cette methode va afficher les numeros de la semaine en fonction du mois
     * et de l'année avec les décalages et les nombres des jours adequoit.
     *
     * @param décalage xx
     * @param nombreJours xx
     */
    public static void afficherMois(int décalage, int nombreJours) {
        if ((décalage < 0) || (décalage > 6)) {
            throw new IllegalArgumentException("Le décalage doit être compris entre 0 et 6");
        }
        if ((nombreJours < 1) || (nombreJours > 31)) {
            throw new IllegalArgumentException("Le nombre de jour doit être compris entre 1 et 31");
        }
        for (int i = 0; i < décalage; i++) {
            System.out.print("    ");
        }
        for (int jour = 1; jour <= nombreJours; jour++) {
            if (jour < 10) {
                System.out.print("0" + jour + "  ");
            } else {
                System.out.print(jour + "  ");
            }
            if ((jour + décalage) % 7 == 0) {
                System.out.println("");
            }
        }
        System.out.println();
    }

    /**
     * Cette méthode va permettre de savoir si l'année est bissextiles ou non.
     *
     * @param année xx
     * @return Va retourner une valeur boolean false si L'année n'est pas
     * bissextiles et true elle l'est.
     */
    public static boolean estBissextile(int année) {
        return ((année % 4 == 0) && ((année % 100 != 0) || (année % 400 == 0)));
    }

    /**
     *
     * Cette méthode va retourner le nombre de jours qu'il ya dans le mois
     * introduit.
     *
     * @param mois xx
     * @param année xx
     * @return xx
     */
    public static int nombreJours(int mois, int année) {
        if ((mois <= 0) || (mois > 12)) {
            throw new IllegalArgumentException("Le mois doit être compris entre  1 et 12");
        }
        int nbJours = 31;
        if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            nbJours = 30;
        } else if (mois == 2) {
            if (estBissextile(année)) {
                nbJours = 29;
            } else {
                nbJours = 28;
            }
        }
        return nbJours;
    }

    /**
     *
     * Cette méthode va définir qu'elle jours est le premier du mois pour
     *
     * pouvoir savoir le nombre de decalage a afficher dans le calendrier.
     *
     *
     * @param jour xx
     * @param mois xx
     * @param année xx
     * @return x
     */
    public static int numéroJour(int jour, int mois, int année) {
        if ((mois < 1) || (mois > 12)) {
            throw new IllegalArgumentException("Numéro du mois incohérent " + mois);
        }
        if ((jour < 1) || (jour > nombreJours(mois, année))) {
            throw new IllegalArgumentException("Numéro du jour impossible pour ce mois " + jour + " " + mois);
        }
        int annéeCorrigée = année;
        int m = mois;
        int q = jour;

        if (mois == 1 || mois == 2) {
            annéeCorrigée = année - 1;
            m = mois + 12;
        }

        int j = annéeCorrigée / 100;
        int k = annéeCorrigée % 100;

        return (q + ((m + 1) * 13) / 5 + k + k / 4 + j / 4 + 5 * j + 5) % 7;
    }

}
