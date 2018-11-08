// Project folder:  ...\Source_IX\Chapter 15\TypeCase
	// Demonstration of typecasting method in Java
	class TypeCast
	{
		public static void main(String[] args) 
		{
			int	days = 40;	// Days since loan origination
			// Original loan amount
			float principal = (float)3000.00;	
			float interest_rate = (float)0.15;	// Annual interest rate
			float daily_interest;	// Daily interest rate
			// Typecast days to float
			daily_interest = interest_rate / (float)365;
			// Days is an interest, convert it to float
			daily_interest = principal * daily_interest * (float)days;
			// Update the principal with interest
			principal += daily_interest;	
		  	System.out.println("The balance you owe is " + principal);
 		}
	}
