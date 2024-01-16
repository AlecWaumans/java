/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctioninterrogation2;

/**
 *
 * @author alecw
 */
public class interrogation2 {

    public static boolean findAt(String src, String val, int indice) {
        boolean trouveDifference = false;
        for (int i = 0; !trouveDifference && i < val.length(); i++) {
            trouveDifference = src.charAt(indice + i) != val.charAt(i);
        }
        return !trouveDifference;
    }

    public static void main(String[] args) {
        System.out.println(findAt("webdesigner", "esi", 4));
        System.out.println(findAt("webdesigner", "esi", 7));
    }
}
