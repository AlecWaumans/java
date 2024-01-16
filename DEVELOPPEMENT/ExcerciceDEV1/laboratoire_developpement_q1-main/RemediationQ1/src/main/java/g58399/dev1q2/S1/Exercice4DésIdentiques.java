package g58399.dev1q2.S1;

import java.util.Random;

/**
 *
 * @author alecw
 */
public class Exercice4DésIdentiques {

    public static void main(String[] args) {
        DésIdentiques();
    }

    public static void DésIdentiques() {
        System.out.println("Je lance les trois dés.");
        //random double min max
        //double Dés1 = Math.random() * (6 - 0);
        //double Dés2 = Math.random() * (6 - 0);
        //double Dés3 = Math.random() * (6 - 0);
        Random rand = new Random();
        int Dés1 = rand.nextInt(6 - 0 + 1) + 0;
        int Dés2 = rand.nextInt(6 - 0 + 1) + 0;
        int Dés3 = rand.nextInt(6 - 0 + 1) + 0;
        // <p>Random rand = new Random(); int nombreAleatoire = rand.nextInt(max - min + 1) + min;</p>

        System.out.println("Le premier dés est un : " + Dés1);
        System.out.println("Le premier dés est un : " + Dés2);
        System.out.println("Le premier dés est un : " + Dés3);

        if (Dés1 == Dés2 && Dés1 == Dés3) {
            System.out.println("Les dés suivants sont égaux "
                    + " Dés1,Dés2,Dés3 ");
        } else if (Dés1 == Dés2) {
            System.out.println("Les dés suivants sont égaux "
                    + "Dés1,Dés2");
        } else if (Dés1 == Dés3) {
            System.out.println("Les dés suivants sont égaux "
                    + "Dés1,Dés3 ");
        } else if (Dés2 == Dés3) {
            System.out.println("Les dés suivants sont égaux "
                    + "Dés2,Dés3 ");
        } else {
            System.out.println("Tout les dés sont différents !! ");
        }
    }
}
