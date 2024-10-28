import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            double numerator = Double.parseDouble(args[0]);
            double denominator = Double.parseDouble(args[1]);

            double result = DivisionException.divide(numerator, denominator);
            System.out.printf("Результат деления: %.2f%n", result);
        } catch (CustomDivisionException e) {
            System.out.println("Ошибка: " + e.getMessage());
            logError(e);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенные данные не являются числами.");
            logError(e);
        }
    }

    public static void logError(Exception e) {
        try {
            File f = new File("log.txt");
            FileWriter fw = new FileWriter(f, true);
            fw.write(String.format("Ошибка: %s\n", e.getMessage()));
            fw.close();
        } catch (IOException i) {
            System.out.println("Не удалось записать данные в лог");
        }
    }
}

