// Project folder:  ...\Source_IX\Chapter 14\ConIO
	import java.io.*;  // needed for BufferedReader, InputStreamReader, etc.
	/** A Java program that demonstrates console based input and output. */
	public class ConIO
	{
		// Program execution starts here
        		public static void main ( String [] args ) throws IOException
        		{
			// Create a single shared BufferedReader for keyboard input
			BufferedReader stdin =
	            			new BufferedReader( new InputStreamReader( System.in ) );
			// Prompt the user
			System.out.print( "Please enter your name : " );
			// Read a line of text from the user.
		            	String input = stdin.readLine();
		            	// Display the input back to the user.
		            	System.out.println( "input = " + input );
		} // end main method
	} // end ConIO class