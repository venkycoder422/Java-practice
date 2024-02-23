package encapsulation;

class Human{
    private  String username = "venkat";
    private String password = "12@2212";
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    

}

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setUsername("VENKAt22");
        human.setPassword("122@@");

        System.out.println(human.getUsername()+":"+human.getPassword());
    }
}
