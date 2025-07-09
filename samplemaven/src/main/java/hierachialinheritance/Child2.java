package hierachialinheritance;

public class Child2 extends Parent
{
public void display2()
{
	System.out.println("This is child2 Method");
}
	public static void main(String[] args) 
	{
Child2 obj =new Child2();
obj.display();
obj.display2();
	}

}
