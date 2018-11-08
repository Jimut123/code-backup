// Project folder:  ...\Source_IX\Chapter 17\Average
	// Calculates the average of three integer values with
	// return concept.
	class Average {
		float calc_avg(int num1, int num2, int num3) // Returns int type
		{
      			float local_avg;
      			local_avg = (float) (num1 + num2 + num3)/3;
      			return local_avg;   // Returned the average value
		}
		public static void main(String args[]) {
    			Average AVG = new Average();
			int num1 = 20;
			int num2 = 40;
    			int num3 = 50;
			float avg;		// Will hold the return value
			// Call the method, passing the numbers, and
			// accept return value
			avg = AVG.calc_avg(num1, num2, num3);
			System.out.println("The average is " + avg);
 		}	
	}
