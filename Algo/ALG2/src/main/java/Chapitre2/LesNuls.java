package Chapitre2;

/**
 *
 * @author alecw
 */
public class LesNuls {

    public static void main(String[] args) {

    }

    public static double nulRatio(int[][] tab) {
        int total = 0; // Use total instead of size in case of unequal row lengths
        int count = 0;
        for (int[] rows : tab) {
            for (int cell : rows) {
                if (cell == 0) {
                    count++;
                }
                total++;
            }
        }
        return (double) count / total;
    }

}
