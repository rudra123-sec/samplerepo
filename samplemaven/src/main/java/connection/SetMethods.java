package connection;
import java.util.Set;
import java.util.HashSet;

public class SetMethods {

    public static void main(String[] args) {

        Set<String> a = new HashSet<>();
        a.add("Apple");
        a.add("Banana");
        a.add("Orange");
        System.out.println("Set A: " + a);

        Set<String> b = new HashSet<>();
        b.add("WaterMelon");
        b.add("Grapes");
        b.add("Dragonfruit");
        System.out.println("Set B: " + b);

        a.addAll(b);
        System.out.println("Set A after addAll(B): " + a);

        System.out.println("A contains all elements of B: " + a.containsAll(b));
        System.out.println("Is Set A empty? " + a.isEmpty());

        
        a.removeAll(b);

        a.remove("Apple");

        System.out.println("Size of Set A after removals: " + a.size());

     
        a.clear();
        System.out.println(a);
    }
}

