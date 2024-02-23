package object_read_write;

public class DirectAcces {
    public static void main(String args[]){
         User user = new User();
        //  user.name="userId"; it will say not visible bacuse of name is private;
        // Long userId = user.userId = 12223L;
        String name = user.name = "Venky";
        System.out.println(name); 
        // System.out.println(userId);
    }
}


class User{
    // private Long userId;
    public String name;
}
