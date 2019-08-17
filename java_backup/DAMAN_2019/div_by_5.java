import java.io.*;
class div_by_5
{
	public static void main (String args[])throws IOException
	{
		InputStreamReader ab = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(ab);
		System.out.println("Enter 1 number");
		int n;
		n = Integer.parseInt(cd.readLine());
		if(n % 5 == 0)
		{
			System.out.println("It is divisible");
		}
		else
		{
			System.out.println("It is not divisible");
		}
	}
}



