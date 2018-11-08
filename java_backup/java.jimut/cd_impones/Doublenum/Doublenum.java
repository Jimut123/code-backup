// Project folder:  ...\Source_IX\Chapter 17\Doublenum
	// Doubles the user's number
	import java.io.*;
	class Doublenum {
		int doub(int num)
		{
			int d_num;
			d_num = num * 2;	// Double the number
			return (d_num);	// Return the result
		}
		public static void main(String args[]) throws IOException {
		       	BufferedReader stdin = 
				new BufferedReader (new InputStreamReader(System.in));
			Doublenum Doub = new Doublenum();
			int number;	// Holds user's input
			int d_number;	// Will hold double the user's input
			System.out.println("What number do you want doubled ? ");
			number = Integer.parseInt(stdin.readLine());
			d_number = Doub.doub(number);	 // Assign return value
			System.out.println("Double of  " + number + " is " + d_number);
		}
	}
