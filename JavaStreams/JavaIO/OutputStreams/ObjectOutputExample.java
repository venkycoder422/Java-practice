package JavaStreams.JavaIO.OutputStreams;

import java.io.*;

public class ObjectOutputExample {

    public static void main(String[] args) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {

            Person person = new Person("John Doe", 30);

            objectOutputStream.writeObject(person);

            byte[] byteArray = byteArrayOutputStream.toByteArray();

            System.out.println("Data written: " + new String(byteArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Required for Serializable

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}
