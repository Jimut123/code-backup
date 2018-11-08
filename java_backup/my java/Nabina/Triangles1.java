import java.io.*;
class Triangles1
{
	public static void main(String args[])throws IOException
	{
		long  n,h,q1,q;
		int j;
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no.:");
		n=Integer.parseInt(input.readLine());
		j=0;
		h=100000;
		while(j<3)
		{
		q=n/h;
		//q1=q;
		System.out.println(q+"");
		n=n%h;
		h=h/10;
		j++;
		if(j==1)
		h=h/10;
		else
		if(j==2)
		h=1;
		}
		}
		}