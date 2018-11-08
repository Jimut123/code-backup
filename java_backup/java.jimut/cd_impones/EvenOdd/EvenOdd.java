// Project folder:  ...\Source_IX\Chapter 16\EvenOdd
		/* Program to find even or odd */
		import java.io.*;
		public class EvenOdd
		{
			public static void main(String[] args) throws IOException 
    			{
				BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));      
				int n, i, flag = 0;
        				System.out.println("Enter any number => ");
        				n = Integer.parseInt(stdin.readLine());
        				if ((n%2) == 0)
					System.out.println(n + " is even");
        				else
            					System.out.println(n + " is odd");
     			}
		}