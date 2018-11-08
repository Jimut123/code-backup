// Project Folder: ...\Source_IX\Chapter 14\CHRead
	// Character input
	import java.io.*;
	class CHRead {
		public static void main(String[] arg) throws IOException {
			char ch;
			BufferedReader stdin = 
				new BufferedReader(new InputStreamReader(System.in));
			// Read character
			System.out.print("Enter a character: ");
			ch = (char) stdin.read();
			System.out.println("You input a character: "+ch);
		}
	}