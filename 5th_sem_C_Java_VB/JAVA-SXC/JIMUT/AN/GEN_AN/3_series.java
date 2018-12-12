import java.io.*;
class Series
{
        public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
				System.out.println("Enter n :");
				int n = Integer.parseInt(cd.readLine());
                Calc ob = new Calc();
				int sumq = ob.sum(n);
				System.out.println("Sum :"+sumq);
        }
		
}
class Calc
{
	int sum(int n)throws IOException
	{
		int sum1=0,sumf=0;
		int i,j;
		for(i=1;i<=n;i++)
		{
			System.out.print(" (");
			sum1=0;
			for(j=1;j<=i;j++)
			{
				if(j<i)
					System.out.print(""+j+"+");
				else
					System.out.print(j);
				sum1 = sum1+j;
			}
			if(i<n)
				System.out.print(") +");
			else
				System.out.print(") : ");
			sumf = sumf+sum1;
		}
		return sumf;
	}
}