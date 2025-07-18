package factorial;

public class FactorialExample {
	 public static void findFactorial(int n) 
	 {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) 
	        {
	            fact *= i;
	        }
	        System.out.println("Factorial of " + n + " is: " + fact);
	    }
	public static void main(String[] args)
	{
		int number = 5;
        findFactorial(number);

	}

}
