package g58399.dev1q2.S1;

/**
 *
 * @author alecw
 */
public class Exercice12Recouvrement {

    public static void main(String[] args) {

    }

    public static void MajeurOuNon(int age) {
        if (age < 10) {
            System.out.println("Vous êtes un enfant");
        } else if (age >= 18) {
            System.out.println("Selon la loi, vous êtes un adulte");
        } else {
            System.out.println("Vous êtes un adolescent");
        }
    }
}
