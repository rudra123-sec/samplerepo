package staticexample;

public class Person {

    static String name;
    static int age;

   
    public static void setDetails(String n, int a)
    {
        name = n;
        age = a;
    }

   
    public static void getDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) 
    {
       
        Person p = new Person();

      
        p.setDetails("Rudra Aravind", 31);
        p.getDetails();
    }
}
