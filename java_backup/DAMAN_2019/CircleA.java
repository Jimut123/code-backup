import java.io.*;
class CircleA
{
	public static void main ( String args[]) throws IOException
	{ 
		InputStreamReader ab= new InputStreamReader(System.in);
		BufferedReader cd= new BufferedReader(ab);
		System.out.println ("Enter the radius");
		double a,b,r;
		r = Double.parseDouble(cd.readLine());
		a = 3.14*r*r;
	    b = 2*3.14*r;
		System.out.println ("Area= "+a+" cir= "+b);
	}
}


