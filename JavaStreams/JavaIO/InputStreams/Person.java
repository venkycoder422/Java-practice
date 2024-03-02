package JavaStreams.JavaIO.InputStreams;

import java.io.Serializable;

public class Person implements Serializable{
    long serialId = 1L;
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
