// Project folder:  ...\Source_IX\Chapter 17\passaddress
	// Program that passes by address
	import java.io.*;
	class passaddress {
		void change_it(String name)
		{
			System.out.println("Original Name is " + name);
    			name = "India";
		}
		public static void main(String args[]) throws IOException{
    			passaddress add = new passaddress();
	    		String name = "Delhi";
    			add.change_it(name);
			System.out.println("Original Name is " + name);
		}
	}