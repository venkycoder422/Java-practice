package JavaStreams.JavaIO.OutputStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
    public static void main(String[] args) {
        String filePath = "JavaStreams/JavaIO/write.txt";

      
        try {
        FileOutputStream  fileOutputStream = new FileOutputStream(filePath);
        BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);

        String content = "Buffered streams add a layer of buffering, reducing the number of direct writes to the underlying stream.";

        bos.write(content.getBytes());

        bos.close();
        fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
