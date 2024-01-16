package g58399.dev2.td04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Numbers {

    private List<Integer> maListe;

    public Numbers() {
        this.maListe = new ArrayList<>();
    }

    /*
     * @return Cette accesseur va nous retourner la liste.
     */
    public List<Integer> getList() {
        return maListe;
    }

    /**
     * cette methode va ajouter une valeur dans la list.
     *
     * @param val c'est la valeur qu'on veut ajouté.
     */
    public void add(Integer val) {
        maListe.add(val);
    }

    /*
     * cette methode va retirer la valeur indiquer de la list.
     * @param val la valeur qu'on veut supprimer.
     */
    public void remove(Integer val) {
        maListe.remove(val);
    }

    /**
     * @return la somme de toute les valeurs de la list.
     */
    public int sum() {
        int somme = 0;
        for (int i = 0; i < maListe.size(); i++) {
            somme = somme + maListe.get(i);
        }
        return somme;
    }

    /**
     * @return la somme de toute les valeurs de la list.
     */
    public int sum2() {
        return TdLists.sum(maListe);
    }

    /**
     * Concatène la liste en paramètre en fin de la liste courante.
     *
     * @param other Autre liste.
     */
    public void concat(List<Integer> other) {
        for (int i = 0; i < other.size(); i++) {
            maListe.add(other.get(i));
        }
    }

    public void concat(Numbers numbers) {
        concat(numbers.getList());
    }

    /**
     * Cette methode va donner le minimum de celle-ci.
     *
     * @return retourne la valeur minimum de la liste.
     */
    public int min() {
        int min = maListe.get(0);
        for (int i = 0; i < maListe.size(); i++) {
            if (maListe.get(i) <= min) {
                min = maListe.get(i);
            }
        }
        return min;
    }

    /**
     * @return la valeur de max de la liste.
     */
    public int max() {
        int max = maListe.get(0);
        for (int i = 0; i < maListe.size(); i++) {
            if (maListe.get(i) >= max) {
                max = maListe.get(i);
            }
        }
        return max;
    }

    /**
     * cette methode va retirer le minimum et le maximum de la list.
     */
    public void removeMinAndMax() {
        Integer max = max();
        Integer min = min();
        maListe.remove(max);
        maListe.remove(min);
    }

    /*
    Cette methode va retirer tout les duplicats de la liste.
     */
    public void removeDuplicates() {
        for (int i = 0; i < maListe.size() - 1; i++) {
            int currElem = maListe.get(i);
            int nextElem = maListe.get(i + 1);
            if (currElem == nextElem) {
                maListe.remove(i);
                i--; // Takes n-replicates into account
            }
        }
    }

    public List<Integer> fusion(List<Integer> other) {
        int outSize = maListe.size() + other.size();
        List<Integer> maFusion = new ArrayList<>(outSize);
        int j = 0;
        int k = 0;
        for (int i = 0; i < outSize; i++) {
            if (j == maListe.size()) {
                maFusion.add(other.get(k++));
            } else if (k == other.size()) {
                maFusion.add(maListe.get(j++));
            } else if (maListe.get(j).compareTo(other.get(k)) < 0) {
                maFusion.add(maListe.get(j++));
            } else {
                maFusion.add(other.get(k++));
            }
        }
        return maFusion;
    }

}
