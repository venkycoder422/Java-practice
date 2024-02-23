package java_loops;

public class BreakContinue {
    public static void main(String args[]){
        
        String names[] = {"Monday","Tuesday","Wendsday","Thurday","Friday","Saturday","Sunday"};

        for(String day : names){
            if(day=="Sunday" || day=="Saturday"){
                System.out.println("Its Holiday");
                break;
            }
        }
        System.out.println("------ Week days ------");
        for(String day : names){
            if(day=="Sunday" || day=="Saturday"){
                continue;
            }
              System.out.println(day);
        }
    }
}
