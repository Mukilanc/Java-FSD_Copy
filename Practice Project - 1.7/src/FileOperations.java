import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws IOException {

        File file = new File("my_file.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello, world!");
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        char[] buffer = new char[1024];
        int bytesRead = fileReader.read(buffer);
        String content = new String(buffer, 0, bytesRead);
        fileReader.close();

        System.out.println(content);

        fileWriter = new FileWriter(file);
        fileWriter.write("Goodbye, world!");
        fileWriter.close();

        fileReader = new FileReader(file);
        buffer = new char[1024];
        bytesRead = fileReader.read(buffer);
        content = new String(buffer, 0, bytesRead);
        fileReader.close();

        System.out.println(content);

        // Delete the file
        file.delete();
    }
}
