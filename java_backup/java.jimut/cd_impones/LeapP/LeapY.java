// Project folder:  ...\Source_IX\Chapter 16\LeapP
		// Program Code : LeapY.java
		// Program to find all the leap year between 2000 - 2040.
		class LeapY {
		  	public static void main(String args[]) {
				System.out.println("Leap years between 2000-2040");
				int i;
  				for (i=2000; i<= 2040; i++)
		  		{
					if (i%4 == 0)
						System.out.print(i + " ");
				}
				System.out.println();
			}
		}