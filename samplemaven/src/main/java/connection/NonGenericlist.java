package connection;
import java.util.ArrayList;
		import java.util.List;

		public class NonGenericlist {

		    public static void main(String[] args) {
		        List a = new ArrayList();  
		        a.add("Green");
		        a.add("Green");
		        a.add("Blue");
		        a.add("Red");

		        System.out.println(a); 

		        String s = (String) a.get(2);  
		        System.out.println(s);

		        a.set(1, "White");  
		        System.out.println(a);

		        System.out.println(a.indexOf("Blue"));
		        System.out.println(a.lastIndexOf("Red"));

		        a.remove(2);  
		        System.out.println(a);

		        System.out.println(a.contains("Red"));  
		        System.out.println(a.isEmpty());       
		        System.out.println(a.size());          
		    }
		


	}


