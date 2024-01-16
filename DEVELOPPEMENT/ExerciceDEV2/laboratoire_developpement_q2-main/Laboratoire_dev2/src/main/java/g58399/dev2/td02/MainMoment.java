package g58399.dev2.td02;

/**
 *
 * @author alecw
 */
public class MainMoment {

    /**
     * ici nous allons créer trois objects qui correspond a trois moment de la
     * journée et nous allons les modifier et les imprimés afin de mieux
     * comprendre java.
     *
     * @param args
     */
    public static void main(String[] args) {
        Moment moment5 = new Moment(10, 30, 15);// creation de l'object 1 qui est le premier moment
        Moment moment6 = new Moment(11, 15, 17);// creation de l'object 2 qui est le deuxieme moment
        Moment moemnt7 = new Moment(12, 30, 25);// creation de l'object 3 qui est le troisieme moment

        System.out.println(moment5);
        System.out.println(moment6);
        System.out.println(moemnt7);
        /* affiche pas les valeurs d'attribut cat elle font 
        *appelle directement les attribut et elles sont privée.
         */
        System.out.println(moment5.getheure());
        System.out.println(moment5.getminute());
        System.out.println(moment5.getseconde());

        System.out.println(moment6.getheure());
        System.out.println(moment6.getminute());
        System.out.println(moment6.getseconde());

        System.out.println(moemnt7.getheure());
        System.out.println(moemnt7.getminute());
        System.out.println(moemnt7.getseconde());
        //on demande les valeurs d'attribut via des appelles de méthode.

        System.out.println(moment5.toString());

        Moment moment1 = new Moment(8, 15, 0);
        Moment moment2 = new Moment(8, 15, 0);
        Moment moment3 = moment1;
        Moment moment4 = new Moment(10, 15, 0);
        System.out.println(moment1 + "==" + moment2 + ": " + (moment1 == moment2));
        System.out.println(moment1 + "==" + moment3 + ": " + (moment1 == moment3));
        System.out.println(moment1 + "==" + moment4 + ": " + (moment1 == moment4));
        System.out.println(moment1 + "equals" + moment2 + ": " + moment1.equals(moment2));
        System.out.println(moment1 + "equals" + moment3 + ": " + moment1.equals(moment3));
        System.out.println(moment1 + "equals" + moment4 + ": " + moment1.equals(moment4));
        /*ici on comprend pourquoi la methode equals ne fonctionne pas car ce sont des objects 
        * differents mais qui on les mêmes attribut.
         */

        Moment moment8 = new Moment();
        System.out.println(moment8);
        /* ici nous avons creer un nouvel object qui est un nouveau moment mais qui fait appelle 
        *au deuxieme constructeur qui a des attributs predefinit qui sont 00:00:00.
         */

        System.out.println(moment4.toSeconds() + " secondes");
        System.out.println(moment1.compareTo(moment8));
        
    }
}
