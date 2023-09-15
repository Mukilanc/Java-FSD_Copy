package CRUD_Operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {

    public static void main(String[] args) throws IOException {
        File file = new File("my_file.txt");

        FileWriter writer = new FileWriter(file, true);
        writer.write("\nThis is an update to my file.");
        writer.close();
    }
}
