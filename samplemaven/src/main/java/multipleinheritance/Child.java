package multipleinheritance;

public class Child implements Parent1,Parent2
{
public void print()
{
	System.out.println("Print");
}
public void show()
{
	System.out.println("show");
}
	public static void main(String[] args) 
	{
		Child obj= new Child();
		obj.print();
		obj.show();

	}

}
