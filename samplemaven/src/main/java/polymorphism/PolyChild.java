package polymorphism;

public class PolyChild extends PolyParent

{
 public void sum(int a, int b)
    {
        System.out.println("Child Subtraction: " + (a - b));
    }

    public static void main(String[] args) 
    {
        PolyChild obj = new PolyChild();  
        obj.sum(20, 10);  
    }
}