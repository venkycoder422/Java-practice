package JavaStreams.JavaIO.OutputStreams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEx {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        String content = "Hello, ByteArrayOutputStream!";

        try {
            byteArrayOutputStream.write(content.getBytes());
            
            byte[] byteArray = byteArrayOutputStream.toByteArray();

            // Process the byte array (in this example, just printing as characters)
            System.out.println(new String(byteArray));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

   
}
