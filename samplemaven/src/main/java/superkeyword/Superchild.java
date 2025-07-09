package superkeyword;

public class Superchild extends Superparent {

    public void display() {
        super.display();  // Calls Parent's display()
        System.out.println("Display method in Child class");
    }

    public static void main(String[] args) {
        Superchild obj = new Superchild();
        obj.display();
    }
}