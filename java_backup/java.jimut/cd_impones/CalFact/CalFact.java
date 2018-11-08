// Project folder:  ...\Source_IX\Chapter 17\CalFact
	// Program to calculate a specific factorial number
	import java.io.*;
	class CalFact {
		void calc_fact(int n)
		{
			int i, fact = 1;
			for (i = 1; i <=n; ++i)
				fact *= i;
			System.out.println("The factorial of " + n + " is : " + fact);
		}
		public static void main(String args[]) throws IOException {
	    		CalFact nFact = new CalFact();
			// It reads bytes and translates them into characters according to 
			// a specified character encoding.
			InputStreamReader reader = new InputStreamReader(System.in);
			// Create a buffering character-input stream that uses a 
			// default-sized input buffer.
			BufferedReader input = new BufferedReader(reader);

	    		System.out.print("Enter the number to find the factorial : ");
		    	// readLine() Read a line of text and terminated by enter.
    			String num = input.readLine();
		    	// Converts the num to integer,
			// Converts the character n to integer
	    		int n = Integer.parseInt(num);
	    		nFact.calc_fact(n); // Passing value into method
		}
	}
