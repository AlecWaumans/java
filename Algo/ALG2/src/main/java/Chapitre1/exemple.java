package Chapitre1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class exemple {

    public static void main(String[] args) {
        System.out.println("Liste de String");
        List<String> liste = new ArrayList();
        liste.add("fromage");
        liste.add("eau");
        liste.add("salami");
        liste.add("pain");
        afficherListeString(liste);
        System.out.println();
        System.out.println("Liste de integer");
        List<Integer> liste2 = new ArrayList();
        liste2.add(45);
        liste2.add(102);
        liste2.add(66);
        liste2.add(35);
        liste2.add(15);
        liste2.add(62);
        liste2.add(45);
        afficherListeInteger(liste2);

    }

    public static void afficherListeString(List<String> liste) {
        for (int i = 0; i < liste.size() - 1; i++) {
            System.out.print(liste.get(i) + " ");
        }
    }

    public static void afficherListeInteger(List<Integer> liste) {
        for (int i = 0; i < liste.size() - 1; i++) {
            System.out.print(liste.get(i) + " ");
        }
    }
    public static List<Integer> indicesMinimum(int[] tab){
        List<Integer> indicesMin;
        Integer min;
        min = tab[0];
        indicesMin = new ArrayList<>();
        indicesMin.add(0);
        for(int i = 1; i < tab.length; i++){
            if(tab[i] == min){
                indicesMin.add(i);
            }else if(tab[i] < min){
                indicesMin.clear();
                indicesMin.add(i);
                min = tab[i];
            }
        }
        return indicesMin;
        
    }

}
