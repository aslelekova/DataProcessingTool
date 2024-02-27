package main.java.projectB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Handles file-related operations for reading arrays from a file.
 */
public class FileManager {
    /**
     * Reads an array from a file.
     *
     * @return A string containing the numbers read from the file.
     */
    public static String readArrayFromFile() {
        String strNumbers;
        while (true) {
            String filename = ConsoleManager.readValidFileName();

            // Correctness of method execution.
            if (filename.isEmpty()) {
                System.out.println("Имя файла содержит запрещенный символ. Повторите попытку.");
                continue;
            }

            try {
                // Specify the path where the data file is located.
                Path filePath = Paths.get(filename + ".txt");
                strNumbers = Files.readString(filePath);

                if (strNumbers.length() == 0) {
                    strNumbers = null;
                    System.out.println("Файл пуст.");
                }

                break;
            } catch (IOException e) {
                if (e instanceof java.nio.file.NoSuchFileException) {
                    System.out.println("\nФайла с таким именем не существует. Повторите попытку.");
                } else if (e instanceof java.nio.file.FileSystemException) {
                    System.out.print("\nПревышено допустимое число символов (255 штук) в названии файла. Повторите попытку.");
                } else {
                    System.out.print("\nВозникла ошибка при открытии файла и чтении структуры. Повторите попытку. ");
                }
            } catch (NullPointerException e) {
                System.out.print("\nВозврат нулевой ссылки. Повторите попытку.");
            } catch (Exception e) {
                System.out.print("\nВозникла непредвиденная ошибка. Повторите попытку. ");
            }
        }

        return strNumbers;
    }
}
