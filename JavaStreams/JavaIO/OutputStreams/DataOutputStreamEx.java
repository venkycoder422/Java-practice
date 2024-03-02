package JavaStreams.JavaIO.OutputStreams;
import java.io.*;

public class DataOutputStreamEx {
    public static void main(String[] args) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream)) {

            int intValue = 42;
            double doubleValue = 3.14;
            boolean booleanValue = true;

            dataOutputStream.writeInt(intValue);
            dataOutputStream.writeDouble(doubleValue);
            dataOutputStream.writeBoolean(booleanValue);

            byte[] byteArray = byteArrayOutputStream.toByteArray();

            System.out.println("Data written: " + new String(byteArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
