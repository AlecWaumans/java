package g58399.dev2.javl.td06.views.v1;

/**
 *
 * @author alecw
 */
public class MainView {

    public static void main(String[] args) {
        View v1 = new DecoratorView();
        v1.makeTitle("kyra informatique");
        v1.makeSubtitle("Tout Service");
        v1.makeParagraph("Nous proposons diverse service tels que : .");
        v1.makeItems("La photographie");
        v1.makeItems("Tout réparation");
        v1.makeItems("logiciel");
        v1.makeItems("Programmation");
        System.out.println();

        View cv = new ColorView();
        cv.makeTitle("Titre");
        cv.makeSubtitle("Sous-titre");
        cv.makeParagraph("Ceci est un paragraphe");
        cv.makeItems("Interface View");
        cv.makeItems("Classe DecoratorView");
        cv.makeItems("Classe ColorView");
        cv.makeItems("Classe HTMLView");
        System.out.println();

    }
}
