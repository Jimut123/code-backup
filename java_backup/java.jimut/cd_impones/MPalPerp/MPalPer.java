// Project folder:  ...\Source_IX\Chapter 16\MPalPerp
		// Menu driven rogram to check whether a number is Palindrome or a Perfect number.
		import java.io.*;
		class MPalPer
		{
			// Method to check whether the number is a palindrome or not
			public static void CheckPal() throws IOException
			{
				int n, newnum, reverse=0, reminder=0;
				BufferedReader PIN = new BufferedReader (new InputStreamReader(System.in));
				System.out.print("Enter a number to check for palindrome");
				String num = PIN.readLine();
				n = Integer.parseInt(num);
				newnum = n;
				do {
					reminder = n % 10;
					reverse = reverse * 10 + reminder;
					n = n / 10;
				} while (n > 0);
				if (newnum == reverse)
					System.out.println("Number is palindrome");
				else
					System.out.println("Number is not palindrome");
			}
			// Method to check whether the number is a perfect number or not
			public static void CheckPerfect() throws IOException
			{
				int i=1, n, newnum, sum = 0;
				BufferedReader PIN = new BufferedReader (new InputStreamReader(System.in));
				System.out.print("Enter a number to check for perfect");
				String num = PIN.readLine();
				n = Integer.parseInt(num);
				newnum = n;
				while (i < n)
				{
					if (n % i == 0) // Checks if i is a factor of n
					{
						sum = sum + i;
					}
					i++;
				}
				if (sum == n)
					System.out.println("Number is perfect");
				else
					System.out.println("Number is not perfect");
			}
			public static void main(String arg[]) throws IOException
			{
		        		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
				System.out.println("\tMain Menu");
				System.out.println("\t---------");
				System.out.println("\t1. Palindrome");
				System.out.println("\t2. Perfect number");
				System.out.print("\tEnter choice: ");
				String ch = stdin.readLine();
				int ctr = Integer.parseInt(ch);
				switch (ctr)
				{
					case 1:  // Steps to check palindrome
						CheckPal();
						break;
					case 2:  // Steps to check perfect number
					                	CheckPerfect();
						break;
				            default:
					                	System.out.println("\tInvalid choice!!!");
         				}
			}
		}