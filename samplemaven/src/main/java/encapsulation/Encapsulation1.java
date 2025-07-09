package encapsulation;

public class Encapsulation1 {
    // Private fields
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name; // using this keyword
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age; // using this keyword
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
