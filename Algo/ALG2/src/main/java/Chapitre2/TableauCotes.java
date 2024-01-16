package Chapitre2;

/**
 *
 * @author alecw
 */
public class TableauCotes {

    public static double passingPercentage(int[][] tab) {
        int nStudents = tab.length;
        int countPassed = 0;
        int passingGrade = 10 * tab[0].length; // 10/20 * nbr of grades
        for (int[] row : tab) {
            int rowSum = 0;

            for (int cell : row) {
                rowSum += cell;
            }
            if (rowSum > passingGrade) {
                countPassed++;
            }
        }
        return (double) 100 * countPassed / nStudents; // convert to percentage
    }
}
