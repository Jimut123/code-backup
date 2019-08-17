import java.io.*;
class Average
{
	public static void main ( String args[]) throws IOException
	{
		InputStreamReader ab= new InputStreamReader(System.in);
		BufferedReader cd= new BufferedReader(ab);
		System.out.println ("Enter 3 numbers:");
		int a,b,c;
		double d;
		a = Integer.parseInt(cd.readLine());
		b = Integer.parseInt(cd.readLine());
	       	c = Integer.parseInt(cd.readLine());
		d = (a+b+c)/3;
		System.out.println ("Average ="+d);
	}
}


