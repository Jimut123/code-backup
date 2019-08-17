import java.io.*;
class Subtraction
{
	public static void main(String args []) throws IOException
	{
	       InputStreamReader ab = new InputStreamReader(System.in);
	       BufferedReader cd = new BufferedReader(ab);
	       System.out.println("Enter 2 numbers: ");
	       int a,b,c;
	       a = Integer. parseInt(cd.readLine());
	       b = Integer.parseInt(cd.readLine());
	       c = a-b;
	       System.out.println("sub = "+c);
	}
}
