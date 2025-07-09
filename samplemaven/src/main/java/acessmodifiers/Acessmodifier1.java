package acessmodifiers;

public class Acessmodifier1 {
    public void display() {
        System.out.println("Public");
    }
    
    private void displayPrivate() {
        System.out.println("Private");
    }
    
    protected void displayProtected() {
        System.out.println("Protected");
    }
    
    void displayDefault() 
    {
        System.out.println("Default");
    }
    
    public static void main(String[] args) {
        Acessmodifier1 obj = new Acessmodifier1();
        
        obj.display();            // Public method accessible anywhere
        obj.displayPrivate();     // Accessible only within this class
        obj.displayProtected();   // Accessible in same package & subclasses
        obj.displayDefault();     // Accessible in same package
    }
}
