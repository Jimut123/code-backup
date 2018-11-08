// Project folder:  ...\Source_IX\Chapter 16\ComputeAverage
		/*
		* The zero is not counted as part of the data to be averaged. The program does not check whether the user's input is positive, so it will actually work for both positive and negative input values. */
		import java.io.*;
		public class ComputeAverage {
			public static void main(String[] args) throws IOException {
				BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
				System.out.println("Enter any number : ");
				int inputNumber;   // One of the integers input by the user.
				int sum;           // The sum of the positive integers.
				int count;         // The number of positive integers.
				double average;    // The average of the positive integers.
				/* Initialize the summation and counting variables. */
      				sum = 0;
				count = 0;
				/* Read and process the user's input. */
				System.out.println("Enter your first positive integer: ");
				inputNumber = Integer.parseInt(stdin.readLine());
				while (inputNumber != 0) 
				{
					sum += inputNumber;   // Add inputNumber to running sum.
					count++;              // Count the input by adding 1 to count.
					System.out.println("Enter your next positive integer, or 0 to end: ");
					inputNumber = Integer.parseInt(stdin.readLine());
				}
				/* Display the result. */
				if (count == 0) {
					System.out.println("You didn't enter any data!");
				}
      				else {
					average = ((double)sum) / count;
					System.out.println("\n");
					System.out.println("You entered " + count + " positive integers.");
					System.out.println("Their average is %1.3f.\n" + average);
				}
 			} // end main()
   		} // end class ComputeAverage