/**
 * Practice 01 Math Iterative
 * CS 245 - Functions to calculate Factorials & Fibonacci numbers iteratively. 
 * Code Source - geeksforgeeks.com
 */

public class Practice01MathIterative implements Practice01Math
{
	public int fact(int n) throws Exception
	{
		int output = 1; 
		
		if (n < 0) // Checks for negative values, if found then an exception is thrown
		{
			throw new Exception(); 
		}

		for (int i = 2; i <= n; i++)
		{
			output *= i; 
		}

		return output; 
	}

	public int fib(int n)
	{
		int f[] = new int[n+2]; 

		f[0] = 0; 
		f[1] = 1; 

		for(int i = 2; i <= n; i++)
		{
			f[i] = f[i-1] + f[i-2]; 
		}

		return f[n]; 

	}
}