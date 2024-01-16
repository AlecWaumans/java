package g58399.dev2.javl.td06.views.v1;

/**
 * Cette interface impose des méthodes pour formater éléments à la sortie
 * standard.
 *
 * formatter = afficher.
 *
 * @author alecw
 */
public interface View {

    /**
     * va formater le titre.
     *
     * @param title le titre qui va être formater.
     */
    void makeTitle(String title);

    /**
     * va formater le sous-titre.
     *
     * @param subtitle le sous-titre qui doit être formater.
     */
    void makeSubtitle(String subtitle);

    /**
     * formater une liste d'item.
     *
     * @param item les items qui doivent etre formater.
     */
    void makeItems(String item);

    /**
     * formater un texte qui est le paragraphe.
     *
     * @param paragraph Le paragraph qui doit être formatter.
     */
    void makeParagraph(String paragraph);

}
