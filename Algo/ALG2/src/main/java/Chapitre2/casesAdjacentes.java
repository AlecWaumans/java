package Chapitre2;

/**
 *
 * @author alecw
 */
public class casesAdjacentes {

    public static void main(String[] args) {

    }

    public static void printAdjacentCell(int[][] tab, int row, int col) {
        int[] rowPos = {-1, -1, -1, 0, 1, 1, 1, 0}; // all relatives rows

        //starting from top left
        int[] colPos = {-1, 0, 1, 1, 1, 0, -1, -1}; // relative columns

        //starting from top left
        String[] names = {"top left", "top", "top right", "right", "bottom",
            "right", "bottom", "bottom left", "left"};
        int n = rowPos.length;
        for (int i = 0; i < n; i++) {
            int r = row + rowPos[i];
            int c = col + colPos[i];
            if (r < 0 || r >= tab.length || c < 0 || c >= tab[0].length) {
                System.out.println("(" + r + ", " + c + ")" + " -> " + "out!");
            } else {
                System.out.println(names[i] + " : (" + r + ", " + c + ")");
            }
        }
    }

}
