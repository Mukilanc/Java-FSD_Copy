package CRUD_Operation;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("my_file.txt");

        if (file.exists()) {
            file.delete();
        }
    }
}
