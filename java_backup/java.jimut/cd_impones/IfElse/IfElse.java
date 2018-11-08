// Project folder:  ...\Source_IX\Chapter 16\IfElse
	import java.io.*;
	// Demonstrates if-else by printing whether an input value is greater than 
	// zero or not.
	class IfElse {
  		public static void main(String args[]) throws IOException {
        			BufferedReader stdin = 
				new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter any number : ");
			int num = Integer.parseInt(stdin.readLine());
			int square;
			if (num > 0)
			{
				square = num * num;
		    		System.out.println("The number is greater than zero");
				System.out.println("The square of " + num + " is " + square);
			}
	    		else
      				System.out.println("The number is less than or equal to zero");
  		}
	}