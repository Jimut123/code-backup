// Project folder:  ...\Source_IX\Chapter 16\Temper
	import java.io.*;
	// Printing a message
	class Temper {
		final static int TEMP = 15;
	  	public static void main(String args[]) throws IOException {
        			BufferedReader stdin = 
				new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter the temperature : ");
			int temperature = Integer.parseInt(stdin.readLine());
			System.out.println("Current temperature : " + temperature);
			if (temperature < TEMP)
				System.out.println("It's cold at here");
		}
	}