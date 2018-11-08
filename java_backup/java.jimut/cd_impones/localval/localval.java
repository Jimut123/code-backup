// Project folder:  ...\Source_IX\Chapter 17\localval
	// Program initialize the local variable to some value
	class localval
	{
		private int a;
		void fun()
		{
			a = 5;
			System.out.print(a + "        ");
			a++;
		}
		public static void main(String args[])
		{
   			localval LC = new localval();
			LC.fun();
			LC.fun();
			LC.fun();
		}
	}