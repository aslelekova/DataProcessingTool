package main.java;

import main.java.projectA.ArrayHandler;
import main.java.projectA.ConsoleManager;
import main.java.projectA.FileManager;

import java.util.Scanner;

/**
 * Main class for ProgramA.
 */
public class MainA {
    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Determining the size of the array.
            int n = ConsoleManager.userIntInput('n', 0, 15);
            int m = ConsoleManager.userIntInput('m', 0, 10);

            // Creation and filling of array A.
            double[][] arrayA = ArrayHandler.createFillArray(n, m);

            // Converting the array into a string and separating it with the required chars.
            StringBuilder stringBuilder = ArrayHandler.getStringBuilder(arrayA);

            // Saving string to a file.
            FileManager.saveArrayToFile(stringBuilder);

            System.out.println("\nДля выхода из программы нажмите Enter, для продолжения - 1...");

        } while (!scanner.nextLine().isEmpty());
    }
}
