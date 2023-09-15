package CRUD_Operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        File file = new File("my_file.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter writer = new FileWriter(file);
        writer.write("This is my file.");
        writer.close();
    }
}
