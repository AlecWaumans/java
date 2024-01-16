/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance12;

import java.util.Scanner;
import esi.dev1.util.Dictionnaire;

/**
 * Le mot le plus long est un jeu de lettres à deux joueurs qui se déroule en
 * plusieurs manches. Le nombre de manches est choisi au départ, par exemple 5
 * manches. Une manche se déroule en 2 étapes. Tout d’abord les joueurs, chacun
 * à leur tour, tirent au hasard soit une voyelle, soit une consonne (le score
 * choisit), jusqu’à obtenir 9 lettres. À chaque fois qu’une lettre est tirée
 * (voyelle ou consonne), la lettre est dévoilée aux joueurs afin qu’ils
 * puissent continuer en connaissance de cause.Ensuite les joueurs cherchent le
 * mot le plus long avec les lettres disponibles. Chaque score annonce la
 * longueur du mot trouvé. Celui qui a trouvé le mot le plus long le forme avec
 * les lettres disponibles. On vérifie alors que c’est bien un mot du
 * dictionnaire. Le score gagne autant de points que le nombre de lettres de son
 * mot.
 *
 * @author alecw
 *
 *
 */
public class LeMotLePlusLong {

    /**
     * point d'entrée de l'application permettant d'afficher sur le terminal le
     * jeu du mot le plus long.
     *
     * @param args aucun argument en ligne de commande n'est attendu.
     */
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le jeux le mot le plus long ");
        System.out.println("> > > Début de la partie");
        char[] lettres = demanderLettres();
        jouerUnCoup(lettres);
        String meilleurMot = meilleurMot(lettres);
        System.out.println("> > > Un des meilleurs mot est ");
        System.out.println("> > > " + meilleurMot);
        System.out.println("");
        System.out.println("> > > fin de partie");
        System.out.println("");

    }

    /**
     * Cette methode va tirer un nombre au hazard entre un maximum et un
     * minimum.
     *
     * @param min borne inférieur de la méthode
     * @param max borne superieur de la méthode
     * @return un nombre au hasard compris entre min et max reçus en paramètre.
     */
    public static int tirerHasard(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Le minimum doit être"
                    + "strictement inférieur au maximum" + min + " " + max);
        }
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Cette methode va tirer au hazard une voyelle parmis celle-ci :
     * {'A','E','i','O','U','Y'}
     *
     * @return une voyelle tirée au hasard.
     */
    public static char tirerVoyelle() {
        char[] voyelle = {'A', 'E', 'i', 'O', 'U', 'Y'};
        int indice = tirerHasard(0, voyelle.length - 1);
        return voyelle[indice];
    }

    /**
     * Retourne une voyelle tirée au hasard ('B', 'C', 'D', 'F', 'G',
     * 'H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Z').
     *
     * @return retourne une consonnes tirer au hasard.
     */
    public static char tirerConsonne() {
        char[] consonnes = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
            'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'};
        int indice = tirerHasard(0, consonnes.length - 1);
        return consonnes[indice];
    }

    /**
     * Cette methode va afficher toutes les lettres que l'utilisateur a tirer au
     * hasard.
     *
     * @param lettres c'est un tableau avec tout les caracteres tirées au
     * hasard.
     *
     */
    public static void afficherLettres(char[] lettres) {
        if (lettres == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        System.out.print("> > > Les Lettres que vous avez tirées sont : ");
        for (char lettre : lettres) {
            System.out.print(lettre + " ");
        }
        System.out.println("");
    }

    /**
     * Demande à l’utilisateur s’il veut une voyelle ou une consonne et en
     * fonction de la réponse de la réponse tire une voyelle ou une consonne. La
     * méthode affiche les lettres déjà tirées et répète la demande et le tirage
     * 9 fois. La méthode retourne un tableau de 9 caractères contenant les
     * lettres tirées.
     *
     * @return un tableau de 9 caractères contenant les lettres tirées.
     */
    public static char[] demanderLettres() {
        char[] lettres = new char[9];
        Scanner clavier = new Scanner(System.in);
        for (int i = 0; i < lettres.length; i++) {
            afficherLettres(lettres);
            System.out.println("> > > Tirez une consonne(o)?");
            boolean consonne = clavier.next().charAt(0) == 'o';
            char lettre;
            if (consonne) {
                lettre = tirerConsonne();
            } else {
                lettre = tirerVoyelle();
            }
            lettres[i] = lettre;
        }
        afficherLettres(lettres);
        return lettres;
    }

    /**
     * Demande à l'utilisateur le mot le plus long qu'il a trouvé.
     *
     * @return le mot donné par l'utilisateur.
     */
    public static String demanderMot() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("> > > Entrez le mot le plus long que vous avez trouvé ");
        return clavier.nextLine().toUpperCase();
    }

    /**
     * Vérifie que le mot proposé possède tout les lettres tirer au hasard.
     *
     * @param lettres lettres disponibles.
     * @param mot mot proposé.
     * @return true si le mot proposé possède tout les lettres disponible sinon
     * il retourne faux.
     */
    public static boolean VérifierLettres(char[] lettres, String mot) {
        if (lettres == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        if (mot == null) {
            throw new IllegalArgumentException("Le mot est null");
        }
        boolean estValide = true;
        int indiceMot = 0;
        char[] temp = copierTab(lettres);
        while (estValide && indiceMot < mot.length()) {
            char lettre = mot.charAt(indiceMot);
            estValide = estDans(lettre, temp);
            indiceMot++;
        }
        return estValide;
    }

    /**
     * Vérifie que le mot proposé se trouve dans le dictionnaire.
     *
     * @param mot dont il faut vérifier la presence dans le dictionnaire.
     * @return true si le mot est dans le dictionnaire sinon faux.
     */
    public static boolean dansDictionnaire(String mot) {
        if (mot == null) {
            throw new IllegalArgumentException("Le mot est null");
        }
        String[] dico = Dictionnaire.mots();
        boolean trouvé = false;
        int indice = 0;
        while (!trouvé && indice < dico.length) {
            trouvé = (mot.equals(dico[indice]));
            indice++;
        }
        return trouvé;
    }

    /**
     * Parcourt le dictionnaire à la recherche du mot le plus long faisable avec
     * les lettres disponibles. Si plusieurs motsTrouvés sont possible on en
     * choisit ici un seul.
     *
     * @param lettres lettres disponibles pour composer le mot le plus long.
     * @return mot le plus long faisable avec les lettres disponibles.
     */
    public static String meilleurMot(char[] lettres) {
        if (lettres == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        String[] dico = Dictionnaire.mots();
        String mot = " ";
        int indice = 0;
        while (indice < dico.length) {
            boolean trouvé = VérifierLettres(lettres, dico[indice]);
            if (trouvé && mot.length() < dico[indice].length()) {
                mot = dico[indice];
            }
            indice++;
        }
        return mot;
    }

    /**
     * Copie un tableau de caractères.
     *
     * @param lettres tableau à copier.
     * @return une copie du tableau.
     */
    @SuppressWarnings("ManualArrayToCollectionCopy")
    private static char[] copierTab(char[] lettres) {
        if (lettres == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        char[] copie = new char[lettres.length];
        for (int indice = 0; indice < lettres.length; indice++) {
            copie[indice] = lettres[indice];
        }
        return copie;
    }

    /**
     * Vérifie si le caractère est présent dans le tableau. Attention si le
     * caractère est présent, sa première apparition est remplacée dans le
     * tableau par le caractère espace. Le test est effectué sans tenir compte
     * de casse, un s minuscule est équivalent à un S majuscule.
     *
     * @param lettre caractère recherché.
     * @param tab tableau de caractères à fouiller.
     * @return true si le caractère est présent dans le tableau et faux sinon.
     */
    private static boolean estDans(char lettre, char[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        boolean estDans = false;
        int indice = 0;
        while (!estDans && indice < tab.length) {
            if (Character.toUpperCase(lettre) == Character.toUpperCase(tab[indice])) {
                tab[indice] = ' ';
                estDans = true;
            }
            indice++;
        }
        return estDans;
    }

    /**
     * Permet à un score de proposer un mot avec les lettres tirées au hasard.
     * Si le mot proposé n'est pas possible avec les lettres tirées ou si le mot
     * n'est pas dans le dictionaire, le score doit faire une nouvelle
     * proposition. La méthode retourne le score du mot. Le score est la
     * longueur du mot.
     *
     * @param lettres lettres tirées au hasard.
     * @return le score associé au mot, sa longueur.
     */
    private static void jouerUnCoup(char[] lettres) {
        if (lettres == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        boolean estValide = false;
        boolean existe = false;
        String mot;
        while (!estValide || !existe) {
            mot = demanderMot();
            estValide = VérifierLettres(lettres, mot);
            if (!estValide) {
                System.out.println("> > > > Le mot proposé n'est pas possible "
                        + "avec les lettres tirées.");
            }
            existe = dansDictionnaire(mot);
            if (!existe) {
                System.out.println("> > > > Le mot proposé n'est pas dans "
                        + "le dictionnaire.");
            }
        }

    }
}
