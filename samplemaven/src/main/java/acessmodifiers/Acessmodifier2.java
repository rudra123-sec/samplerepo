package acessmodifiers;

public class Acessmodifier2 {

    public static void main(String[] args) {
        Acessmodifier1 obj = new Acessmodifier1();
        obj.display();            // Public method accessible anywhere
        // obj.displayPrivate();  // Error: private method not accessible here
        obj.displayProtected();   // Accessible in same package & subclasses
        obj.displayDefault();     // Accessible in same package
    }
}
