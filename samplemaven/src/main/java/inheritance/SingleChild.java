package inheritance;

public class SingleChild extends SingleParent 
{
    
    public void print()
    {
        System.out.println("this is child class");
    }

    public static void main(String[] args) 
    {
        
        SingleChild obj = new SingleChild(); 
        
        obj.print();
        obj.display();
    }
}
