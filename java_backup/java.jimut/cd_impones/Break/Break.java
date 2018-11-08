// Project folder:  ...\Source_IX\Chapter 16\Break
	// Demonstration of break statement
	class Break {
		public static void main(String args[])  {
      			int i = 0;
           			while (i <= 100)
         			{
           				System.out.println(i);
				// The while loop will be terminated when i = 10
				if (i==10)  
				{
					System.out.println("break is valid");
					break;
				}
				i++;
			}
		}
	}