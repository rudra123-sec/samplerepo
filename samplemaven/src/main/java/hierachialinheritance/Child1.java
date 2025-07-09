package hierachialinheritance;

public class Child1 extends Parent
{
public void display1()
{
	System.out.println("This is child1 Method");
}
    

    public static void main(String[] args)
    {
Child1 obj =new Child1();
obj.display();
obj.display1();
        
    }
}
