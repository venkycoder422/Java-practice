package JavaStreams.JavaIO.InputStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamUsage {
    public static void main(String[] args) {
        // Reading a File from the Classpath

        String filePath = "C:\\Users\\swfn0\\Java basics\\JavaStreams\\JavaIO\\read.txt";

        try {
            // Create a FileInputStream to read the file
            FileInputStream fileInputStream = new FileInputStream(filePath);

            // Wrap it in a BufferedInputStream for improved performance
            // BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            // Read the file byte by byte
            int data;
            while ((data = fileInputStream.read()) != -1) {
                // Process the byte (in this example, just printing the character)
                System.out.print((char) data);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
