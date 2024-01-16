package g58399.dev2.javl.td06.views.v1;

/**
 *
 * @author alecw
 */
public class ColorView implements View {

    @Override
    public void makeTitle(String title) {
        System.out.println(TerminalColor.LIGHT_BLUE + title + TerminalColor.DEFAULT);
    }

    @Override
    public void makeSubtitle(String subtitle) {
        System.out.println(TerminalColor.BLUE + subtitle + TerminalColor.DEFAULT);
    }

    @Override
    public void makeItems(String item) {
        System.out.println("\t" + TerminalColor.GREEN + "- " + item + TerminalColor.DEFAULT);
    }

    @Override
    public void makeParagraph(String paragraph) {
        System.out.println(paragraph);
    }

}
