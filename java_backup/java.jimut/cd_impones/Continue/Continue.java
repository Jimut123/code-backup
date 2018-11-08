// Project folder:  ...\Source_IX\Chapter 16\Continue
	// Demonstration of continue statement 
	class Continue {
  		public static void main(String args[])  {
			int ctr;
			for (ctr = 1; ctr <= 10; ctr++)	// Loop 10 times
			{
				System.out.print(ctr + "    ");
				if (ctr % 2 == 0)
	 				continue;	// Cause body to end early
				System.out.println("  ");
			}
  		}
	}