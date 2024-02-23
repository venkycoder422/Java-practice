package final_keyword;



   final  class Student{
       
        final double pi = 3.14;
      
        public final void credential(){
            String name = "VENKY";
            String password = "12@12";
        }
        
        public void showStudent(){
            System.out.println("Show class");
        }

    }

    // class Derived extends Student{
    //     public void credential(){
            
    //     }
    // }

public class FinalKeyword {
    // final - variable,method,class uses
   
    // variables - the variables are constant - unchangeble


    public static void main(String[] args) {
        
        Student student = new Student();
        student.showStudent();
    }
}
