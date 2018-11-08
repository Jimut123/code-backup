// Project folder:  ...\Source_IX\Chapter 16\Switch
// Demonstration of switch statement for finding sum and difference 
// of any two numbers.
class Switch {
  	public static void main(String args[]) throws java.io.IOException {
		int num1, num2;
    		char opt;
		int sum = 0, diff = 0;
   		num1 = 20;
    		num2 = 30;
  		System.out.println("1 - > for addition");
		System.out.println("2 - > for difference");
		System.out.println("Enter choice from above");
    		opt = (char) System.in.read();
		switch (opt)
		{
			case '1':
				sum = num1 + num2;
				break;
			case '2':
				if (num1 > num2)
					diff = num1 - num2;
				else
					diff = num2 - num1;
				break;

			default:
				System.out.println("Invalid option selected");
		}
		if (opt == '1')
			System.out.println("The sum of " + num1 + " and " + num2 + " is = " + sum);
		else
			if (opt == '2')
				System.out.println("The difference between " + num1 + " and " 
					+ num2 + " is = " + diff);
  	}
}