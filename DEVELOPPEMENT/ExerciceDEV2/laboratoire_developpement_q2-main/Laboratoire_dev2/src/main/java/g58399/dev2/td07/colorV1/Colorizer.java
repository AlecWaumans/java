package g58399.dev2.td07.colorV1;



/**
 *
 * @author alecw
 */
public class Colorizer {

    String color(Color color, String text) {
        String end = "\033[m";
        switch (color) {
            case RED:
                text = "\033[31m" + text + end;
                break;
            case GREEN:
                text = "\033[32m" + text + end;
                break;
            case BLUE:
                text = "\033[34m" + text + end;
                break;
            default:
                text = "\033[30m" + text + end;
        }
        return text;
    }

    public static void main(String[] args) {
        String txt = "Hello my friends";
        Colorizer c = new Colorizer();
        System.out.println(c.color(Color.GREEN, txt));

        System.out.println("\033[34m" + "hello, world" + "\033[m"); // sensée l'ecrire en bleu comprend pas ...
    }
}
