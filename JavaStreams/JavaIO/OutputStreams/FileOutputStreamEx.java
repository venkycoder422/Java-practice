package JavaStreams.JavaIO.OutputStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "JavaStreams/JavaIO/write.txt";

        try {
            FileOutputStream fos = new FileOutputStream(filePath);

            String content = "Important when working with files. These classes are fundamental for reading from and writing to files.";

            fos.write(content.getBytes());

            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
}
