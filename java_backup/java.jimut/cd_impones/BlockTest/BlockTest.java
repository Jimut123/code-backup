// Project folder:  ...\Source_IX\Chapter 14\BlockTest
	public class BlockTest {
		static int myClassInt = 100;
		public static void main(String args[]) {
			System.out.println("myClassInt before block: " + myClassInt);
			int localInt = 1;
			System.out.println("localInt before block: " + localInt);
			//starting a block
			{
				//this will shadow, or hide, the instance
				//version of myClassInt
				int myClassInt = 1;
				System.out.println("myClassInt inside block: " + myClassInt);
				//BROKEN: This cannot compile because localInt is
				//already declared int localInt = 2;
				System.out.println("localInt inside block: " + localInt);
				int blockInt = 1;
				System.out.println("blockInt inside block: " + blockInt);
			}
			//this now references the instance version
			//of myClassInt again
			System.out.println("myClassInt after block: " + myClassInt);
			// BROKEN: This cannot compile because
			// blockInt no longer exists
			//System.out.println(
			//   "blockInt inside block: " + blockInt);
		}
	}