package encapsulation;

public class Encapsulation1 {

   private String name;
    private int age;

 
    public void setName(String name) {
        this.name = name; // using this keyword
    }

   
    public String getName() {
        return this.name;
    }

    
    public void setAge(int age) {
        this.age = age; // using this keyword
    }

  
    public int getAge() {
        return this.age;
    }

 
    public void displayInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
