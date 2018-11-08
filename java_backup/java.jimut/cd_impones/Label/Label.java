// Project folder:  ...\Source_IX\Chapter 16\Label
	// Demonstration of label statement to find the factorial of no 5.
	class Label {
		public static void main(String args[])  {
			int i, N = 5;
			float fact;
			i = 1;
			fact = 1;
			FACT: for (i=1; i<=N; i++)
    			{
  				if (i<=N)
	  			{
		  			fact = fact * i;
	  				continue FACT;
		  		}
  				else
	  				System.out.println("Invalid input ");
    			}
			if (N > 0)
				System.out.println("Factorial value of " + N + " is : " + fact);
		}
	}