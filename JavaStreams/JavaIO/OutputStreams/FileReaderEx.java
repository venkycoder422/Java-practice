package JavaStreams.JavaIO.OutputStreams;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        String filePath = "JavaStreams/JavaIO/read.txt";
        // Reading character by character using read() method.
        // Suitable for reading text files.
        try {
            FileReader fileReader = new FileReader(filePath);
            int data;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
