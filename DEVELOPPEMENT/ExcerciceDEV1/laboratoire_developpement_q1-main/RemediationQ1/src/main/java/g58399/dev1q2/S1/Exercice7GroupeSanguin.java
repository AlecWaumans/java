package g58399.dev1q2.S1;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice7GroupeSanguin {

    public static void main(String[] args) {
        Compatible();
    }

    public static void Compatible() {
        boolean compatible = false;

        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez votre groupe sanguins(Sous forme A B AB O ) : ");
        String GroupeDonneur = clavier.nextLine();
        System.out.println("Entrez Le groupe sanguins du receveur (Sous forme A B AB O ) : ");
        String GroupeReceveur = clavier.nextLine();
        System.out.println("Les deux sangs sont compatible ? ");

        if (GroupeDonneur.equals(GroupeReceveur)) {
            compatible = true;
        } else if (GroupeDonneur.equals("O")) {
            compatible = true;
        } else if (GroupeReceveur.equals("AB")) {
            compatible = true;
        }
        System.out.println(compatible);

    }
}
