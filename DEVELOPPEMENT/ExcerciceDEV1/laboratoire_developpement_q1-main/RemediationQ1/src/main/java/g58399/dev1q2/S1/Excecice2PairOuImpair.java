package g58399.dev1q2.S1;

import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class Excecice2PairOuImpair {

    public static void main(String[] args) {
        Parité();
    }

    public static void Parité() {
        Scanner clavier = new Scanner(System.in);
        int nbs = clavier.nextInt();
        System.out.println("Le nombre selectionnée ce trouve être : " + nbs);
        if (nbs % 2 == 0) {
            System.out.println("Ce nombre est pair");
        } else {
            System.out.println("Ce nombre est impair");
        }
    }
}
