package sampleinterface;

public class Child implements Parent {
    
    public void display() {
        System.out.println("This is the Child class");
    }

    public void print() {
        System.out.println("This is the print method");
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();  
        obj.print();    
    }
}
