package class_struc_exc_prgm;

import java.util.Date;

public class ClassMain {
    public static void main(String args[]) {
        StructJavaClass strctJavaClass = new StructJavaClass();
        Equals Equals = new Equals();
        Operator operator = new Operator();
        Marks marks = new Marks();
        Date date = new Date();
        strctJavaClass.name = "Venky";
        strctJavaClass.dbo = date;
        System.out.println(strctJavaClass);
        String name = "venky";
        String surname = "venky";
        System.out.println(name == surname);
        // System.out.println(Equals==operator);
        System.out.println(operator.equals(Equals));
    }
}

class StructJavaClass extends Marks {
    public String name;
    public Date dbo;
}
class Marks {
    public String subject = "TELUGU";
    public int marks = 100;

    @Override
    public String toString() {
        return "Subject: " + subject + ", Marks: " + marks;
    }
}

class Equals{
    public String name="venky";
}

class Operator{
    public String name = "venky";
}
