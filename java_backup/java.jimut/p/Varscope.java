// Project folder:  ...\Source_IX\Chapter 17\Varscope
	// Program illustrate the scope of variables
	import java.io.*;
	class Varscope {
		public int i;	  // i is a global variable
		void scope(int a)	// a is a formal variable
		{
			int n;
			n = a;		// n is Local variable for function scope
			for (i = 1; i <= 5; i++)
			{
		   		n = n + i;
			}
			System.out.println("Value after addition is " + n);
		}
		public static void main(String args[]) throws IOException {
		      BufferedReader stdin = 
				new BufferedReader (new InputStreamReader(System.in));
	   		Varscope Scp = new Varscope();
			int b;		  // b is Local variable for main()
			System.out.println("Enter the value of b : ");
			b = Integer.parseInt(stdin.readLine());
			Scp.scope(b);	 //  b is an actual variable
		}
}