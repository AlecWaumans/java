package g58399.dev2q2.S3;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice3LectureMultiple {

    public static void main(String[] args) {
        //System.out.println("La somme de toute les valeurs se trouve être " + sommeLectureMultiple());
        //System.out.println("La somme de toute les valeurs se trouve être " + sommeLectureMultipleV2());
        System.out.println(demandeLectureMin(10));
        System.out.println("min max");
        System.out.println(demandeLectureMinMax(10, 20));
        System.out.println(demandeLectureBoolean("Voulez vous couchez avec moi "));
    }

    public static int demandeLecture(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.println(message);
        while (!clavier.hasNextInt()) { // si l'entrée n'est pas saisie n'est pas un entier. 
            clavier.next();// on n'en fais rien, on attend une nouvelle entrez
            System.out.println("Ceci n'est pas un entier");
            System.out.println(message);
        }
        return clavier.nextInt();
    }

    public static int demandeLectureMin(int min) {
        int valeur = demandeLecture("Entrez un numéro : ");
        while (valeur < min) {
            System.out.println("Cette valeurs est en dessouds du min");
            valeur = demandeLecture("Entrez une valeur ");
        }
        return valeur;
    }

    public static int demandeLectureMinMax(int min, int max) {
        int valeur = demandeLecture("Entrez un numéro : ");
        while (valeur > max || valeur < min) {
            System.out.println("Cette valeurs est en dessouds du min ou au dessuds de max");
            valeur = demandeLecture("Entrez une valeur ");
        }
        return valeur;
    }

    public static String demandeLectureString(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.println(message);
        while (!clavier.hasNextLine()) {
            clavier.next();
            System.out.println("Ceci n'est pas une chaine de caractere ou un caractere");
            System.out.println(message);
        }
        return clavier.nextLine();
    }

    public static boolean demandeLectureBoolean(String message) {
        System.out.println(message);
        String reponseUtilisateur = demandeLectureString("Entrez y/n ");
        String reponseUtilisateurLower = reponseUtilisateur.toLowerCase();
        if (reponseUtilisateurLower.equals("y") || reponseUtilisateurLower.equals("yes")) {
            return true;
        } else if (reponseUtilisateurLower.equals("n") || reponseUtilisateurLower.equals("no")) {
            return false;
        }
        return false;
    }

    public static int sommeLectureMultiple() {
        int somme = 0;
        int sentinelle = -1;
        int nbsValeurs = 0;
        int valeur = 0;
        while (valeur != sentinelle) {
            somme = valeur + somme;
            valeur = demandeLecture("Entrez un numero : ");
            nbsValeurs++;
        }
        System.out.println("Vous avez entrez " + nbsValeurs);
        return somme;

    }

    public static int sommeLectureMultipleV2() {
        int somme = 0;
        int nbsValeursTotales = demandeLecture("Entrez le nombre de valeurs totale : ");
        int nbsValeurs = 0;
        int valeur = 0;
        while (nbsValeurs < nbsValeursTotales) {
            valeur = demandeLecture("Entrez un numero : ");
            somme = valeur + somme;
            nbsValeurs++;
        }
        System.out.println("Vous avez entrez " + nbsValeurs);
        return somme;

    }
}
