// Project folder:  ...\Source_IX\Chapter 17\passdouble
	// Program to demonstrate double type parameter
	import java.io.*;
	class passdouble {
		void cal_power(double base, double power)
		{
			double dans=1;
			for (int i = 1; i<=power; i++)
			{
				dans = dans * base;
			}
			System.out.println("The result is : " + dans);
		}
		public static void main(String args[]) throws IOException{
	      		BufferedReader stdin = 
				new BufferedReader (new InputStreamReader(System.in));
	   		passdouble Pr = new passdouble();
			double db, dp;
			System.out.println("Enter the base number : ");
			db = Integer.parseInt(stdin.readLine());
			System.out.println("Enter the power : ");
			dp = Integer.parseInt(stdin.readLine());
			Pr.cal_power(db, dp);
		}
	}