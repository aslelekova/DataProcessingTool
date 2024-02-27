package main.java.projectB;

import java.util.Scanner;

/**
 * Utility class for handling console input and output.
 */
public class ConsoleManager {
    /**
     * Reads a valid file name from the user, checking for invalid characters.
     *
     * @return A valid file name entered by the user.
     */
    public static String readValidFileName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите имя файла: ");
        boolean flag = true;
        String name = scanner.nextLine();

        // Check for invalid characters in the file name.
        char[] invalidSymbols = {'<', '>', ':', '\"', '/', '\\', '|', '?', '*'};
        for (char el : invalidSymbols) {
            if (name.contains(String.valueOf(el))) {
                flag = false;
                break;
            }
        }

        if (flag) {
            return name;
        } else {
            System.out.println("Использован запрещенный символ в создании файла. Повторите попытку.");
            return readValidFileName(); // Retry if the file name is invalid
        }
    }

    /**
     * Prints the 2D array to the console.
     *
     * @param array The 2D array to be printed.
     */
    public static void printArray(double[][] array) {
        for (double[] row : array) {
            for (double value : row) {
                System.out.print(String.format("%.2f ", value));
            }
            System.out.println();
        }

        System.out.println();
    }
}
