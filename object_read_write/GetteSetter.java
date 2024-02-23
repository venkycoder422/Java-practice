package object_read_write;

import java.util.Date;

public class GetteSetter {
    public static void main(String args[]){
        Date date = new Date();
        Student student = new Student();
        Marks marks = new Marks();
        student.setStudentId("ANT2023001");
        student.setStudentName("Venkatesulu");
        student.setGender('M');
        student.setDob(date);
        marks.setSubject("Telugu");
        marks.setMarksSecured(70);

        System.out.println(student);
        System.out.println("--------------");
        System.out.println(marks);
        // System.out.println(student.toString());
        // System.out.println(marks.toString());
        
    }
}


class Student{
    private String studentId;
    private String studentName;
    private char gender;
    private Date dob;
    public void setStudentId(String string) {
        studentId = string;
    }
    public void setDob(Date date) {
        dob = date;
    }
    public void setGender(char c) {
        gender = c;
    }
    public void setStudentName(String string) {
        studentName = string;
    }
    @Override
    public String toString() {
        return "Student ID: " + studentId + "\n" +
               "Student Name: " + studentName + "\n" +
               "Gender: " + gender + "\n" +
               "Date of Birth: " + dob;
    }
   
}

class Marks{
    private String subject;
    private int marksSecured;
public void setSubject(String string) {
    subject = string;
}
public void setMarksSecured(int i) {
    marksSecured = i;
};

@Override
public String toString(){
    return "Subject: " + subject + "\n" +
          "Secured Marks: " + marksSecured;
}
}


