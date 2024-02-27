package main.java.projectA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * FileManager class provides methods for handling file-related operations.
 */
public class FileManager {
    /**
     * Saves the content of a StringBuilder to a file after obtaining a valid filename from the user.
     *
     * @param stringBuilder The StringBuilder containing the content to be saved to the file.
     */
    public static void saveArrayToFile(StringBuilder stringBuilder) {
        while (true) {
            String fileName = main.java.projectA.ConsoleManager.readValidFileName();

            try {
                // Сохранение текста в файл.
                Path filePath = Paths.get(fileName + ".txt");
                Files.writeString(filePath, stringBuilder.toString(), StandardOpenOption.CREATE);
                System.out.println("Массив успешно сохранен в файл " + fileName + ".txt");
                break; // Выход из цикла, если сохранение прошло успешно
            } catch (IOException e) {
                System.out.println("Возникла ошибка при открытии файла и записи структуры. Повторите попытку.");
            } catch (Exception e) {
                System.out.println("Возникла непредвиденная ошибка. Повторите попытку.");
            }
        }
    }
}
