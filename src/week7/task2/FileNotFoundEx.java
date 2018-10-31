package week7.task2;

import java.io.*;

/**
 *  lỗi FileNotFoundException
 */
public class FileNotFoundEx {
    public static void main(String[] args) {
        FileNotFoundEx fileNotFoundEx = new FileNotFoundEx();
        try {
            fileNotFoundEx.throwEx();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }
    private void throwEx() throws FileNotFoundException {
        File file = new File("file.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
    }
    private void throwEx2() throws IOException {
        File file = new File("file.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.close();
    }
}
