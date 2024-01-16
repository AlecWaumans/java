package g58399.dev2.td01;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Memory {

    /**
     * C'est ici que le jeu va s'initialiser et va lancer le jeux avec la
     * demande de combien de paire de cards l'utilisateur veux jouer.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("*** MEMORY ***");
        Scanner clavier = new Scanner(System.in);
        System.out.println(" >>> Avec combien de paires voulez-vous jouer ? (3 à 20):");
        int n = clavier.nextInt();
        int NbreDeManche = playMemory(n);
        System.out.println("Félicitation,Vous avez gangez !! ");
        System.out.println("Partie terminée en " + NbreDeManche + " coups");
    }

    /**
     * Cette methode va nous permettre d'initialiser un tableau de n* 2 longueur
     * et va incrementer en sautant de position pour faire 11223344
     *
     * @param n la longueur du tableau donnée en paramètre.
     * @return va retourner un tab de n longeur avec des doublons qui
     * s'incremente a chaque tour.
     */
    public static int[] initCards(int n) {
        if (n < 3 || n > 20) {
            throw new IllegalArgumentException("LE nombre doit etre entre 3 et 20");
        }
        int[] tab = new int[n * 2];
        int a = 1;
        for (int i = 0; i < tab.length; i = i + 2) {
            tab[i] = a;
            tab[i + 1] = a;
            a++;
        }
        return tab;
    }

    /**
     * Cette methode va afficher correctement le tableau a la fin.
     *
     * @param tab Le tableau qui est mise en paramettre via la classe main.
     */
    public static void afficherTabint(int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        System.out.print("[ ");
        for (int element : tab) {
            System.out.print(element + ", ");
        }
        System.out.println("]");
    }

    /**
     * Cette methode va afficher correctement le tableau a la fin.
     *
     * @param tab Le tableau qui est mise en paramettre via la classe main.
     */
    public static void afficherTabBoolean(boolean[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        System.out.print("[ ");
        for (boolean element : tab) {
            System.out.print(element + ", ");
        }
        System.out.println("]");
    }

    /**
     * ici la methode va demander une valeur et va verifiée si la valeur entrée
     * est un entier.
     *
     * @return la méthode va retournée un entier.
     */
    public static int getIntFromKeyboard() {
        Scanner clavier = new Scanner(System.in);
        boolean checkKeyboard = clavier.hasNextInt();
        while (checkKeyboard == false) {
            System.out.println("Le nombre saisi n'est pas un entier !!!");
            clavier.next();
            checkKeyboard = clavier.hasNextInt();
        }
        return clavier.nextInt();
    }

    /**
     * Cette methode va demander la pos qu'il choisis et affiche la valeur de la
     * pos si la pos ne correspond pas il envoie un message d'erreur et repose
     * la question en lecture robuste.
     *
     * @param cards tableau de carte deja initialisée
     * @param collectedCards tableau de valeur false partout
     * @return va retourner la position du tableau choisis.
     */
    public static int askPosition(int[] cards, boolean[] collectedCards) {
        if (cards == null || cards.length == 0) {
            throw new IllegalArgumentException("Le tableau de carte est vide ou null");
        }
        if (collectedCards == null || collectedCards.length == 0) {
            throw new IllegalArgumentException("Le tableau de boolean est vide ou null");
        }

        int longeur = cards.length - 1;
        String message = ("Entrez une position de carte (0 à " + longeur + " ):");
        System.out.println(message);

        int pos = getIntFromKeyboard();// va demander la valeur dans cette méthode
        if (pos < 0 || pos > longeur) {
            throw new IllegalArgumentException("ce numéro ne correspond pas a un numéro de carte");
        }
        while (collectedCards[pos] != false) { // cette boucle va verifier si il a pas 
            // déjà été choisis si non va la redemander en boucle. 
            System.out.println("Cette carte est déjà retournée !!!");
            pos = getIntFromKeyboard();
        }

        //boolean check = clavier.hasNextInt();        
        //int pos = clavier.nextInt();
        //while (check == false || collectedCards[pos] != false) {
        //    System.out.println("Le nombre saisi n'est pas un entier ou cette carte est déja retourner");
        //    System.out.println(message);
        //    check = clavier.hasNextInt();
        //    pos = clavier.nextInt();
        //}
        return pos;
    }

    /**
     * Cette méthode va nous permettre de checker si la premiere carte est la
     * meme que la deuxième selectionnée si oui dans le tableau de boolean les
     * deux positions devienne true.
     *
     * @param cards C'est le tableau de carte donnée dans la méthode initCards
     * @param collectedCards C'est le tableau copiée du tab de carte mais en
     * valeur boolean donnée par la méthode initCards
     * @param pos1 valeur demander a l'utilisateur et vérifié avec les deux
     * méthodes getIntFromKeyboard et askPositions
     * @param pos2 valeur demander a l'utilisateur et vérifié avec les deux
     * méthodes getIntFromKeyboard et askPositions
     */
    public static void checkPositions(int[] cards, boolean[] collectedCards, int pos1, int pos2) {
        if (cards == null || cards.length == 0) {
            throw new IllegalArgumentException("Le tableau de carte est vide ou null");
        }
        if (collectedCards == null || collectedCards.length == 0) {
            throw new IllegalArgumentException("Le tableau de boolean est vide ou null");
        }
        if (pos1 == pos2) {
            throw new IllegalArgumentException("Vous avez choisis deux fois la même carte" + pos1 + pos2);
        }
        if (cards[pos1] == cards[pos2]) {
            System.out.println("Vous avez trouvé les deux cartes correspondes ! ");
            collectedCards[pos1] = true;
            collectedCards[pos2] = true;
        } else {
            System.out.println("Ces deux cartes ne sont pas les même veuillez recommencer");
        }
    }

    /**
     * Cette méthode va permettre de savoir si toute les cartes sont retournée
     * si oui donc si tout le tableau des valeurs boléenne sont = à truee cela
     * veut dire que toute les cartes sont retournée et que donc la partie est
     * fini.
     *
     * @param collectedCards C'est le tableau copiée du tab de carte mais en
     * valeur boolean donnée par la méthode initCards
     * @return va retournée true si toute les cartes sont retournée et false
     * dans le cas contraire.
     */
    public static boolean isGameOver(boolean[] collectedCards) {
        if (collectedCards == null || collectedCards.length == 0) {
            throw new IllegalArgumentException("Le tableau de boolean est vide ou null");
        }
        boolean isGameOver = false;
        for (int i = 0; i < collectedCards.length; i++) {
            if (collectedCards[i] == true) {
                isGameOver = true;
            } else {
                isGameOver = false;
            }
        }
        return isGameOver;
    }

    /**
     * Cette méthode va lancée une partie et la terminée grace a tout les
     * appelles de methodes ci-dessus et va compter le nombre de manche et va
     * retournée le nombre de manche.
     *
     * @param n c'est le nombre de pair de carte qui a été demander a
     * l'utilisée.
     * @return retourne un nombre qui correspond au nombre de manche.
     */
    public static int playMemory(int n) {
        int[] cards = initCards(n);
        boolean[] collectedCards = new boolean[n * 2];
        shuffle(cards);
        int NbreDeManche = 0;
        boolean FinDeJeux = isGameOver(collectedCards);
        while (FinDeJeux == false) {
            NbreDeManche++;
            afficherTabint(cards);
            afficherTabBoolean(collectedCards);
            displayCards(cards, collectedCards);
            System.out.println("*** tour " + NbreDeManche);
            int pos1 = askPosition(cards, collectedCards);
            System.out.println("La carte en position " + pos1 + " est un " + cards[pos1]);
            int pos2 = askPosition(cards, collectedCards);
            System.out.println("La carte en position " + pos2 + " est un " + cards[pos2]);
            checkPositions(cards, collectedCards, pos1, pos2);
            FinDeJeux = isGameOver(collectedCards);
        }
        return NbreDeManche;
    }

    /**
     * Affiche l'état actuel des cartes. Une carte ramassées est indiquée par sa
     * valeur. Un "?" indique une carte pas encore ramassée.
     *
     * @param cards les cartes.
     * @param collectedCards indique quelles cartes ont été ramassées.
     */
    public static void displayCards(int[] cards, boolean[] collectedCards) {
        System.out.print("Les cartes: ");
        for (int i = 0; i < collectedCards.length; i++) {
            System.out.print((collectedCards[i] ? cards[i] : "?") + " ");
        }
        System.out.println();
    }

    /**
     * cette méthode va nous permettre de melanger le tableau afin que
     *
     * @param cards
     */
    public static void shuffle(int[] cards) {
        if (cards == null || cards.length == 0) {
            throw new IllegalArgumentException("Le tableau de carte est vide ou null");
        }
        Random rd = new Random(); // crée un object de la class random
        for (int i = cards.length - 1; i > 0; i--) { // chaque élément en commencants par la fin
            int j = rd.nextInt(i + 1); // crée une variable qui est prise aléatoirement
            int temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }

    }
}
