package connection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("Green");
		a.add("Green");
		a.add("Blue");
		a.add("Red");
		System.out.println(a);
		String s = a.get(2);
		System.out.println(s);
		a.set(1,"White");
		System.out.println(a);
		System.out.println(a.indexOf("Red"));
		System.out.println(a.lastIndexOf("Red"));
		a.remove(2);
		System.out.println(a);
		System.out.println(a.contains("Red"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}
	}
