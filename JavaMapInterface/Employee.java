package JavaMapInterface;

public class Employee {

    public Employee(long l, String string) {
        this.id = l;
        this.name = string;
    }

    private Long id;
    private String name;

    public String getName() {
        return this.name;
    }
    public Long getId() {
        return this.id;
    }

    // constructor, getters, setters
}