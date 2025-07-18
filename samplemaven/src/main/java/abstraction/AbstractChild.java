package abstraction;

public class AbstractChild extends AbstractParent
{

	public static void main(String[] args) 
	{
		
AbstractChild abs = new AbstractChild();
abs.display();
abs.print();
	}

	@Override
	public void display() {
		System.out.println("Display");
	}

	@Override
	public void print() {
		System.out.println("Print");
		
	}

}
