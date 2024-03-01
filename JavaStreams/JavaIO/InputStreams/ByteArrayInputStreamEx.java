package JavaStreams.JavaIO.InputStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamEx {
    public static void main(String[] args) throws IOException {
        byte[] filePath = "EXAMPLE OF BYTE ARRAY STREAMS".getBytes();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(filePath);

        int readData;
        while ((readData = byteArrayInputStream.read()) != -1) {
            System.out.print((char) readData);
        }
        byteArrayInputStream.close();
    }

}
