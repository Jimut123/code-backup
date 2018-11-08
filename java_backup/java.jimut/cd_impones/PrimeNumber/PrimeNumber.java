// Project folder:  ...\Source_IX\Chapter 16\PrimeNumber
		/*Program to find whether a number is prime or not */
		import java.io.*;
		public class PrimeNumber
		{
	    		public static void main(String[] args) throws IOException 
			{
				BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));      
				int n, i, flag = 0;
				System.out.println("Enter any number => ");
        				n = Integer.parseInt(stdin.readLine());
				i = 2;
				while (i < n)
				{
					if (n % i == 0)
		  			{
						flag = 1;
						break;
					}
					i++;
				}
				if (flag == 1)
		  			System.out.println("The number is not prime ");
				else
					System.out.println("The number is prime ");
			}
		}