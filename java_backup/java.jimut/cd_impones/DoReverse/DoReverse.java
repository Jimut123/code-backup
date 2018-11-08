// Project folder:  ...\Source_IX\Chapter 16\DoReverse
    // Demonstration of do-while statement to print any number in reverse order.
	import java.io.*;
    class DoReverse {
  		public static void main(String args[]) throws IOException {
            int value, r_digit;
  		    BufferedReader stdin = 
				new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter any number : ");
            value = Integer.parseInt(stdin.readLine());
            if (value <= 0)
                return; // If you enter 0, it will return nothing.
            System.out.println("The original number is : " + value);
            System.out.print("The reverse number is : ");
            do 
            {
                r_digit = value % 10;
                System.out.print(r_digit);
                value = value / 10;
            } while (value != 0);
        }
	}