// Project folder:  ...\Source_IX\Chapter 16\GCD
		/* This program find the greatest common divisor of two numbers. */
		import java.io.*;
		public class GCD
		{
			public static void main(String[] args) throws IOException 
    			{
				BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));      
				int r, x, y, r1;
				System.out.println("Enter first number : ");
				x = Integer.parseInt(stdin.readLine());
				System.out.println("Enter second number : ");
				y = Integer.parseInt(stdin.readLine());
				r = 0;
				r1 = 0;
				while (r == 0)
				{
					if (x < y)
		  			{
		      				r = x % y;
		      				r1 = y / x;
		  			}
					else
		  			{
		      				r = y % x;
		      				r1 = x / y;
		  			}
		  			y = x;
		  			x = r;
	   			}
       				System.out.println("\nGreatest common divisor is  -> " + r);
    			}
		}