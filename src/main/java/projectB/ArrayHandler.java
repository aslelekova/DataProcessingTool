package main.java.projectB;

/**
 * Handles operations related to two-dimensional arrays.
 */
public class ArrayHandler {
    /**
     * Mirrors the exchange of rows and columns in a matrix.
     *
     * @param matrix The input matrix.
     * @return The matrix after mirroring the exchange of rows and columns.
     */
    public static double[][] mirrorExchange(double[][] matrix) {
        // Number of rows.
        int n = matrix.length;

        // Find the minimum number of rows and columns to make the matrix square.
        int minDimension = Math.min(n, matrix[0].length);

        for (int i = 0; i < minDimension; i++) {
            for (int j = i + 1; j < minDimension; j++) {
                // Change values.
                double temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }


    /**
     * Creates a two-dimensional array from a string representation of numbers.
     *
     * @param strNumbers A string containing numbers separated by ";;" and arrays separated by "%".
     * @return A two-dimensional array created from the input string.
     */
    public static double[][] createArrayB(String strNumbers) {
        String[] countArrayOfArrays = strNumbers.split("%");

        double[][] arrayB = new double[countArrayOfArrays.length][];

        try {
            for (int i = 0; i < countArrayOfArrays.length; i++) {
                String[] stringNumbers = countArrayOfArrays[i].split(";;");
                double[] doubleNumbers = new double[stringNumbers.length];

                for (int j = 0; j < stringNumbers.length; j++) {
                    doubleNumbers[j] = Double.parseDouble(stringNumbers[j].replace(',', '.'));
                }

                arrayB[i] = doubleNumbers;
            }

            return arrayB;
        } catch (Exception e) {
            System.out.println("В файле содержатся некорректные данные.");
            return new double[0][];
        }
    }
}
