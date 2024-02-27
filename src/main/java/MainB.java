package main.java;

import main.java.projectB.ArrayHandler;
import main.java.projectB.ConsoleManager;
import main.java.projectB.FileManager;

import java.util.Scanner;

/**
 * Main class for Project B.
 * This program reads arrays from files, performs specific operations on arrays,
 * and prints arrays to the console.
 */
public class MainB {
    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Read array from a file and save it to a string.
            String strNumbers = FileManager.readArrayFromFile();

            if (strNumbers != null) {
                double[][] arrayB = new double[0][];

                // Actions with array B.
                arrayB = ArrayHandler.createArrayB(strNumbers);

                if (arrayB != null && arrayB.length > 0) {
                    System.out.println("\nМассив до обработки: ");
                    ConsoleManager.printArray(arrayB);

                    double[][] modifiedArrayB = new double[0][];
                    modifiedArrayB = ArrayHandler.mirrorExchange(arrayB);

                    System.out.println("\nМассив после обработки: ");
                    ConsoleManager.printArray(modifiedArrayB);
                }
            }

            System.out.println("\nДля выхода из программы нажмите Enter, для продолжения - 1...");

        } while (!scanner.nextLine().isEmpty());
    }
}
