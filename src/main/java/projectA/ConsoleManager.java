package main.java.projectA;

import java.util.Scanner;

/**
 * The ConsoleManager class provides methods for handling user input in the console.
 */
public class ConsoleManager {
    /**
     * Organizes a dialogue with the user for entering dimensions of the array.
     *
     * @param name       Name of the required value.
     * @param lowerBound Lower bound of the input value.
     * @param upperBound Upper bound of the input value.
     * @return The value entered by the user, provided that it passes the test.
     */
    public static int userIntInput(char name, int lowerBound, int upperBound) {
        int term;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите значение %s (0 < %s <= %s):\n%s = ", name, name, upperBound, name);

        while (true) {
            // Checking for correct input.
            if (scanner.hasNextInt()) {
                term = scanner.nextInt();
                if (term > lowerBound && term <= upperBound) {
                    break;
                } else {
                    System.out.println("\nНеверные входные данные.\nВведите корректное значение: ");
                }
            } else {
                System.out.println("\nНеверные входные данные.\nВведите корректное значение: ");
                scanner.next();
            }
        }

        return term;
    }

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
}
