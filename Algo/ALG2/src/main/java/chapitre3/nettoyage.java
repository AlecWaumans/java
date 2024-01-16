package chapitre3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nettoyage {

    public static int cleanStrings(List<String> strings, String s) {
        int len = strings.size();
        while (strings.contains(s)) {
            strings.remove(s);
        }
        return len - strings.size();
    }

    public static void main(String[] args) {
        var strings = new ArrayList<>(Arrays.asList("hello", "hey", "hey", "ola", "bjr", "ok"));
        System.out.println(cleanStrings(strings, "hey"));
    }
}
