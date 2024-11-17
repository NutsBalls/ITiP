import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "Original.txt";
        String destinationFile = "Copy.txt";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return ;
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                    //outputStream.write('c');

                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файлов: " + e.getMessage());
                return;
            }
        }
        System.out.println("Копирование завершено успешно.");
    }
}
