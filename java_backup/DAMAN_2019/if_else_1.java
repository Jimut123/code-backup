import java.io.*;
class if_else_1
{
	public static void main ( String args[]) throws IOException
	{ 
		InputStreamReader ab= new InputStreamReader(System.in);
		BufferedReader cd= new BufferedReader(ab);
		System.out.println ("Enter 1 number");
		int n;
		n= Integer.parseInt(cd.readLine());
		if (n==1)
			System.out.println("It is one");
		else if(n==2)
			System.out.println("It is 2");
		else if(n==3)
			System.out.println("It is 3");
		else
			System.out.println("It is diffrent");
			
	}
}


