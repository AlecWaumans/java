package g58399.dev1q2.S1;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Exercice6TaxesCommunales {

    public static void main(String[] args) {
        TaxeParPersonne();
    }

    public static void TaxeParPersonne() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Combien êtes vous dans votre famille ? ");
        int NbsFamille = clavier.nextInt();
        int taxeTotal = 0;
        if (NbsFamille == 1) {
            taxeTotal = 80;
        } else if (NbsFamille >= 2 && NbsFamille <= 3) {
            taxeTotal = 135;
        } else {
            taxeTotal = 175;
        }
        System.out.println("Votre taxe total à payer est de " + taxeTotal);
    }
}
