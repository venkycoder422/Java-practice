package static_keyword;

class Student{
    int sNo;
    String sName;
   static String collegeName="SV Degree College";
}
public class StaticKeyword {
    public static void main(String[] args) {
        Student student = new Student();
        student.sNo = 1;
        student.sName = "Venkatesulu";
        System.out.println(student.sName);
        System.out.print(student.collegeName);
    }
}
