import java.io.*;
class Diagonal
{
	public static void main ( String args[]) throws IOException
	{ 
		InputStreamReader ab= new InputStreamReader(System.in);
		BufferedReader cd= new BufferedReader(ab);
		System.out.println ("Enter 2 number");
		int a,b;
		double c;
		a = Integer.parseInt(cd.readLine());
		b = Integer.parseInt(cd.readLine());
	       	c = Math.sqrt(a*a+b*b);
		System.out.println ("Diagonal ="+c);
	}
}


