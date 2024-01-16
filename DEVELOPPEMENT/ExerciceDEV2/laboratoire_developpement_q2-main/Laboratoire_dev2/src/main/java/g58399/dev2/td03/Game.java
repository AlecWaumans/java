package g58399.dev2.td03;

import java.util.Random;

/**
 *
 * @author alecw
 */
public class Game {

    private Card[] cards; //tableau reprenant toutes les cartes du jeu en cours.

    /**
     * Crée un jeu de cartes composé de 3 à 20 paires.
     *
     * @throws IllegalArgumentException si les paires ne sont pas comprises
     * entre 3 et 20.
     * @param n Nombre de paires de cartes.
     */
    public Game(int n) {
        if (n < 3 && n > 20) {
            throw new IllegalArgumentException("Le nombre de pair doit être compris entre 3 et 20");
        }
        cards = new Card[n * 2];
        int a = 1;
        for (int i = 0; i < 2 * n; i = i + 2) {
            cards[i] = new Card(a);
            cards[i + 1] = new Card(a);
            a++;
        }
    }

    /**
     * cette méthode mélange les cartes.
     *
     * array[] c'est le tableau avec les valeurs des cartes creer dans le
     * constructeur.
     */
    public void shuffle() {
        Card[] array = this.cards;
        Random rd = new Random(); // crée un object de la class random
        for (int i = array.length - 1; i > 0; i--) { // chaque élément en commencants par la fin
            int j = rd.nextInt(i + 1); // crée une variable qui est prise aléatoirement
            swap(array, i, j);
        }
    }

    /**
     * Échange le contenu de deux cases de tableau. Échange dans le tableau
     * <code>array</code> le contenu des cases en positions <code>pos1</code> et
     * <code>pos2</code>. Ces 2 positions sont supposées correctes.
     *
     * @param array le tableau dont on échange 2 cases.
     * @param pos1 la position de la première case à échanger.
     * @param pos2 la position de la seconde case à échanger.
     * @throws IllegalArgumentException si au moins une des positions est
     * strictement négative.
     */
    public void swap(Card[] array, int pos1, int pos2) {
        if (pos1 < 0 || pos2 < 0) {
            throw new IllegalArgumentException("les positions doivent être des "
                    + "entiers positifs " + pos1 + " " + pos2);
        }
        Card savedValue = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = savedValue;
    }

    /**
     * Donne le nombre de cartes dans le jeu.
     *
     * @return Longueur du jeu.
     */
    public int getSize() {
        return cards.length;
    }

    /**
     * Donne la qualité cachée d'une carte précise dans le jeu.
     *
     * @param pos La position d'une carte dans le jeu.
     * @return Si la carte donnée est cachée ou pas.
     */
    public boolean isCardHidden(int pos) {
        return cards[pos].isHidden();
    }

    /**
     * cette methode va nous servir a redonnée la valeur de la carte a une
     * position donnée.
     *
     * @param pos de la carte dont on veut sa valeur
     * @return la valeur de la carte a pos.
     */
    public int getCardValue(int pos) {
        return cards[pos].getvalue();
    }

    /**
     * Cette méthode va vous dire si deux valeurs selectionnée dans le tableau
     * sont les mêmes.
     *
     * @param pos1 la position de la premiere card
     * @param pos2 la position de la deuxieme card
     * @return true si les deux cartes ont la même valeur et false dans le cas
     * contraire.
     */
    public boolean checkPositions(int pos1, int pos2) {
        if (pos1 == pos2) {
            throw new IllegalArgumentException("vous avez choisis la même position");
        }
        if (cards[pos1].equals(cards[pos2])) {
            cards[pos1].reveal();
            cards[pos2].reveal();
            return true;
        }
        return false;
    }

    /**
     * Vérifie si le jeu est terminé ou pas. On le considère terminé quand
     * toutes les cartes sont retournées.
     *
     * @return Si le jeu est terminé.
     */
    public boolean isGameOver() {
        boolean FinDePartie = true;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].isHidden()) {
                FinDePartie = false;
            }
        }
        return FinDePartie;
    }

    /**
     * Représentation textuelle du jeu de cartes avec les cartes cachées et
     * révélées.
     *
     * @return La représentation du jeu.
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Card c : cards) {
            str.append(c.toString()).append(" ");
        }
        return str.toString();
    }

    /**
     * Compare deux jeux de cartes.
     *
     * @param o Un autre objet à comparer.
     * @return Si deux jeux ont des cartes de même valeur, dans le même ordre.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Game game = (Game) o;

        if (this.getSize() != game.getSize()) {
            return false;
        }

        for (int i = 0; i < this.getSize(); i++) {
            if (this.getCardValue(i) != game.getCardValue(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        for (Card c : cards) {
            hash += c.getvalue() * 3;
        }
        return hash;
    }
}
