package Chapitre5;

/**
 *
 * @author alecw
 */
public class Exercice1 {

    public static final int TAILLE_PLATEAU = 64;
    public static final int NB_JOUEURS = 4;

    private static int[] plateau;
    private static int[] posJoueurs;

    /*
    Exercice1)
    
    1) Tab. de taille 64 ?
        - 64 cases prend de la place en mémoire (mais ça n'est pas très grave, car la performance et la taille 
            des mémoires Ram actuelles, ça n'impactera pas beaucoup les performances du programme ...).
            + Facile de déterminer si une case i est occupée ou pas :
            on regarde en position i dans le tableau de taille 64.
        - comment représenter le fait qu'au début, chaque joueir est sur la case 1 ? 
    
    
    2) Tab. de taille 4 ?
        +4 cases, ça prend peu de place.
        - si un joueur joue et arrive sur une case après avoir jeter le dé, comment savoir si cette case est occupé ?
        -> je dois parcourir le tableau de taille 4.
    
    3) Une combinaison des 2 ?
        - "Beaucoup" d'espace mémoire utilisé
        + on peut facilement déterminer si une case est occupée 
        (on va voir dans le tab. de taille 64) et on détermine facilement la position d'un joueur 
        (on va voir dans le tableau la taille 4). 
     */
 /*
    Etapes de l'algorithme : 
    
    1) Initialiser les 2 tableaux.
    
    2) Créer "int jeterDé()" qui renvoie un nombre de 1 à 6 
    (Le résultat de jet de dé).
    
    3) Tant que le jeu n'est pas fini ( un joueur n'a pas atteint la case 64):
     - jeter le dé, 
     - faire avancer le joueur courant,
     - vérifier que la case n'est pas occupée. 
     - si elle l'est, avancer le joueur courant jusqu'à la premiere case libre. 
     - passer au joueur suivant.
    
    4) afficher le gagnant à l'écran. 
     */
    public static void main(String[] args) {
        int joueurCourants = 0;
        initialiserTab();
        
        while(!isGameOver()){
            
        }
    }

    private static void initialiserTab() {
        plateau = new int[TAILLE_PLATEAU];
        posJoueurs = new int[NB_JOUEURS];

        for (int i = 0; i < NB_JOUEURS; i++) {
            posJoueurs[i] = 1;
        }
    }

    private static int jeterDé() {
        return 1 + (int) (6 * Math.random());
    }

    private static boolean isGameOver() {
        for (int i = 0; i < NB_JOUEURS; i++) {
            if (posJoueurs[i] >= TAILLE_PLATEAU - 1) {
                return true;
            }
        }
        return false;
    }
}
