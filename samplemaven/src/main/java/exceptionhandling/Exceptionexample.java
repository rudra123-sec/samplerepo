package exceptionhandling;

public class Exceptionexample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a / b; // Will throw ArithmeticException
            System.out.println("Result: " + c);
        }
        catch (ArithmeticException e) {
            b = 6; // Fixing divisor to avoid exception
            int d = a / b;
            System.out.println("Handled Result: " + d);
            System.out.println("Exception caught: " + e);
        } 
        finally 
        {
            System.out.println("mandatory");
        }
    }
}
