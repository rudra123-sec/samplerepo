package connection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) 
	{
		 Set<String> a = new HashSet<>();
	        a.add("Apple");
	    a.add("Orange");
	        a.add("Banana");
	        System.out.println("Set A: " + a);
	        Iterator i=a.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
i.remove();
System.out.println(a);
}
	
}