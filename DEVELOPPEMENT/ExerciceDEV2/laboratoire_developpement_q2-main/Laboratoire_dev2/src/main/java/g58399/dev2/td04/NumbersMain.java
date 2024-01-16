package g58399.dev2.td04;

import g58399.dev2.td02.Moment;
import java.util.Arrays;

/**
 * j'utilise cette methode main pour pouvoir tester toute les methode de la
 * classe Numbers.
 *
 * @author alecw
 */
public class NumbersMain {

    public static void main(String[] args) {

        Numbers maListe = new Numbers();
        Numbers maListe2 = new Numbers();
        maListe2.add(5);

        System.out.println(maListe.getList());
        maListe.add(43);
        System.out.println(maListe.getList());
        maListe.add(56);
        maListe.add(36);
        System.out.println(maListe.getList());
        maListe.remove(56);
        System.out.println(maListe.getList());
        System.out.println(maListe.sum2());

        maListe2.add(67);
        maListe2.add(78);
        maListe2.add(2);
        System.out.println(maListe.getList());

        maListe.concat(maListe2);

        System.out.println(maListe.getList());
        System.out.println(maListe.min());
        System.out.println(maListe.max());

        maListe.removeMinAndMax();
        System.out.println(maListe.getList());

        System.out.println("Excercice moment");
        Moment[] momts = {new Moment(1, 2, 3), new Moment(0, 1, 1), new Moment(4, 5, 32)};
        Moment early = LePlusTot(momts);
        System.out.println(early);

        System.out.println("test min max");
        Numbers list = new Numbers();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(0);
        list.removeMinAndMax();
        System.out.println(list.getList());

        System.out.println("Excercice10");
        //int i;
        //List<Integer> list = List.of(i=42,i++,--i);
        //System.out.println(list);
        //  [42,43,41]

        System.out.println("Exercice11.2");
        int[] tab = new int[5];
        int i = 0;
        while (i < tab.length) {
            tab[i] = i++;
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Exercice11.1");
        int[] tab2 = new int[5];
        int a = 0;
        while (a < tab.length) {
            tab[a++] = a;
        }
        System.out.println(Arrays.toString(tab2));
        System.out.println("Exercice11.3");
        int[] tab3 = new int[5];
        int b = 0;
        while (b < tab.length) {
            //tab[++b] = b;
            b++;

        }
        System.out.println(Arrays.toString(tab3));
        System.out.println("Exercice11.4");
        int[] tab4 = new int[5];
        int c = 0;
        while (c < tab.length) {
            tab[c] = ++c;

        }
        System.out.println(Arrays.toString(tab4));
        int z = 0;
        z = ++z;
        System.out.println(z);
        //comprend pas l'exercice12
        System.out.println("Excercice 12");
        int nbRows = 3;
        int nbCols = 5;
        boolean stop = false;
        int r = 0, k = 0;
        while (!stop) {
            System.out.printf("[%d %d]\n", r, c);
            stop = !(k++ < nbCols) && !(++r < nbRows);
            k %= nbCols;
            r %= nbRows;
            k++;

        }

    }

    /**
     * Cette methode sert a sortir le moment le plus tot dans une nouvelle liste
     * de moment.
     *
     * @param moments une liste de moment creer dans le main
     * @return va retourner un moment de la liste qui se trouve être le plus
     * tot.
     */
    public static Moment LePlusTot(Moment[] moments) {
        Moment min = moments[0];
        for (Moment m : moments) {
            min = m;
        }
        return min;
    }

}
