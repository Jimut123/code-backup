// Project folder:  ...\Source_IX\Chapter 15\GTwo
	import java.io.*;
	// Demonstrate relational operators with conditional operatorin Java
	public class GTwo
	{
	    public static void main(String[] args) throws IOException 
	    {
	            BufferedReader stdin = 
				new BufferedReader (new InputStreamReader(System.in));
	            int num1, num2, Max;
	            System.out.print("Enter a number for num1 : ");
	            num1 = Integer.parseInt(stdin.readLine());
	            System.out.print("Enter another number for num2 : ");
	            num2 = Integer.parseInt(stdin.readLine());
	            Max = num1 > num2 ? num1 : num2;
	            System.out.println("Greatest number is " + Max);
	    }
	}