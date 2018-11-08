// Project folder:  ...\Source_IX\Chapter 15\CommaOP
	// Demonstration of comma operator
	class CommaOP
	{
 		public static void main(String[] args) 
		{
  			// Comma operators using int data type
			int num, sq, cube;
    			num = 4;
			// Calculate the square and cube of the number
			sq = (num * num);
    			cube = (num * num * num);
  			System.out.println("The square of " + num + " is " + sq);
  			System.out.println("\nThe cube of " + num + " is " + cube);
 		}
	}