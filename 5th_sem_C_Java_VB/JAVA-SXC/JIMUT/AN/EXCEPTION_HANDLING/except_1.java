// write a program to trap arithmetic exception
import java.io.*;
class except_1
{
	public static void main(String args[])throws IOException
	{
			InputStreamReader ab = new InputStreamReader(System.in);
			BufferedReader cd = new BufferedReader(ab);
			int s=0,n;
			String a,b,c;
			//String str="";
			int nv=0,nd=0,nfex=0;
			do
			{
				try
				{	
					System.out.println("Enter a = ");
					a = cd.readLine();
					System.out.println("Enter b = ");
					b = cd.readLine();
					System.out.println("Enter c = ");
					c = cd.readLine();
					s=s+(Integer.parseInt(c)/(Integer.parseInt(a)-Integer.parseInt(b)));
					System.out.println("a = "+a+" b = "+b+" c = "+c+" s+c/(a-b) = "+s);
					nv++;
				}
				catch (ArithmeticException e)
				{
					System.out.println("Divide by zero error! try different set of data ...");
					nd++;
				}
				catch (NumberFormatException nfe) {
					System.out.println("Number format exception! enter a nummber not String ...");
           			 nfe.printStackTrace();
           			 nfex++;
       			 }
				System.out.println("Type 1 to continue -- >");
				n = Integer.parseInt(cd.readLine());
			}while(n==1);
			System.out.println("Sum = "+s);
			System.out.println("No. of valid data = "+nv);
			System.out.println("No. of invalid data ( Number format exception ) = "+nfex);
			System.out.println("No. of invalid data ( Divide by zero ) = "+nd);
			System.out.println("No. of total data = "+(nd+nv+nfex));
	}
}