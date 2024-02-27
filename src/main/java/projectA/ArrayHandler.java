package main.java.projectA;

/**
 * The ArrayHandler class provides methods for handling 2D arrays.
 */
public class ArrayHandler {
    /**
     * Creates and fills a 2D array using a given formula.
     *
     * @param n The number of rows.
     * @param m The number of columns.
     * @return A 2D array filled with values calculated using the provided formula.
     */
    public static double[][] createFillArray(int n, int m) {
        // Create an array of arrays.
        double[][] arrayA = new double[n][];

        for (int i = 0; i < n; i++) {
            arrayA[i] = new double[m];
        }

        // Filling an array using a given formula.
        int a = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrayA[i][j] = (2 * a * a + a - 3) / (double) (a * a * a - a * a);
                a++;
            }
        }

        return arrayA;
    }

    /**
     * Converts a 2D array into a StringBuilder containing formatted string representations of the elements.
     *
     * @param arrayA The 2D array to be converted.
     * @return StringBuilder containing formatted string representations of the array elements.
     */
    public static StringBuilder getStringBuilder(double[][] arrayA) {
        StringBuilder stringBuilder = new StringBuilder();
        for (double[] el : arrayA) {
            for (int i = 0; i < el.length; i++) {
                stringBuilder.append(String.format("%.2f", el[i]));

                if (i < el.length - 1) {
                    stringBuilder.append(";;");
                }
            }

            stringBuilder.append("%");
        }
        return stringBuilder;
    }
}
