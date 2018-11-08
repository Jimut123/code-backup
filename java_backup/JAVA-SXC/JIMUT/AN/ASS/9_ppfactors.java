import java.io.*;
class Prime
{
	int isPrime(int n) // 0 for not prime and 1 for prime
	{
	int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				return 0;

		}
		return 1;
	}

}
class Factor extends Prime
{
	public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
		Factor ob = new Factor();
		int i=1;
		int n;
		System.out.println("Enter the number : ");
		n = Integer.parseInt(cd.readLine());
		int count;
		while(i++<n)
		{
			if(n%i==0)
			{
				count=0;
				if(ob.isPrime(i)==1)
				{
					while(n%i==0)
					{
						// not entered!
						//System.out.println("Entered!"+n);
						n=n/i;
						count++;
					}
					System.out.println("The power of "+i+" is : "+count);
				}
			}
		}
	}
}
