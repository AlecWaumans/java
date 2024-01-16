/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance11;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class TableauUtil {

    /**
     * Cette classe est un regroupement de plus calcul effectuer dans un tableau
     * tels que la moyenne, le minimum, le maximum, la somme , la copie du
     * tableau.
     *
     * @param args pas utiliser ici;
     */
    public static void main(String[] args) {
        double[] tab = {-1.34, 2.123, 3.45, 4.56, 5.56};
        System.out.println("Le minimum du tableau est : " + min(tab));
        System.out.println("Le maximum du tableau est : " + max(tab));
        System.out.println("La somme de tout les éléments du tableau est : " + somme(tab));
        System.out.println("La moyenne du tableau est : " + moyenne(tab));
        System.out.print("La copie du tableau est : ");
        afficherTab(copie(tab));
        System.out.println("L'élément le plus grand est : " + indiceMax(tab));
        System.out.println("Le tableau est un ordre croissant : " + estTrié(tab));
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la valeur : ");
        int valeur = clavier.nextInt();
        int[] tab2 = {1, 2, 3, 4, 5};
        System.out.println(indice(tab2, valeur));
        String[] tab3 = {"Alec", "Nathan", "Anatole", "Juliette"};
        System.out.println("untroduizer le mot : ");
        String mot = clavier.nextLine();
        System.out.println(contient(tab3, mot));
        System.out.println("Introduisez une autre valeur ainsi que son approximation : ");
        double valeur2 = clavier.nextDouble();
        double approximation = clavier.nextDouble();
        System.out.println(contient2(tab, valeur2, approximation));
        System.out.println(doublons(tab2));
        System.out.println(nbNégatifs(tab));
        System.out.println("introduisez les deux indices : ");
        int indice1 = clavier.nextInt();
        int indice2 = clavier.nextInt();
        afficherTab(tab);
        échange(tab, indice1, indice2);
        afficherTab(tab);
        System.out.println("Utilisons la methodes inverser");
        //afficherTab(tab);
        //inverser(tab);
        //afficherTab(tab);
        System.out.println("Utilisons la methodes mins");
        indicesMin(tab);
        afficherTab(tab);
    }

    /**
     * Cette methode va trouver l'élément le plus petit du tableau.
     *
     * @param tab Le tableau mise en paramettre qui est cité dans le main
     * @return va retourner une valeur qui est l'élément le plus petit du
     * tableau.
     */
    public static double min(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }

        double min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        return min;
    }

    /**
     * Cette methode va trouver l'élément le plus grand du tableau.
     *
     * @param tab Le tableau mise en paramettre qui est cité dans le main.
     * @return va retourner une valeur qui est l'élément le plus grand du
     * tableau.
     */
    public static double max(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }

        double max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return max;
    }

    /**
     * Cette methode va calculer la somme de tout les éléments du tableau.
     *
     * @param tab Le tableau mise en paramettre qui est cité dans le main.
     * @return Va retourner la somme de tout les élément toutes les valeurs du
     * tableau mise en entrez.
     */
    public static double somme(double[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }

        double somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme = somme + tab[i];
        }
        return somme;
    }

    /**
     * Cette methode va calculer la moyenne de tout les éléments du tableau.
     *
     * @param tab Le tableau mise en paramettre qui est cité dans le main.
     * @return Va retourner la moyenne de tout les valeurs du tableaus mise en
     * paramettre.
     */
    public static double moyenne(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }

        double moyenne = 0;
        double somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme = somme + tab[i];
        }
        moyenne = somme / tab.length;
        return moyenne;
    }

    /**
     * Cette methode va copié le tableau mise en paramettre et l'afficher sur
     * l'output;
     *
     * @param tab tableau mise en paramettre via la methode main.
     * @return la methode va retourner une copie du tableau mis en paramettre.
     */
    public static double[] copie(double[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }

        double[] copie = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            copie[i] = tab[i];
        }
        return copie;
    }

    /**
     * Cette methode va afficher correctement le tableau a la fin.
     *
     * @param tab Le tableau qui est mise en paramettre via la classe main.
     */
    public static void afficherTab(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }

        System.out.print("[ ");
        for (double element : tab) {
            System.out.print(element + ", ");
        }
        System.out.println("]");
    }

    /**
     * Cette methode va trouver l'indice de l'element le plus elever dans le tab
     *
     * @param tab Le tableau qui est mise en paramettre via la classe main.
     * @return va retourner l'indice de l'élément le plus elevée.
     */
    public static int indiceMax(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        int indiceMax = 0;
        double max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
                indiceMax = i;
            }
        }
        return indiceMax;
    }

    /**
     * Cette methode va nous dire si oui ou non le tableau est trier par ordre
     * croissant.
     *
     * @param tab Le tableau qui est mise en paramettre via la classe main.
     * @return va retourner si c'est vrai ou pas si le tab est bien croissant.
     */
    public static boolean estTrié(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        boolean estTrié = true;
        int i = 1;
        while (i < tab.length && estTrié) {
            estTrié = tab[i] > tab[i - 1];
            i++;
        }
        return estTrié;
    }

    /**
     * Cette methode va dire si la valeur entrez en paramettre est present dans
     * le tableau entrée en paramettre.
     *
     * @param tab Le tableau qui est mise en paramettre via la classe main.
     * @param valeur LA valeur est entrée par un scanner dans le main
     * @return retourne la position de l'element qui correspond dans le tableau
     * si il y en a pas il dit une exeption avec une message d'erreur.
     */
    public static int indice(int[] tab, int valeur) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        int indice = 0;
        boolean aTrouvé = false;
        int i = 0;
        while (i < tab.length && !aTrouvé) {
            if (valeur == tab[i]) {
                indice = i;
                aTrouvé = true;
            }
            i++;
        }
        if (!aTrouvé) {
            throw new IllegalArgumentException("La valeur " + valeur + "n'est pas dans le tableau");
        }
        return indice;
    }

    /**
     * Cette methode va dire si la chaine de caractère entrez en paramettre est
     * present dans le tableau entrée en paramettre.
     *
     * @param tab Le tableau qui est mise en paramettre via la classe main.
     * @param mot introduis dans le main par une lecture au clavier.
     *
     * @return retourne la position de l'element qui correspond dans le tableau
     *
     */
    public static boolean contient(String[] tab, String mot) {
        Scanner clavier = new Scanner(System.in);
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }

        boolean contient = false;
        int i = 0;
        while (i < tab.length && !contient) {
            contient = tab[i].equals(mot);
            i++;
        }
        return contient;
    }

    /**
     * Cette methode va voir si la valeur ou son approximation ce trouve dans le
     * tableau.
     *
     * @param tab Le tableau qui est mise en paramettre via la classe main.
     * @param valeur valeur demander dans le main avec une lecture clavier
     * @param erreur l'erreur est l'approximation
     * @return va nous retourner si oui ou non il y est.
     */
    public static boolean contient2(double[] tab, double valeur, double erreur) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        boolean contient2 = false;
        int i = 0;
        while (i < tab.length && !contient2) {
            contient2 = Math.abs(tab[i] - valeur) <= erreur;
            i++;
        }
        return contient2;

    }

    /**
     * Cette methode va nous dire si oui ou non il y a des doublons dans le
     * tableau.
     *
     * @param tab Le tableau qui est mise en paramettre via la classe main.
     * @return retourne vrai si il y a des doublosn dans le tab sinon faux.
     */
    public static boolean doublons(int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        boolean aDoublons = false;
        int i = 0;
        while (i < tab.length && !aDoublons) {
            int j = 0;
            while (j < tab.length && !aDoublons) {
                aDoublons = (tab[i] == tab[j] && i != j);
                j++;
            }
            i++;
        }
        return aDoublons;
    }

    /**
     * Cette methode va compter le nombre d'élément négatifs du tableau.
     *
     * @param tab Le tableau qui est mise en paramettre via la classe main.
     * @return va retourner le nombre d'élément negatifs du tableau.
     */
    public static int nbNégatifs(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        int nbNégatifs = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                nbNégatifs++;
            }
        }
        return nbNégatifs;
    }

    /**
     * Va echanger les élément a la position 1 et 2 du tableau.
     *
     * @param tab Le tableau qui est mise en paramettre via la classe main.
     * @param indice1 l'indice est demander dans le main avec une lecture
     * clavier.
     * @param indice2 l'indice est demander dans le main avec une lecture
     * clavier.
     */
    public static void échange(double[] tab, int indice1, int indice2) {
        if (tab == null || tab.length == 0 || tab.length == 1 || tab.length == 2) {
            throw new IllegalArgumentException("Le tableau est vide ou null ou Le tableau ne contient pas autant d'élément");
        }
        tab[1] = indice1;
        tab[2] = indice2;
    }

    /**
     * Inverse l'ordre des éléments du tableau passé en paramètre.
     *
     * @param tab tableau dont on change la place de certains éléments.
     */
    public static void inverser(double[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        for (int i = 0; i < tab.length / 2; i++) {
            tab[tab.length - i] = tab[i];
        }
    }

    /**
     * Retourne un tableau contenant les indices des minimums. Le nombre
     * d'élements du tableau retourné est le nombre de minimum présent dans le
     * tableau initial (et non la taille du tableau initial).
     *
     * @param tab tableau de double dont on cherche les minimums.
     * @return un tableau contenant les indices des minimums.
     */
    public static int[] indicesMin(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        double minValue = tab[0];

        int[] indices = new int[tab.length];
        indices[0] = 0;
        int j = 1;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] <= minValue) {
                if (tab[i] < minValue) {
                    minValue = tab[i];
                    j = 0;
                }
                indices[j] = i;
                j++;
            }
        }
        return reduction(j, indices);
    }

    /**
     * Retourne une partie du tableau donné en paramètre. Si un tableau de
     * taille 10 est donné en paramètre et que la taille du tableau de sortie
     * est de 4, le tableau de sortie a une taille de 4 et contiend les 4
     * premiers éléments du tableau.
     *
     * @param taille taille du tableau de sortie.
     * @param tab tableau à racourcir.
     * @return retourne une partie du tableau donné en paramètre.
     */
    private static int[] reduction(int taille, int[] tab) {
        int[] réduit = new int[taille];
        for (int i = 0; i < taille; i++) {
            réduit[i] = tab[i];
        }
        return réduit;
    }

}
