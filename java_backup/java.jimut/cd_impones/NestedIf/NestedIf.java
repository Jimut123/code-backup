// Project folder:  ...\Source_IX\Chapter 16\NestedIF
import java.io.*;
// Demonstrates Nested If to find greatest among three numbers
class NestedIf {
    public static void main(String args[]) throws IOException {
        BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	        int fn, sn, tn; // Declare three different variable
        System.out.print("What is the first number? ");                
        		fn = Integer.parseInt(stdin.readLine());
		System.out.print("What is the second number? ");
		sn = Integer.parseInt(stdin.readLine());
		System.out.print("What is the third number? ");
		tn = Integer.parseInt(stdin.readLine());
		if ((fn > sn) && (fn > tn))
        {
            System.out.println("The bigger value is " + fn);
        }
		else
		  if ((sn > tn) && (sn > fn))
		  {
		      System.out.println("The bigger value is " + sn);
		  }
          else
          {
            System.out.println("The bigger value is " + sn);
      }
    }
}