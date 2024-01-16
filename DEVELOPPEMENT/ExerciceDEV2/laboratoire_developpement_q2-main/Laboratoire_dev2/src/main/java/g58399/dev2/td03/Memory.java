package g58399.dev2.td03;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Memory {

    private Game game;

    /**
     * Ce constructeur prend en paramètre le nombre de paires de cartes du jeu
     * pour créer un jeu et initialiser l’attribut game.
     *
     * @param n nbres de carte du jeux.
     */
    public Memory(int n) {
        game = new Game(n);
    }

    /**
     * Lit un entier entré par l'utilisateur, de manière robuste. Demande une
     * nouvelle saisie tant qu'un entier n'est pas entré.
     *
     * @param message message à afficher à l'entrée.
     * @return l'entier saisi par l'utilisateur.
     */
    public static int demande(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.println(message);
        while (!clavier.hasNextInt()) {
            clavier.nextInt();
            System.out.println("Le nombre saisi n'est pas un entier.");
            System.out.println(message);
        }
        return clavier.nextInt();
    }

    /**
     * cette méthode demande à l’utilisateur une position de carte, affiche la
     * valeur de cette carte et retourne la position entrée par l’utilisateur.
     * Si la position ne correspond pas à une carte encore en jeu, un message
     * d’erreur est affiché et la méthode repose la question jusqu’à ce que ce
     * soit correct
     *
     * @return la position de la carte.
     */
    public int askPosition() {
        int minPos = 0;
        int maxPos = game.getSize() - 1;
        String message = "Entrez une position de carte (" + minPos + "à" + maxPos + ") :";
        int pos = demande(message);
        while (pos < minPos || pos > maxPos || !game.isCardHidden(pos)) {
            System.out.println("Cette carte n'est pas disponible !");
            pos = demande(message);
        }
        System.out.println("La valeur de la carte est : " + game.getCardValue(pos));
        return pos;
    }

    /**
     * cette méthode appelle les différentes étapes du jeu et retourne le nombre
     * de tours que le joueur a dû effectuer pour ramasser toutes les cartes.
     *
     * @return le nombre de tour.
     */
    public int playMemory() {
        int tours = 1;
        game.shuffle();
        while (!game.isGameOver()) {
            System.out.println(game);
            int pos1 = askPosition();
            int pos2 = askPosition();
            game.checkPositions(pos1, pos2);
            tours++;
        }
        return tours;
    }

    public static int ReadNbresPairs() {
        int min = 3;
        int max = 20;
        int nbrPairs = demande("Avec combien de pairs voulez-vous jouer ? (3 à 20)");
        while (nbrPairs < min || nbrPairs > max) {
            System.out.println("Sélectionnez un nombre valide de pairs !");
            nbrPairs = demande("Avec combien de paires voulez-vous jouer ? (3 à 20) ");
        }
        return nbrPairs;
    }

    public static void main(String[] args) {
        System.out.println("*** MEMORY***");
        int nbrPairs = ReadNbresPairs();
        Memory partie = new Memory(nbrPairs);
        int tours = partie.playMemory();
        System.out.println("Bravo vous avez gagné !");
        System.out.println("Vous avez terminez en " + tours + "tours !");
    }

}
