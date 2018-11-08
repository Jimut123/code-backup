// Project folder:  ...\Source_IX\Chapter 16\RealNum
		/* Prints the square of the input value if the input value is less than 180 */
		import java.io.*;
		public class RealNum
		{
			public static void main(String[] args) throws IOException 
    			{
        				BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));      
				int num, square;
				System.out.print("What number do you want to see the square of? ");
				num = Integer.parseInt(stdin.readLine());
				if (num < 120)
				{
					square = num * num;
					System.out.print("The square of " + num + " is " + square);
				}
				if (num >= 120)
				{
					System.out.print("*** Square is not allowed for numbers over 120 *** ");
					System.out.print("Run this program again and try a smaller value. ");
				}
				System.out.print("\nThank you for requesting squares.");
    			}
		}