import java.io.*;
class Fibo
{
	public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
		Fibo ob = new Fibo();
		System.out.println("\n Enter a no. : ");
		int k = Integer.parseInt(cd.readLine());
		int sum = ob.fibo(k);
		System.out.println("\n The "+k+" th fibonacci no. is : "+sum);
	}
	int fibo(int n)
	{
		if (n==0)
			return 0;
		else if(n>0)
			return fibo(n-1) + fibo(n-2);
		return 1;

	}
}
