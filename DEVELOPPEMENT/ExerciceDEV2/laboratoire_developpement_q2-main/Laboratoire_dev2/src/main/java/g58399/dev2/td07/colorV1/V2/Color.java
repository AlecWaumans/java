package g58399.dev2.td07.colorV1.V2;

/**
 *
 * @author alecw
 */
public enum Color {

    BLACK("\033[30m"),
    RED("\033[31m"),
    GREEN("\033[32m"),
    YELLOW("\033[33m"),
    BLUE("\033[34m"),
    MAGENTA("\033[35m"),
    CYAN("\033[36m"),
    WHITE("\033[37m"),
    BRIGHT_BLACK("\033[90m"),
    BRIGHT_RED("\033[91m"),
    BRIGHT_GREEN("\033[92m"),
    BRIGHT_YELLOW("\033[93m"),
    BRIGHT_BLUE("\033[94m"),
    BRIGHT_MAGENTA("\033[95m"),
    BRIGHT_CYAN("\033[96m"),
    BRIGHT_WHITE("\033[97m");

    private final String escape = "\033[m";
    private final String code;

    Color(String code) {
        this.code = code;
    }

    String color(String text) {
        return this.code + text + escape;
    }

    @Override
    public String toString() {
        return "Color{"
                + "code='" + code + '\''
                + '}';
    }

    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.println(c.color("Je suis la couleur ") + c.name());
        }
    }
}
