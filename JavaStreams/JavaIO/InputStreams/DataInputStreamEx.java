package JavaStreams.JavaIO.InputStreams;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamEx {
    public static void main(String[] args) {
        byte[] byteArray = { 65, 66, 67, 68, 69, 70 };

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);

        try {
            int intValue = dataInputStream.readInt();           
            short shortValue = dataInputStream.readShort();
            // byte byteValue = dataInputStream.readByte(); 
            System.out.println("Read int value: " + intValue);
            System.out.println("Read short value: " + shortValue);
            // System.out.println("Read byte value: " + byteValue); // Throws an error due to not found value in it.
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
