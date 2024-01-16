package g58399.dev2.javl.td06.views.v1;

/**
 * 
 * @author alecw
 */
public class DecoratorView implements View {
    /**
     * Cette methode va creer une titre sur un certain format.
     * la fonction line() sert a souligner le titre.
     * @param title le titre qui doit être dans ce format.
     */
    @Override
    public void makeTitle(String title) {
        System.out.println("|" + line(title.length() + 4) + "|"); 
        System.out.println("|  " + title + "  |");
        System.out.println("|" + line(title.length() + 4) + "|\n"); // \n passe à la ligne.
    }
    /**
     * Cette methode va creer un sous-titre dans un certain format.
     * @param subtitle le sous-titre qui doit être mis dans ce format.
     */
    @Override
    public void makeSubtitle(String subtitle) {
        System.out.println(subtitle + "\n" + line(subtitle.length()));
    }
    /**
     * Cette methode va creer unne liste d'item mais sous un certain format.
     * @param sentence Les items qui doit qui doit etre mise en place.
     */
    @Override
    public void makeItems(String sentence) {
        System.out.println("\t* " + sentence);// \t créer une tabulation.
    }
    /**
     * Cette methode va creer un un paragraphe sous un certain format.
     * @param paragraph Le paragraph qui doit être mis sous ce format.
     */
    @Override
    public void makeParagraph(String paragraph) {
        System.out.println(paragraph);
    }
    /**
     * Cette methode va ajouter une ligne.
     * @param length la longueur de la ligne 
     * @return une ligne ou plusieurs en fonction du paramètre. 
     */
    private static String line(int length) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < length; i++) {
            str.append('-');
        }
        return str.toString();
    }

}
