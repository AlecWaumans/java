package g58399.dev1q2.S1;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice1MoyenneNote {

    public static void main(String[] args) {
        résultatDev1();

    }

    public static void résultatDev1() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la cote de l'interrogation du cours de java: ");
        int NoteCours = clavier.nextInt();
        System.out.println("Entrez la cote de l'interrogation de laboratoire java : ");
        int NoteLabo = clavier.nextInt();
        System.out.println("Entrez la cote de l'interrogation d'environnement java : ");
        int NoteEnvironnement = clavier.nextInt();
        double moyenne = (NoteCours * 30 + NoteLabo * 50 + NoteEnvironnement * 20) / 100;
        System.out.println("Votre moyenne pondérée se trouve être : " + moyenne);
        if (moyenne >= 11.5) {
            System.out.println("Bravo ! Vous êtes dispensé de l'examen.");
        } else {
            System.out.println("Désolé, vous devez passer l'examen.");
        }

    }
}
