package JavaStreams.JavaIO.InputStreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamEx {
    public static void main(String[] args) throws ClassNotFoundException {
        byte[] serializedObjectData = getSerializedObjectData();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedObjectData);
        try {
            ObjectInputStream objectOutputStream = new ObjectInputStream(byteArrayInputStream);
            Person person = (Person) objectOutputStream.readObject();
              System.out.println("Read object: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }

    private static byte[] getSerializedObjectData() {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {

            Person person = new Person("John Doe", 30);
            objectOutputStream.writeObject(person);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }
}
