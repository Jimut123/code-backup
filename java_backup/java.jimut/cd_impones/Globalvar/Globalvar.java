	// Program illustrate local variable hide global variable with same name.
	class Globalvar {
		public int i; // i is a global variable
		void Scope2()
		{
			i = 20;
		}
		public static void main(String args[]) {
			Globalvar SC = new Globalvar(); // Use of constructor
			int i = 40;		  // i is Local variable for main()
			System.out.print("Variable i = " + i);
		}
	}
