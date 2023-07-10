package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String fileName = "text.txt"; // Ім'я текстового файлу

        // Запис тексту до файлу
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Це якийсь текст, який буде збережено у файлі.");
            writer.flush();
            System.out.println("Текст успішно записаний до файлу.");
        } catch (IOException e) {
            System.err.println("Помилка запису до файлу: " + e.getMessage());
        }

        // Виведення вмісту файлу на екран
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Вміст файлу:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Помилка читання з файлу: " + e.getMessage());
        }
    }
}
