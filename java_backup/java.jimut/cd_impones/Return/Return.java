// Project folder:  ...\Source_IX\Chapter 16\Return
	// Demonstration of return statement
	class Return {
  		public static void main(String args[])  {
			boolean flag = true;
			System.out.println("Statement before return.");
			if (flag)
      				return; // return to caller
			System.out.println("Never execute this line");
  		}
	}