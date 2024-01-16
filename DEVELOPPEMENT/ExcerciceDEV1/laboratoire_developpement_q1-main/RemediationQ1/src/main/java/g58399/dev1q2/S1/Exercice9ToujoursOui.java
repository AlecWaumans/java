package g58399.dev1q2.S1;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice9ToujoursOui {

    public static void main(String[] args) {
        System.out.println("V1");
        System.out.println(questionTrueOrFalseV1());
        System.out.println("V2");
        System.out.println(questionTrueOrFalseV2());

    }

    /**
     * Difference V1 : pose les trois question avent.
     *
     * @return True si l'utilisateur repond true dans les trois question et
     * false au contraire
     */
    public static String questionTrueOrFalseV1() {
        String reponseConsole1 = "Excellent";
        String reponseConsole2 = "Dommage";
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez True ou False");
        String reponseUtilisateur1 = clavier.nextLine();
        System.out.println("Entrez True ou False");
        String reponseUtilisateur2 = clavier.nextLine();
        System.out.println("Entrez True ou False");
        String reponseUtilisateur3 = clavier.nextLine();

        if (reponseUtilisateur1.equals(reponseUtilisateur2)
                && reponseUtilisateur2.equals(reponseUtilisateur3)) {
            return reponseConsole1;
        } else {
            return reponseConsole2;
        }
    }

    /**
     * Difference V2 : arrete le programme des qu'un false sort
     *
     * @return True si l'utilisateur repond true dans les trois question et
     * false au contraire
     */
    public static String questionTrueOrFalseV2() {

        String reponseConsole1 = "Excellent";
        String reponseConsole2 = "Dommage";
        String reponseUtilisateur;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez True ou False");
        reponseUtilisateur = clavier.nextLine();
        if (reponseUtilisateur.equals("False")) {
            return reponseConsole2;
        }
        System.out.println("Entrez True ou False");
        reponseUtilisateur = clavier.nextLine();
        if (reponseUtilisateur.equals("False")) {
            return reponseConsole2;
        }
        System.out.println("Entrez True ou False");
        reponseUtilisateur = clavier.nextLine();
        if (reponseUtilisateur.equals("False")) {
            return reponseConsole2;
        }
        return reponseConsole1;
    }
}
