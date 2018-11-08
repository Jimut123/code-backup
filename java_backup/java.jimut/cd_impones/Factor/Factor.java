// Project folder:  ...\Source_IX\Chapter 16\Factor
		import java.io.*;
		// Program Code : Factor.java
		// Program to find factors of a number
		class Factor {
		  	public static void main(String args[]) throws IOException {
		        		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
				System.out.print("Enter any number : ");
				int N = Integer.parseInt(stdin.readLine());
		  		int i;
				System.out.print("The factors of " + N + " are: ");
				for (i = 1; i<=N; i++) {
					if (N%i == 0)
						System.out.print(i + " ");
				}
				System.out.println();
		  	}
		}