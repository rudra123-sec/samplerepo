package Multilevelinheritance;


public class Child extends Parent
{
    public void childMethod()
    {
        System.out.println("This is Child method");
    }

    public static void main(String[] args)
    {
        Child obj = new Child();

 
        obj.grandParentMethod();
        obj.parentMethod();
        obj.childMethod();
    }
}
