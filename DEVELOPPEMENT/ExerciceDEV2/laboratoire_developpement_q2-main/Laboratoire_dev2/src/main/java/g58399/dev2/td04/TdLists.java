package g58399.dev2.td04;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class TdLists {

    public static void main(String[] args) {
        List<Integer> maListe;
        maListe = new LinkedList<>(); //ici on a crée un tableau de taille indeterminée;
        System.out.println(maListe);
        maListe.add(42);//on ajoute la valeur 42 a la pos0
        maListe.add(54);//on ajoute la valeur 54 a la pos1
        System.out.println(maListe);
        maListe.set(1, 44);// on modifie la valeur de la pos1 en 44
        System.out.println(maListe);
        maListe.add(1, 43); // j'insere une valeur entre les deux autres valeur.
        System.out.println(maListe);
        maListe.remove(maListe.size() - 1); // supprime la derniere valeur de la liste.
        System.out.println(maListe);
        maListe.remove(Integer.valueOf(42)); //efface la valeur 42 du tableau.
        System.out.println(maListe);
        maListe.clear();// retirer tout les éléments de la liste.
        System.out.println(maListe);

        List<Integer> maListe2;
        maListe2 = new LinkedList<>();

        maListe2.add(1);
        maListe2.add(2);
        maListe2.add(3);
        maListe2.add(4);

        System.out.println(maListe2);
        System.out.println(sum(maListe2));

        maListe.add(56);
        System.out.println(maListe);
        System.out.println(maListe2);
        System.out.println(concatenation(maListe, maListe2));
    }

    /**
     * Cette methode va retourner la somme des valeurs de la list.
     *
     * @param list la liste en quetion
     * @return retourne la somme des valeurs de la list.
     */
    public static int sum(List<Integer> list) {
        int somme = 0;
        for (int i = 0; i < list.size(); i++) {
            somme = somme + list.get(i);
        }
        return somme;
    }
    /**
     * Cette methode va ajouter la deuxieme liste apres la premiere sans modifier la premiere.
     * @param list1 premiere liste indiquer
     * @param list2 deuxieme liste indiquer
     * @return va retourner la premiere liste avec la deuxieme en concaténation. 
     */
    public static List<Integer> concatenation(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

}
