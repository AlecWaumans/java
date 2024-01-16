/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seance10;

/**
 *
 * @author alecw
 */
import java.util.Arrays;
import java.util.Scanner;

public class Exercice03 {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est le premier mot que vous souhaitez prendre en paramètre?");
        String s1 = scanner.nextLine();
        System.out.println("Quel est le deuxième mot que vous souhaitez prendre en paramètre?");
        String s2 = scanner.nextLine();
        System.out.println(isAnagramRec(s1, s2));
    }

    public static boolean isAnagramRec(String s1, String s2) {
        boolean isAnagrame = false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() == s2.length()) {
            if (s1.length() == 1) {
                if ((s1).compareTo(s2) == 0) {
                    isAnagrame = true;
                }
            } else {
                //On trie par ordre croissant s1 et s2
                char[] lettres1 = s1.toCharArray();
                Arrays.sort(lettres1);
                s1 = "";
                for (int k = 0; k < s1.length(); k++) {
                    s1 += String.valueOf(lettres1[k]);
                }
                char[] lettres2 = s2.toCharArray();
                Arrays.sort(lettres2);
                s2 = "";
                for (int k = 0; k < s2.length(); k++) {
                    s2 += String.valueOf(lettres2[k]);
                }
                if (s1.charAt(0) == (s2.charAt(0))) {
                    s1 = s1.replace(String.valueOf(s1.charAt(0)), "");
                    s2 = s2.replace(String.valueOf(s2.charAt(0)), "");
                    isAnagramRec(s1, s2);
                }
            }
        }
        return isAnagrame;
    }
}
