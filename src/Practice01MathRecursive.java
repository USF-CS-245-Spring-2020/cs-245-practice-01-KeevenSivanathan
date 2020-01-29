/**
 * Practice 01 Math Recursive
 * CS 245 - Functions to calculate Factorials & Fibonacci numbers recursively. 
 * Code Source - geeksforgeeks.com
 */

public class Practice01MathRecursive implements Practice01Math 
{
	public int fact(int n) throws Exception 
	{
		if (n < 0) // Checks for negative values, if found then an exception is thrown
		{
			throw new Exception(); 
		}

		if (n == 0)
		{
			return 1;
		}

		else
		{
			return (n*fact(n-1));
		}
	}

	public int fib(int n)
	{
		if (n <= 1) // Checks if n is less than 1 or equal to 1 then n is returned
		{
			return n; 
		}

		else
		{
			return fib(n-1) + fib(n-2); 
		}
	}
}
