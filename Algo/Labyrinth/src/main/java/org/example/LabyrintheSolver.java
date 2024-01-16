package org.example;

public class LabyrintheSolver {

    // Structure représentant les directions possibles
    static class Acces {
        boolean gauche, droite, haut, bas;

        public Acces(boolean gauche, boolean droite, boolean haut, boolean bas) {
            this.gauche = gauche;
            this.droite = droite;
            this.haut = haut;
            this.bas = bas;
        }
    }

    // Méthode pour afficher le chemin menant à la sortie du labyrinthe
    public static void afficherChemin(Acces[][] lab, int x, int y, String chemin) {
        if (x < 0 || x >= lab.length || y < 0 || y >= lab[0].length || !lab[x][y].droite && !lab[x][y].gauche && !lab[x][y].haut && !lab[x][y].bas) {
            // Sortie du labyrinthe ou case bloquée, retourner
            return;
        }

        // Marquer la case comme visitée
        lab[x][y] = new Acces(false, false, false, false);

        // Ajouter la direction actuelle au chemin
        System.out.println("Déplacer vers " + chemin);

        // Explorer les directions possibles récursivement
        afficherChemin(lab, x + 1, y, "bas");
        afficherChemin(lab, x - 1, y, "haut");
        afficherChemin(lab, x, y + 1, "droite");
        afficherChemin(lab, x, y - 1, "gauche");
    }

    public static void main(String[] args) {
        // Initialiser le labyrinthe
        Acces[][] lab = new Acces[10][10];

        // Exemple de labyrinthe (true signifie qu'il y a un passage)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                lab[i][j] = new Acces(true, true, true, true);
            }
        }

        // Bloquer certaines cases pour créer un labyrinthe
        lab[1][2].droite = false;
        lab[2][2].gauche = false;
        lab[2][2].bas = false;
        lab[3][2].haut = false;
        lab[3][2].bas = false;
        lab[3][3].gauche = false;
        lab[4][2].bas = false;
        lab[4][3].haut = false;
        lab[4][3].bas = false;
        lab[5][3].haut = false;
        lab[5][3].bas = false;

        // Appeler la méthode pour afficher le chemin
        afficherChemin(lab, 0, 0, "entrée");
    }
}
