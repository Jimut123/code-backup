// Project folder:  ...\Source_IX\Chapter 17\passvoid
	// Program illustrate type void as an argument
	import java.io.*;
	class passvoid {
		void sum_num()
		{
			int i, sum = 0;
			for (i = 1; i <= 10; i++)
			sum+=i;
			System.out.print(sum);
		}
		public static void main(String args[]) throws IOException{
    			passvoid SM = new passvoid();
			System.out.print("Sum of first 10 natural numbers is : ");
			SM.sum_num();
		}
	}