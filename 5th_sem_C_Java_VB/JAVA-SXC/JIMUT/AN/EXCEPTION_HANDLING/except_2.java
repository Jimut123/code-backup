// write a program to trap Array Index out of bounds  exception
import java.io.*;
class except_2
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader ab = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(ab);
		String n;
		int i;
		double div;
		System.out.println("Enter the limit of the array = ");
		n = cd.readLine();
		try
		{
			String arr[] =  new String[Integer.parseInt(n)];
		}
		catch (NumberFormatException nfe) 
		{
			 System.out.println("Number format exception! enter a nummber not String ...");
   			 nfe.printStackTrace();
		}
		try
		{
			for(i=0;i<Integer.parseInt(n);i++)
			{
				System.out.println("Enter the "+(i+1)+" element : ");
				arr[i] = cd.readline();
			}
			div = Integer.parseInt(arr[0])/Integer.parseInt(arr[Integer.parseInt(n)-1]);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Divide by zero error! try different set of data ...");
		}
		catch (NumberFormatException nfe) {
			 System.out.println("Number format exception! enter a nummber not String ...");
   			 nfe.printStackTrace();
		}
		finally
		{
			System.out.println("Some Error!");
		}
	}
}