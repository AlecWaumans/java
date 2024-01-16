package ExamenJuin2021;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class main {

    public static void main(String[] args) {
        List<Commit> listeCommit;
        listeCommit = new LinkedList<>();
        List<String> listeGroupe;
        listeGroupe = new LinkedList<>();
        listeGroupe.add("c");
        listeGroupe.add("a");
        listeGroupe.add("b");
        int i = 1;
        while (i <= 20) {
            Commit commit = new Commit("c", i);
            System.out.println(commit);
            listeCommit.add(commit);
            i++;

        }
        int a = 1;
        while (a <= 12) {
            Commit commit = new Commit("a", a);
            System.out.println(commit);
            listeCommit.add(commit);
            a++;
        }
        int b = 1;
        while (b <= 21) {
            Commit commit = new Commit("b", b);
            System.out.println(commit);
            listeCommit.add(commit);
            b++;
        }
        System.out.println(listeCommit.size());

        nombreCommitGroupe(listeCommit, listeGroupe);

    }

    private static void nombreCommitGroupe(List<Commit> ensembleEtudiant, List<String> listeGroupe) {
        int sizeListCommit = ensembleEtudiant.size();
        int sizeListGroupe = listeGroupe.size();
        String saveGroupe;

        int i = 0;

        while (i < sizeListGroupe) {
            saveGroupe = listeGroupe.get(i);
            int nbreCommitGroupe = 0;
            int a = 0;
            while (a < sizeListCommit && ensembleEtudiant.get(a).getGroupe().equals(saveGroupe)) {
                nbreCommitGroupe++;
                a++;
            }
            System.out.println("il y a " + nbreCommitGroupe + " de commit dans le groupe " + saveGroupe);
            i++;
        }
    }
}
