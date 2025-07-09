package superkeyword;
public class SuperConstructorChild extends SuperConstructorParent {

    public SuperConstructorChild() {
        super();  // Calls the constructor of SuperConstructorParent
        System.out.println("Constructor of Child class");
    }

    public static void main(String[] args) {
        SuperConstructorChild obj = new SuperConstructorChild();
    }
}

