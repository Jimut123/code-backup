// Project folder:  ...\Source_IX\Chapter 16\Factorial
import java.io.*;
// Demonstration of while statement to find the factorial of number 10.
class Factorial {
  	public static void main(String args[]) throws IOException {
        		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter any number : ");
		int N = Integer.parseInt(stdin.readLine());
  		int i;
		double fact = 1;
		i = 1;
		while (i <= N)
		{
			fact = fact * i;
			i++;
		}
		System.out.print("The factorial of " + N + " is " + (double)fact);
  	}
}